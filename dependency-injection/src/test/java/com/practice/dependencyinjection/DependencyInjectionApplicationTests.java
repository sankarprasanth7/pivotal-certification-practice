package com.practice.dependencyinjection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.practice.dependencyinjection.component.City;
import com.practice.dependencyinjection.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DependencyInjectionApplicationTests {

	@Autowired
	City city;

	@Test
	public void contextLoads() {
		city.showInfo();
	}

}
