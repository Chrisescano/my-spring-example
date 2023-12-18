package com.pluralsight.myspringexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringExampleApplication implements CommandLineRunner {

	@Autowired @Qualifier("basic")
	SecretSantaDAO secretSantaDAO;

	public static void main(String[] args) {
		SpringApplication.run(MySpringExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SecretSantaLink secretSantaLink = secretSantaDAO.generateSecretSantaLink();
		System.out.println(secretSantaLink);
	}
}
