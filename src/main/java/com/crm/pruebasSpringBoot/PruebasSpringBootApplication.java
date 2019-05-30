package com.crm.pruebasSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.crm.pruebasSpringBoot")
public class PruebasSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasSpringBootApplication.class, args);
	}

}
