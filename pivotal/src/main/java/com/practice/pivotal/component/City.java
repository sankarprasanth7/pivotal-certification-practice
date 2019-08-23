package com.practice.pivotal.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.pivotal.service.Person;

/**
 * Component is a stereotype. It will register classs as a spring bean
 * 
 * @Component is a generic stereotype for any Spring-managed component or bean.
 * @Repository is a stereotype for persistence layer.
 * @Service is a stereotype for the service layer.
 * @Controller is a stereotype for presentation layer (spring-MVC).
 */
@Component
public class City {

	// Constructor based dependency injection
	/**
	 * In this approach, the @Autowired annotation is applied on a bean constructor
	 * to inject person object as follows.
	 * 
	 */

	private Person person;

	/**
	 * While this component loads into to spring IOC, dependency injection happens
	 * and person gets injected into it.
	 */

	@Autowired
	public City(Person person) {
		this.person = person;
	}

	public void showInfo() {
		person.showPersonInfo();
	}
}
