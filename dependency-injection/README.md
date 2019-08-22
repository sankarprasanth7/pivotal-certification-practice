## Dependency Injection(DI)

Dependency Injection is the process of providing dependencies to other object.By DI, the responsibility of creating objects is shifted from our application code to the Spring container; this phenomenon is called IOC.

Dependency Injection with **@Autowired** annotation

- Constructor based dependency injection (Refer to [**city.java**](https://github.com/sankarprasanth7/pivotal-certification-practice/blob/a6dc2d846524ee9ea1a4fb4bc007be8c03b55fd6/dependency-injection/src/main/java/com/practice/dependencyinjection/component/City.java#L25))
- Setter based dependency injection (Refer to **city2.java**)
- Field dependency Injection (Refer to **city3.java**)


Dependency injection using **Java configuration**

- With Java config approach, you don’t put annotations into your business classes anymore. Instead, you write a separate Java configuration class to configure the dependency injection by instantiating the objects directly.(Refer to **AppConfig**)



