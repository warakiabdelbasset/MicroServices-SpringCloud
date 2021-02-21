# MicroServices-SpringCloud
Realization of MicroServices with JEE, Spring Boot, Spring Security, Spring Cloud and Angular

Each folder have a separate microservice from other, but they are linked by one microservice so they can get , post and transfer data so in the finale we have a complete website that use multiple services 

# Introduction
As part of the Architecture of Micro Services Applications of the 5th year EMSI (Moroccan School of Engineering Sciences) training, a project is to be carried out to put into practice the knowledge acquired and discover the operation of a modern application.
A Micro-Services application consists of breaking up a large application into small pieces of code, independent business programs that are developed, tested and deployed separately and that can be written in different languages. These Micro-Services are managed by other functional application management Micro-Services.
The idea is to create an invoice management program that will be organized as follows:
- A Micro-Service Customer Service
- A Micro-Service Inventory Service
- A Micro-Service Billing Service
- A Micro-Service Gateway for traffic management
- A Micro-Service Eureka Discovery Service as an application directory
- An authentication Micro-Service based on Spring Security and Json Web Token
As well as a part whose goal is to secure the Front and Backend parts of an application with Keycloak.

# Micro-services architecture

1. Create the Customer-service micro service

• Create the Customer entity
• Create the CustomerRepository interface based on Spring Data
• Deploy the Restful API of the micro-service using Spring Data Rest
• Test the Micro service

2. Create the Inventory-service micro service

• Create the Product entity
• Create the ProductRepository interface based on Spring Data
• Deploy the Restful API of the micro-service using Spring Data Rest
• Test the Micro service

3. Create the Gateway service using Spring Cloud Gateway

4. Create the Discovery Service directory based on NetFlix Eureka Server

6. Create the Billing Service

7. Create a Statless authentication service based on Spring Security and Json Web Token. This service should make it possible to:

• Manage users and roles of the application
• Authenticate a user by delivering an access Token and a JWT type refresh Token
• Manage access authorizations
• Renew access Token using the refresh Token

