package com.JPA.connectivity.Entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

	
	@Bean
	public Demo2 getbean()
	{
		return new Demo2();
	}
}
