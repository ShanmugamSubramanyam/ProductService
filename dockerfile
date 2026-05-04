# Use official OpenJDK or Temurin as base
FROM eclipse-temurin:17-jdk-alpine
# Create a dedicated directory
WORKDIR /ProductService
# Replace 'target/*.jar' with 'build/libs/*.jar' if using Gradle
COPY build/libs/*.jar ProductService-0.0.1-SNAPSHOT.jar
# Expose the default Spring Boot port
EXPOSE 5000
# Launch the application
ENTRYPOINT ["java", "-jar", "ProductService-0.0.1-SNAPSHOT.jar"]
