package com.learning.springCoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.learning.util","com.learning.springCoreDemo"})
@SpringBootApplication
public class SpringCoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoredemoApplication.class, args);
	}

}
