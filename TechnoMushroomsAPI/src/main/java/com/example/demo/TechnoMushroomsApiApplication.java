package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.technomushrooms")
@ComponentScan(basePackages = "com.technomushrooms")
@EnableJpaRepositories(basePackages = "com.technomushrooms.repository")
@EntityScan(basePackages = "com.technomushrooms.model")
public class TechnoMushroomsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnoMushroomsApiApplication.class, args);
	}

}

