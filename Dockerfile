FROM openjdk:8-jre-slim
WORKDIR /app
COPY ./target/gs-rest-service-0.1.0.jar /app/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]