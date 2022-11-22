# CALCREWLATOR
Welcome to **CALCREWLATOR**. This is a web-app designed to keep track of all rowing metrics, whether it be keeping track of practices and workouts, storing force and length data, or logging race results. The Calcrewlator will be able to perform analyses on top of all of these stored metrics and make it easier for coaches and staff to design practices and create lineups.

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
