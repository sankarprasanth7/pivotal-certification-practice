package com.practice.pivotal.service;

import org.springframework.stereotype.Service;

/**
 * @Service is a stereotype. It will register class as a spring bean
 * @Service is a stereotype for the service layer.
 */
@Service
public class PersonImp implements Person {

	@Override
	public void showPersonInfo() {
		// TODO Auto-generated method stub
		System.out.println("inside PersonImp");
	}
}
