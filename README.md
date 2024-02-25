# Spring Boot Microservices

## Project Overview

This Spring Boot project is a microservices architecture that utilizes various technologies such as Java Spring Boot, Kafka, Eureka, MongoDB, and PostgreSQL. The project consists of six different microservices:

1. **Product Service**
2. **Order Service**
3. **Inventory Service**
4. **ApiGateway Service**
5. **Discovery Server**
6. **Notification Service**

The primary functionality involves handling product details, managing orders, tracking inventory, routing through the API Gateway, service discovery with Eureka, and sending notifications using Kafka.

## Architecture Diagram
![architecture_diagram drawio](https://github.com/m-ayan-k/SpringBoot-Microservice/assets/72690358/0ce7d204-5b18-43c1-ad87-dfc62ccbc6d0)


## Microservices Details

### 1. Product Service

- **Description:**
  - Manages product details.
- **Endpoints:**
  - GET: `/api/product` - Retrieve product information.
  - POST: `/api/product` - Store product data in MongoDB.

### 2. Order Service

- **Description:**
  - Handles order creation and communicates with the Inventory Service using async communication and circuit breaker.
- **Endpoints:**
  - POST: `/api/order` - Create an order with a list of items. Internally communicates with the Inventory Service.
- **Database:**
  - PostgreSQL for order data.

### 3. Inventory Service

- **Description:**
  - Manages inventory and handles async communication from the Order Service.
- **Endpoints:**
  - GET: `/api/inventory` - Return whether a item is in stock or not.
- **Database:**
  - PostgreSQL for inventory data.

### 4. ApiGateway Service

- **Description:**
  - Routes requests to different services (Product, Order, etc.).

### 5. Discovery Server

- **Description:**
  - Eureka service registry for service discovery.

### 6. Notification Service

- **Description:**
  - Handles notifications, particularly sending emails after successful order creation.
- **Communication:**
  - Receives events from the Order Service via Kafka.
- **Notification Method:**
  - Sends emails or processes order ID.

## Running the Project Locally

Follow these steps to set up and run the microservices on your local environment:

1. Run `mvn clean verify -DskipTests` by going inside each folder to build the applications.
2. After that run `mvn spring-boot:run` by going inside each folder to start the applications.

## Credits

This project was inspired by and built following the tutorial from [Spring Boot Microservice Project](https://www.youtube.com/watch?v=mPPhcU7oWDU&t=20634s).
Feel free to check out the tutorial for more in-depth explanations and insights.
