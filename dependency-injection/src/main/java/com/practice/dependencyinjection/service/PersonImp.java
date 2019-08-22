package com.practice.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class PersonImp implements Person {
	
	@Override
	public void showPersonInfo() {
		// TODO Auto-generated method stub
		System.out.println("inside PersonImp");
	}
}
