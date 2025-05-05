# S4.02-APIRESTSpringBoot-Nivel1

CRUD with Spring Boot and H2

This is a Spring Boot project built with Maven as the dependency manager.
It implements a complete CRUD for a Fruit entity and follows the MVC pattern, using REST best practices and persistence with an in-memory H2 database.

## Requirements

- Java JDK (minimum version 17)
- Maven installed
- Postman (or another HTTP client) to test endpoints


## How to run the application

1. Clone this repository or download the project.
2. Open a terminal in the project root directory.
3. Run the following Maven command:

```bash
mvn spring-boot:run
```

## API Endpoints

This API has been tested using Postman.

## H2 Console 
You can access the H2 console at:

bash
Copy
Edit
http://localhost:8081/h2-console

Configuration:

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (empty)

## Useful Maven Commands

```bash
mvn compile: Compiles the project.

mvn package: Packages the project as a JAR.

mvn clean: Cleans up the compiled files.

mvn spring-boot:run: Runs the Spring Boot application.
