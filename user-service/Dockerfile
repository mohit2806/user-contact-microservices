FROM openjdk:8-jre-alpine
COPY target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
EXPOSE 9001
CMD /usr/bin/java -jar user-service.jar