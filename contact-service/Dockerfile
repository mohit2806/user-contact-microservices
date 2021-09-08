FROM openjdk:8-jre-alpine
COPY target/contact-service-0.0.1-SNAPSHOT.jar contact-service.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "contact-service.jar"]
