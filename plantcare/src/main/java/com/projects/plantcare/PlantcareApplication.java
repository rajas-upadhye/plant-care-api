package com.projects.plantcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlantcareApplication {
	public static void main(String[] args) {
		System.out.println("Starting service :: Plant Care");
		SpringApplication.run(PlantcareApplication.class, args);
		System.out.println("Started service :: Plant Care");
	}
}
