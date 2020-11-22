FROM openjdk:14-alpine
COPY target/first-micronaut-*.jar first-micronaut.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "first-micronaut.jar"]