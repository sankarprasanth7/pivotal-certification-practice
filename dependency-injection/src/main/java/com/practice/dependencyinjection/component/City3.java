package com.practice.dependencyinjection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.dependencyinjection.service.Person;
import com.practice.dependencyinjection.service.PersonImp;

@Component
public class City3 {

	// Field based dependency injection
	/**
	 * In this approach, the @Autowired annotation is applied on a field to inject
	 * person object as follows.
	 * 
	 */
	@Autowired
	private PersonImp person;

	public void showInfo() {
		person.showPersonInfo();
	}
}
