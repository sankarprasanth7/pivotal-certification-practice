package com.practice.dependencyinjection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.dependencyinjection.service.Person;

@Component
public class City2 {

	// Setter based dependency injection
	/**
	 * In this approach, the @Autowired annotation is applied on a Setter to inject
	 * person object as follows.
	 * 
	 */

	private Person person;

	/**
	 * While this component loads into to spring IOC, dependency injection happens
	 * and person gets injected into it with the help of setter.
	 */

	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}

	public void showInfo() {
		person.showPersonInfo();
	}
}
