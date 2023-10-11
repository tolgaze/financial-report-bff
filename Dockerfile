FROM amazoncorretto:17-alpine-jdk
EXPOSE 9000
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]