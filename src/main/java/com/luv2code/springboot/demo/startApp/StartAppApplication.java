package com.luv2code.springboot.demo.startApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication annotation consists of 
// @EnableAutoConfiguration
// @ComponentScan
// @Configuration

@SpringBootApplication(
		scanBasePackages = (
				"com.luv2code.springboot.demo.startApp"
				)
		)
public class StartAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartAppApplication.class, args);
	}

}
