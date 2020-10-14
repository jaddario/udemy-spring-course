package com.luv2code.springdemo.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = new String[3];
	private Random random = new Random();

	@PostConstruct
	public void readFile() {
		File file = new File("/home/addario/Documentos/Estudo/SpringFramework - Udemy/fortuneFile.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			StringBuilder texto = new StringBuilder();
			String linha = "";
			while ((linha = reader.readLine()) != null) {
				texto.append(linha);
			}
			reader.close();

			data = texto.toString().split(",");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		return data[index];
	}

}
