package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	@PostConstruct
	public void init(){
		log.info("Application started");
	}

	public static void main(String[] args) {
		log.info("Application in executed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
