package com.practice.pivotal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PivotalApplicationTests {

	/**
	 * The Spring Expression Language (SpEL) is a powerful expression language that
	 * supports querying and manipulating an object graph at runtime. It can be used
	 * with XML or annotation-based Spring configurations.
	 * 
	 */
	/**
	 * @value is used to assign value to a variable taken from other source
	 * 
	 *        $ is used for picking value from application properties # is used to
	 *        evaluate the expression
	 */

	@Value("#{'${jdbc.user_name}'}")
	private String jdbcUserName;

	@Value("${jdbc.user_name}")
	private String jdbcUserName1;

	/**
	 * In Spring EL, you can reference a bean, and nested properties using a ‘dot
	 * (.)‘ symbol. For example, “bean.property_name“.
	 */
	@Value("#{personBean.age}")
	private int age;

	@Test
	public void contextLoads() {
	}

}
