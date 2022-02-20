FROM maven:3-jdk-8-alpine AS build

WORKDIR /opt/app

COPY ./ /opt/app/

RUN mvn clean install -DskipTests

FROM  tomcat:8.0-jre8

COPY --from=build /opt/app/target/*.war /usr/local/tomcat/webapps

COPY sample.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]