FROM amazoncorretto:17-alpine-jdk
EXPOSE 9000
ARG JAR_FILE=target/financial-report-bff.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]