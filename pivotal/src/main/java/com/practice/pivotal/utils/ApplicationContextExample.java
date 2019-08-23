package com.practice.pivotal.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.pivotal.service.Person;

public class ApplicationContextExample {

	/**
	 * Application Context is a central interface to provide configuration for an
	 * application. This is read-only while the application is running, but may be
	 * reloaded if the implementation supports this. it provides -->
	 * 
	 * 
	 * 
	 * Bean factory methods for accessing application components(from
	 * ListableBeanFactory). The ability to load file resources in a generic
	 * fashion.(ResourceLoader interface). The ability to publish events to
	 * registered listeners.(ApplicationEventPublisher) .The ability to resolve
	 * messages, supporting internationalization. Inherited from the MessageSource
	 * interface.
	 */

	@Autowired
	private ApplicationContext context;

	public void example1() {
		Person p = (Person) context.getBean(Person.class);
	}

	/**
	 * ApplicationContext initialization
	 */
	public void AppilicationContextInitializationExample() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanDefinition.class);
	}

	/**
	 * ApplicationContext shutdown. Spring boot does call the function
	 * **contextDestroyed** in ContextLoaderListener which helps in closing of
	 * application context smootly
	 * 
	 * {@link} https://stackoverflow.com/questions/29169916/how-correctly-close-the-applicationcontext-in-spring
	 */
	public void AppilicationContextDestructionExample() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.registerShutdownHook();
	}

}
