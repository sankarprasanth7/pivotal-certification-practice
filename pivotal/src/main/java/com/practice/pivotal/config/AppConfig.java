package com.practice.pivotal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.practice.pivotal.service.Person;
import com.practice.pivotal.service.PersonImp;

@Configuration
/**
 * Once you define a Component Scan for a package, Spring would search the
 * package and all its sub packages for components/beans.
 */
@ComponentScan(basePackages = "com.practice.dependencyinjection.config")
public class AppConfig {

	/**
	 * Spring IoC container is also responsible for managing the Spring Bean Life
	 * Cycle, the life cycle of beans consist of call back methods such as Post
	 * initialization call back method and Pre destruction call back method.
	 * 
	 * Spring Bean Life Cycle Creation of bean instance by a factory method. Set the
	 * values and bean references to the bean properties. Call the initialization
	 * call back method. Bean is ready for use. Call the destruction call back
	 * method.
	 */

	@Bean("personBean")
	public Person getPerson(Person person) {
		return new PersonImp();
	}

	/**
	 * Suppose we have externalized properties to some other file and we want get
	 * all those properties then we can use **PropertyPlaceHolderConfigurer**
	 */
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("config.properties"));
		// propertySourcesPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
		// propertySourcesPlaceholderConfigurer.setIgnoreResourceNotFound(true);
		return propertySourcesPlaceholderConfigurer;
	}
}
