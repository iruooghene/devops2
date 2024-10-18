

FROM maven:3.8.7 as build
COPY .. .
RUN mvn -B clean package -DskipTests
FROM openjdk:17
COPY --from=build /target/*.jar  devops2.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=8088", "devops2.jar"]