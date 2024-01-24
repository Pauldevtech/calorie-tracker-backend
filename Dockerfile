# Start with a base image containing Java runtime
FROM eclipse-temurin:17-jre-alpine

# Copy the packaged jar file from target directory to Docker image
COPY target/calorietracker-0.0.1-SNAPSHOT.jar /app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
