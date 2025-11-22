
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy JAR into container
COPY target/oracle-reg-app-0.0.1-SNAPSHOT.jar app.jar

# Expose default Spring Boot port
EXPOSE 8080

# Start Spring Boot
ENTRYPOINT ["java","-jar","app.jar"]
