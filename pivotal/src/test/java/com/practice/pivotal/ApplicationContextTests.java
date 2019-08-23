package com.practice.pivotal;

import org.springframework.test.context.ContextConfiguration;

import com.practice.pivotal.config.AppConfig;

/**
 * @ContextConfiguration is helpful for defining the context of application in
 *                       integration tests. Specifically, @ContextConfiguration
 *                       declares the application context resource locations or
 *                       the annotated classes that will be used to load the
 *                       context.
 * 
 *                       Resource locations are typically XML configuration
 *                       files located in the classpath
 * 
 * @ContextHierarchy({ 
 * 		@ContextConfiguration(classes = AppConfig.class),
 * 		@ContextConfiguration(classes = WebConfig.class) 
 * })
 */
@ContextConfiguration(classes = AppConfig.class)
public class ApplicationContextTests {

}
