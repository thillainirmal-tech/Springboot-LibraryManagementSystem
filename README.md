
# Spring Boot H2 Database Integration

This project demonstrates how to integrate **H2 in-memory database** with a **Spring Boot** application for lightweight and rapid development.

<br>

## ✨ Features
- Spring Boot application setup
- H2 in-memory database configuration
- Spring Data JPA integration
- Simple REST APIs to perform CRUD operations
- H2 Console enabled for database inspection

<br>

## 🛠️ Tech Stack
- Java 17+ (or 11+)
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven / Gradle

<br>

## 📂 Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── controller/
│   │       ├── entity/
│   │       ├── repository/
│   │       └── DemoApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql (optional)
└── test/
```

<br>

## ⚙️ Configuration

**`application.properties`**
```properties
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA Settings
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

# Enable H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

<br>

## 🚀 Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/thillainirmal-tech/Library--Management-using-springboot-.git
   cd Library--Management-using-springboot-
   ```

2. Build and run the project:
   ```bash
   ./mvnw spring-boot:run
   ```
   or using Gradle:
   ```bash
   ./gradlew bootRun
   ```

3. Access H2 Console:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: *(leave blank)*

<br>

## 📬 Sample REST Endpoints

| HTTP Method | URL | Description |
| :--- | :--- | :--- |
| GET | `/api/entities` | Get all entities |
| POST | `/api/entities` | Create a new entity |
| GET | `/api/entities/{id}` | Get entity by ID |
| PUT | `/api/entities/{id}` | Update entity |
| DELETE | `/api/entities/{id}` | Delete entity |

<br>

## 📚 References
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [H2 Database Documentation](http://www.h2database.com/html/main.html)

<br>

## 🧑‍💻 Author
**K. Thillai Nirmal**  
- GitHub: [@thillainirmal-tech](https://github.com/thillainirmal-tech)

<br>

