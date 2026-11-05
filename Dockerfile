
FROM eclipse-temurin:25-jdk

WORKDIR /app

# Copy project files
COPY . .

# Build Spring Boot application
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Run the generated JAR
RUN cp target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
