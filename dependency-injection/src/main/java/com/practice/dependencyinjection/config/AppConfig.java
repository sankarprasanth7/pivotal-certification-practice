package com.practice.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.dependencyinjection.service.Person;
import com.practice.dependencyinjection.service.PersonImp;

@Configuration
@ComponentScan(basePackages = "com.practice.dependencyinjection.config")
public class AppConfig {

	/**
	 * Here, the AppConfig class is marked with the@Configuration annotation
	 * indicates that this class will be processed by Spring IoC (Inversion of
	 * Control) container to generate bean instances based on the @Bean methods.
	 */

	/**
	 * Once it was loaded we can get the bean with the help of bean name
	 */

	@Bean("personBean")
	public Person getPerson(Person person) {
		return new PersonImp();
	}
}
