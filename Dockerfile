FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY ./target/DockerDemo-0.0.1-SNAPSHOT.jar ./spring.jar
ENTRYPOINT ["java", "-jar", "spring.jar"]