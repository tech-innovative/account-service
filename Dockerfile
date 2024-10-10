FROM eclipse-temurin:20.0.2_9-jre
WORKDIR /work
COPY account-service.jar account-service.jar
ENTRYPOINT ["java","-jar","account-service.jar"]