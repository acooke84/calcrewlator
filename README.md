# CALCREWLATOR
Welcome to **CALCREWLATOR**. This is a web-app designed to keep track of all rowing metrics, whether it be keeping track of practices and workouts, storing force and length data, or logging race results. The Calcrewlator will be able to perform analyses on top of all of these stored metrics and make it easier for coaches and staff to design practices and create lineups.

## ARCHITECTURE

### Database
The database for **Calcrewlator** uses **PostgreSQL**.

### Backend
The backend for **Calcrewlator** is built in **Java** using **Spring Boot**.

### Frontend
The frontend for **Calcrewlator** is built with **React** on top of **JavaScript**.

### Middleware
**Connecting to the database**
The middleware which connects the backend to the database uses **JPA**. 

**Connecting to the frontend**
We use a client-server architecture to connect the frontend to the backend. The backend sets up **REST** API hooks using **Tomcat** which allows the frontend to make GET/POST **HTTP** requests.

## BUILDING

### Command line
From the command line, *cd* into the project directory. From there, run **mvn spring-boot:run**. In a second terminal window, *cd* into the *calcrewlator/frontend* directory. In that window, run npm install followed by npm start. This command will launch the frontend in your browser where you will be able to interact with **Calcrewlator**. 

To clean up, first hit *Ctrl+C* in the window which is running the frontend. Afterwards, also hit *Ctrl+C* in the window running the backend. This will stop the service.

### From VSCode
From VSCode, open the **CalcrewlatorApplication.java** file. This file should be runnable, and by running it you will spin up the backend. In order to start the frontend, follow the steps for starting the frontend from the command line.
