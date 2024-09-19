package com.solibook.solibook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.solibook.solibook.*")
public class SolibookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolibookApplication.class, args);
	}

}
