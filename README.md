# CALCREWLATOR

## DATABASE

The database for **Calcrewlator** uses **PostreSQL**.

## BACKEND

The backend for **Calcrewlator** is built in **Java** using **Spring Boot**.

## FRONTEND

The frontend for **Calcrewlator** is built with **React** on top of **JavaScript**.

## MIDDLEWARE

### Connecting to the database
The middleware which connects the backend to the database uses **JPA**. 

### Connecting to the frontend
We use a client-server architecture to connect the frontend to the backend. The backend sets up **REST** API hooks using **Tomcat** which allows the frontend to make GET/POST **HTTP** requests.
