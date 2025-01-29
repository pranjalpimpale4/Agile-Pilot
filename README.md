# AgilePilot

This project is the back-end component of a Restful web application for Agile Manager. It is built using **Spring**, **Spring Boot**, and **Hibernate**, with **MySQL** as the persistence layer.  

## Setup Instructions

1. **Database Setup**:
   - Create a database in MySQL.
   - Update the database name, username, and password in `resources/application.properties`.

2. **Hibernate Configuration**:
   - Set the property `spring.jpa.hibernate.ddl-auto` in `application.properties` to `create` for the initial run. This will generate the database tables automatically.
   - After the first run, change the property to `update` to preserve data and continue using the application.

3. **Build and Run**:
   - Import the project into **IntelliJ IDEA Ultimate** for easy execution (supports Spring and Hibernate out of the box).
   - Alternatively, you can run it in other environments by including the required libraries.
   - Use **Maven** or **Gradle** for building the project.

## Project Structure

The project is structured following the **Spring framework** convention:
- `model`: Contains entity classes.
- `controller`: Handles HTTP requests and defines APIs.
- `services`: Contains business logic.
- `repository`: Handles database operations.

## Current Features

- Basic CRUD APIs for all controllers.
- Configured to utilize **Java 8** features.
- Compatible with both Maven and Gradle for builds.

## Planned Features

This project is a **work in progress**. Planned updates include:
- Additional APIs to extend functionality.
- Incorporating more advanced **Java 8** features.
- Adding **unit tests**, particularly for controller classes.
- Introducing **logging** and leveraging **AspectJ** where necessary.
- Improving API responses (currently plain text).
- Providing an **API description document**.
- Building a front-end and turning this into a full-fledged application.

## Notes

- Ensure you update `application.properties` appropriately before running the application.
- Make sure to switch `spring.jpa.hibernate.ddl-auto` from `create` to `update` after the initial run to avoid overwriting data.

---

Happy coding!
