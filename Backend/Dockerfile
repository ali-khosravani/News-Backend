FROM maven:3.6-openjdk-17 as maven

WORKDIR /app
COPY ./pom.xml .
RUN mvn dependency:go-offline

COPY ./src ./src

RUN mvn package -DskipTests=true
WORKDIR /app/target/

ENTRYPOINT ["java" , "-jar" ,"Backend-0.0.1-SNAPSHOT.jar"]