CrudAPI
A simple Spring Boot application that provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on User entities, using MySQL as the database and Spring Data JPA for data access.
Table of Contents

Overview
Technologies Used
Prerequisites
Setup Instructions
Database Configuration
API Endpoints
Running the Application
Testing the API
Troubleshooting

Overview
This project is a REST API built with Spring Boot to manage User entities. Each User has an id, firstname, and lastname. The API supports creating, retrieving, updating, and deleting users, with data stored in a MySQL database. The application uses Spring Data JPA (JpaRepository) for database operations and Hibernate for automatic schema management.
Technologies Used

Spring Boot: Framework for building the REST API
Spring Data JPA: For database operations with JpaRepository
MySQL: Database for storing User data
Hibernate: For ORM and schema management
Maven: Dependency management and build tool

spring.jpa.hibernate.ddl-auto=update: Automatically creates/updates the user table based on the User entity.

Method
Endpoint
Description
Request Body / Parameters

POST
/api/users
Create a new user
JSON: { "firstname": "John", "lastname": "Doe" }


GET
/api/users
Retrieve all users
None


GET
/api/users/{id}
Retrieve a user by ID
Path variable: id (e.g., 1)


PUT
/api/users
Update an existing user
JSON: { "id": 1, "firstname": "Jane", "lastname": "Doe" }


DELETE
/api/users/{id}
Delete a user by ID
Path variable: id (e.g., 1)

