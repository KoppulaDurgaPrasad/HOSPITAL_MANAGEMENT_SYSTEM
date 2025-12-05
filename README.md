# 🏥 Hospital Management System

This project is a basic **Spring Boot + Spring Data JPA** setup created for learning and practicing backend concepts.  
It does **not** contain any controllers or REST APIs.  
The main purpose of this project is to help you understand:

- Spring Boot project structure  
- Spring Data JPA  
- Hibernate ORM  
- MySQL database integration  
- Maven dependency management  

---

## 🚀 Tech Stack

| Layer               | Technology                 |
| ------------------- | -------------------------- |
| Language            | **Java 21**                |
| Framework           | **Spring Boot 3.3.4**      |
| ORM                 | **Hibernate / JPA**        |
| Database            | **MySQL**                  |
| Build Tool          | **Maven**                  |
| Boilerplate Removal | **Project Lombok**         |
| Testing             | JUnit 5 + Spring Boot Test |
| Layer               | Technology                 |
| ------------------- | -------------------------- |

---

## 📁 Project Structure

```
HospitalManagementSystem/
├── src/main/java/
│ └── com.SpringDataJPA.HospitalManagementSystem
│ └── HospitalManagementSystemApplication.java
│
├── src/main/resources/
│ ├── application.properties
│ └── static/ (empty unless you add files)
│
├── pom.xml
├── HELP.md
├── .gitignore
├── mvnw
└── mvnw.cmd

```
---

## 📌 Database Setup

Before running the application, create the database in MySQL:

```sql
CREATE DATABASE hospitaldb;
```

## Add your database configuration inside application.properties:

```
spring.datasource.url=jdbc:mysql://localhost:3306/hospitaldb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update 
spring.jpa.show-sql=true

```
---

## ▶️ How to Run the Project
1. Build the project
- mvn clean install

2. Start the application
- mvn spring-boot:run

---

## 📄 Important Files
✔ pom.xml

Contains all required dependencies such as:

- Spring Boot Starter JPA
- MySQL Connector
- Lombok
- Spring Boot Starter Web
- Testing libraries

✔ .gitignore

Configured to exclude:
- IDE files
- Maven target folder
- Build files
- Wrapper files

✔ HELP.md

Automatically generated help file with useful Spring Boot documentation references.

---

# 🎯 Purpose of This Project

This project is designed to help you learn and practice:
- Creating JPA Entities
- Creating Repositories
- Understanding ORM and JPA behavior
- Working with MySQL
- Using JPA relationships ( Mapping relationships (OneToOne, OneToMany, ManyToMany))
- Understanding Spring Boot structure
