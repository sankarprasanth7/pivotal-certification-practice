package com.practice.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.dependencyinjection.service.PersonImp;

@Configuration
@ComponentScan(basePackages = "com.practice.dependencyinjection.config")
public class AppConfig {

	// Field based dependency injection
	/**
	 * In this approach, the @Autowired annotation is applied on a field to inject
	 * person object as follows.
	 * 
	 */
	@Autowired
	PersonImp Person;
}
