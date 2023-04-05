FROM openjdk:17-alpine
ADD target/spring-ci-cd-new.jar spring-ci-cd-new.jar
ENTRYPOINT ["java","-jar","spring-ci-cd-new.jar"]
EXPOSE 8080