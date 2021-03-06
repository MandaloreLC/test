FROM openjdk:11.0.2-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081/tcp
ENTRYPOINT ["java", "-jar", "/app.jar"]