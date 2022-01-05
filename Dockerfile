FROM maven:3.8.4-openjdk-8

ADD target/kafka-producer.jar kafka-producer.jar

## Refer to Maven build -> finalName
#ARG JAR_FILE=target/mufti-belajar.jar
#
## cd /opt/app
#WORKDIR /opt
#
## cp target/spring-boot-web.jar /opt/app/app.jar
#COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","kafka-producer.jar"]

EXPOSE 8080