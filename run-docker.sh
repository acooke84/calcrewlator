#!/bin/bash

mvn clean
mvn install
docker build -t calcrewlator.jar .
docker-compose up