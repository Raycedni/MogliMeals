#FROM maven:3-openjdk-18-slim AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package


FROM gcr.io/distroless/java17-debian11
COPY target/MogliMeals-0.0.1-SNAPSHOT.jar /usr/app/MogliMeals-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/usr/app/MogliMeals-0.0.1-SNAPSHOT.jar"]