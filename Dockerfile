FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/calorietracker-0.0.1-SNAPSHOT.jar calorietracker.jar
ENTRYPOINT ["java","-jar","/calorietracker.jar"]
