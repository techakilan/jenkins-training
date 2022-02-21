FROM  tomcat:8.0-jre8
COPY ./target/hello.war /usr/local/tomcat/webapps
COPY sample.war /usr/local/tomcat/webapps
CMD ["catalina.sh", "run"]