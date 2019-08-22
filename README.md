# pivotal-certification-spring-practice

Here will discuss all the topics that were required for pivotal spring certification practically

### Container, Dependency, and IOC

list of all topics

- What is dependency injection and what are the advantages ?  [Refer Here](https://github.com/sankarprasanth7/pivotal-certification-practice/tree/master/dependency-injection)
- What is an interface and what are the advantages of making use of them in Java?. Why are they recommended for Spring beans?

  A particular advantage of using interface in Java is that it allows multiple inheritance. The full power of Interface is     utilized when dependency injection techniques is used to inject required implementation on run time.
  
- What is meant by “application-context?
- How are you going to create a new instance of an ApplicationContext?
- Can you describe the lifecycle of a Spring Bean in an ApplicationContext?
- How are you going to create an ApplicationContext in an integration test?
- What is the preferred way to close an application context? Does Spring Boot do this for
you?
- Can you describe:
- Dependency injection using Java configuration?  [Refer Here](https://github.com/sankarprasanth7/pivotal-certification-practice/tree/master/dependency-injection)
- Dependency injection using annotations (@Autowired)? [Refer Here](https://github.com/sankarprasanth7/pivotal-certification-practice/tree/master/dependency-injection)
- Component scanning, Stereotypes?
- Scopes for Spring beans? What is the default scope?
- Are beans lazily or eagerly instantiated by default? How do you alter this behavior?
- What is a property source? How would you use @PropertySource?
What is a BeanFactoryPostProcessor and what is it used for? When is it invoked?
- Why would you define a static @Bean method?
- What is a ProperySourcesPlaceholderConfigurer used for?
- What is a BeanPostProcessor and how is it different to a BeanFactoryPostProcessor?
What do they do? When are they called?
- What is an initialization method and how is it declared on a Spring bean?
- What is a destroy method, how is it declared and when is it called?
- Consider how you enable JSR-250 annotations like @PostConstruct and
@PreDestroy? When/how will they get called?
- How else can you define an initialization or destruction method for a Spring bean?
- What does component-scanning do?
- What is the behavior of the annotation @Autowired with regards to field injection,
constructor injection and method injection?
- What do you have to do, if you would like to inject something into a private field? How does
this impact testing?
- How does the @Qualifier annotation complement the use of @Autowired?
- What is a proxy object and what are the two different types of proxies Spring can create?
- What are the limitations of these proxies (per type)?
- What is the power of a proxy object and where are the disadvantages?
- What does the @Bean annotation do?
- What is the default bean id if you only use @Bean? How can you override this?
- Why are you not allowed to annotate a final class with @Configuration
- How do @Configuration annotated classes support singleton beans?
- Why can’t @Bean methods be final either?
- How do you configure profiles? What are possible use cases where they might be useful?
- Can you use @Bean together with @Profile?
- Can you use @Component together with @Profile?
- How many profiles can you have?
- How do you inject scalar/literal values into Spring beans?
- What is @Value used for?
- What is Spring Expression Language (SpEL for short)?
- What is the Environment abstraction in Spring?
- Where can properties in the environment come from – there are many sources for
properties – check the documentation if not sure. Spring Boot adds even more.
- What can you reference using SpEL?
- What is the difference between $ and # in @Value expressions?
