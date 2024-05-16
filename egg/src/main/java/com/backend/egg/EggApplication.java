package com.backend.egg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
public class EggApplication {

	public static void main(String[] args) {

		SpringApplication.run(EggApplication.class, args);


	}

}
