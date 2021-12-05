FROM openjdk:11.0.8-jre-slim
WORKDIR app
ARG JAR_FILE=build/libs/dietxurl*.jar
COPY ${JAR_FILE} app.jar

ARG ENVIRONMENT
ENV SPRING_PROFILES_ACTIVE=${ENVIRONMENT}

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]