package com.practice.pivotal.component;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 *  <h1>Environment Abstraction</h1>
 * The Spring environment abstraction integrates and searches over a
 * configurable hierarchy of property sources, consolidated under a
 * PropertySources interface, each implementing PropertySource. The mechanism is
 * configurable, custom property sources can be integrated.
 * 
 * The environment is an abstraction integrated in the container that models two
 * key aspects of the application environment: configuration properties and
 * profiles.
 * 
 * 
 * @see <a href=
 *      "https://kb.novaordis.com/index.php/Spring_Property_Injection_Concepts">Environment
 *      abstraction</a>
 * 
 */

/**
 * <h1>@Profile</h1>
 * 
 * Consider a basic scenario – we have a bean that should only be active during
 * development, but not deployed in production. We annotate that bean with a
 * “dev” profile, and it will only be present in the container during
 * development – in production, the dev simply won't be active:
 * 
 */
@Component
@Profile("dev")
public class ProjectDetails implements EnvironmentAware {

	private String projectName;

	@Override
	public void setEnvironment(Environment environment) {
		this.projectName = environment.getProperty("project.name");
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}