FROM openjdk:17-jdk-slim
ADD target/calcrewlator.jar calcrewlator.jar
ENTRYPOINT ["java", "-jar", "calcrewlator.jar"]
EXPOSE 8080