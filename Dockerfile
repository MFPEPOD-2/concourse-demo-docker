FROM openjdk:8-alpine
COPY target/SpringBootDemo-0.0.1-SNAPSHOT.jar ./
EXPOSE 8081
ENTRYPOINT ["java","-jar","SpringBootDemo-0.0.1-SNAPSHOT.jar"]