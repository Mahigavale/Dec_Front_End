package com.JPA.connectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ConnectivityApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ConnectivityApplication.class, args);
	}

}
