package com.technomushrooms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.technomushrooms")
public class TechnoMushroomsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TechnoMushroomsApplication.class, args);
    }
}
