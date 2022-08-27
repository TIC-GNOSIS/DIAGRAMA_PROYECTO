package com.juanma.kikeana;

import com.juanma.kikeana.entity.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KikeanaApplication implements CommandLineRunner {

	private Enterprise enterprise;

	@Autowired
	public KikeanaApplication(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public static void main(String[] args) {
		SpringApplication.run(KikeanaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		enterprise.setAddress("Calle falsa numero 123");
		System.out.println(enterprise.getAddress());
	}

}