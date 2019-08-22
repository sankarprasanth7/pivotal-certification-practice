package com.practice.dependencyinjection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.dependencyinjection.service.Person;

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
