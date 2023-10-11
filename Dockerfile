FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY . .
RUN mvnw clean package
EXPOSE 8080
CMD ["java", "-jar", "target/financial-report-bff.jar"]