FROM openjdk:8-jre-alpine
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar
EXPOSE 9005
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
