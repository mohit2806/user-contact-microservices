FROM openjdk:8-jre-alpine
COPY target/discovery-service-0.0.1-SNAPSHOT.jar discovery-service.jar
EXPOSE 9005
ENTRYPOINT ["java", "-jar", "discovery-service.jar"]
