package com.practice.pivotal.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Spring Bean has multiple scopes(SSRPG)
 * 
 * singleton(default): single bean definition to a single object instance'
 * prototype: single bean definition to any number of object instances. request:
 * Scopes a single bean definition to the lifecycle of a single HTTP request
 * session: Scopes a single bean definition to the lifecycle of a HTTP Session.
 * global session: Scopes a single bean definition to the lifecycle of a global
 * HTTP Session.
 */

@Service
@Scope("prototype")
/**
 * By default, Spring “application context” eagerly creates and initializes all
 * ‘singleton scoped‘ beans during application startup itself. In order to get
 * lazy loading we need to provide @Lazy Annotation
 */
@Lazy
/**
 * In Spring, you can use @PropertySource annotation to externalize your
 * configuration to a properties file.
 */
@PropertySource("classpath:config.properties")
public class ThreadProcesses implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in prototypical scope");
	}

}