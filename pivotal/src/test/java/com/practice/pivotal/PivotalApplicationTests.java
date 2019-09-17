package com.practice.pivotal;

import java.util.Map;

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
	 * @see <a href="https://www.baeldung.com/spring-expression-language">SpEL<a>
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
	

	/**
	 * Inject Maps and arrays With Spring’s @Value
	 * 
	 * app.collection.strings.property=one, two, three
	 * app.collection.map.string.to.integer={one:"1", two:"2", three:"3"}
	 * 
	 * @see <a href="https://relentlesscoding.com/2018/09/09/spring-basics-dynamically-inject-values-with-springs-value/"> @Value <a>
	 * 
	 */

	@Value("${app.collection.strings.property}")
	private String[] stringArrayProperty;

	@Value("#{${app.collection.map.string.to.integer}}")
	private Map<String, Integer> mapStringToInteger;

	@Test
	public void contextLoads() {
	}

}
