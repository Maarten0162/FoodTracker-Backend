# Use OpenJDK 21 LTS lightweight image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy Maven wrapper and pom.xml first to leverage Docker caching
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Pre-download dependencies to cache them
RUN ./mvnw dependency:go-offline -B

# Copy the rest of your source code
COPY src ./src

# Build the Spring Boot application (skip tests for faster build; remove -DskipTests if you want tests)
RUN ./mvnw clean package -DskipTests

# Expose default Spring Boot port
EXPOSE 8080

# Run the JAR file produced by Maven
CMD ["java", "-jar", "target/FoodTracker-Frontend-1.0.0.jar"]