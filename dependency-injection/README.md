## Dependency Injection(DI)

Dependency Injection is the process of providing dependencies to other object.By DI, the responsibility of creating objects is shifted from our application code to the Spring container; this phenomenon is called IOC.

Dependency Injection with **@Autowired** annotation

- Constructor based dependency injection (Refer to [city.java](https://github.com/sankarprasanth7/pivotal-certification-practice/blob/a6dc2d846524ee9ea1a4fb4bc007be8c03b55fd6/dependency-injection/src/main/java/com/practice/dependencyinjection/component/City.java#L25))
- Setter based dependency injection (Refer to [city2.java](https://github.com/sankarprasanth7/pivotal-certification-practice/blob/01eb341f2297128d0f37180a1ffc20e73cf15ace/dependency-injection/src/main/java/com/practice/dependencyinjection/component/City2.java#L25))
- Field dependency Injection (Refer to [city3.java](https://github.com/sankarprasanth7/pivotal-certification-practice/blob/01eb341f2297128d0f37180a1ffc20e73cf15ace/dependency-injection/src/main/java/com/practice/dependencyinjection/component/City3.java#L18))


Dependency injection using **Java configuration**

- With Java config approach, you don’t put annotations into your business classes anymore. Instead, you write a separate Java configuration class to configure the dependency injection by instantiating the objects directly.(Refer to [AppConfig](https://github.com/sankarprasanth7/pivotal-certification-practice/blob/01eb341f2297128d0f37180a1ffc20e73cf15ace/dependency-injection/src/main/java/com/practice/dependencyinjection/config/AppConfig.java#L25))

Advantages of dependency injection
- Dependency Carrying is reduced.
- Reusability of code which reduces reduduncy errors
- Easy to test and develop


