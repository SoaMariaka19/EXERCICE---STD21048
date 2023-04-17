package com.exercice.std21048;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.exercice.std21048.model"})
public class Std21048Application {

	public static void main(String[] args) {
		SpringApplication.run(Std21048Application.class, args);
	}

}
