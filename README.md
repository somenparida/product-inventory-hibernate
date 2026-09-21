# Product Inventory System

A Java-based Product Inventory Management System developed using **Maven, Hibernate ORM, and PostgreSQL**. The application demonstrates database connectivity and complete CRUD (Create, Read, Update, Delete) operations using Hibernate.

## 📌 Project Overview

The Product Inventory System allows users to manage product information stored in a PostgreSQL database.

The application uses:

- Java 17
- Maven
- Hibernate ORM
- PostgreSQL
- PostgreSQL JDBC Driver
- Jakarta Persistence API

Hibernate is used as the ORM layer to map the Java `Product` entity to the PostgreSQL `products` table.

---

## 🚀 Features

- Add new products
- Retrieve a product using its ID
- Retrieve all products
- Update product details
- Delete products
- Automatic database table creation/update using Hibernate
- PostgreSQL database integration
- Maven dependency management
- Hibernate SQL logging

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java 17 | Application development |
| Maven | Build and dependency management |
| Hibernate ORM 6.6.58.Final | Object-Relational Mapping |
| PostgreSQL | Relational database |
| PostgreSQL JDBC 42.7.13 | Database connectivity |
| Jakarta Persistence | Entity mapping |
| Eclipse IDE | Development environment |
| Git & GitHub | Version control |

---

## 📂 Project Structure

```text
product-inventory
│
├── .gitignore
├── README.md
├── pom.xml
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── inventory
│   │   │           ├── App.java
│   │   │           ├── HibernateUtil.java
│   │   │           ├── MainProgram.java
│   │   │           ├── Product.java
│   │   │           └── ProductDAO.java
│   │   │
│   │   └── resources
│   │       └── hibernate.cfg.xml.example
│   │
│   └── test
│
└── .mvn