FROM openjdk:11.0.7-jre
MAINTAINER lmq1117 lmq1117@qq.com
VOLUME /tmp
ADD sb-0.0.1-SNAPSHOT.jar app.jar
ADD application.properties application.properties
EXPOSE 168
#ENTRYPOINT ["java", "-jar", "/app.jar","--spring.config.location=file:/tmp/application.properties"]
ENTRYPOINT ["java", "-jar", "/app.jar"]
