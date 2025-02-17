FROM eclipse-temurin:17.0.14_7-jre-jammy

WORKDIR /app

COPY build/libs/Nikke-Hub-Gateway-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]