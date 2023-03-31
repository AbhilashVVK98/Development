package com.demo.sceduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Scheduler1Application {

	public static void main(String[] args) {
		SpringApplication.run(Scheduler1Application.class, args);
	}

}
