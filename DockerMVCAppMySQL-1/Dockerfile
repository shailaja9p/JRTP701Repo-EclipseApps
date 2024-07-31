FROM openjdk:17
EXPOSE 4041
COPY target/sbmvc-mysql-app.war sbmvc-mysql-app.war
ENTRYPOINT ["java","-jar", "/sbmvc-mysql-app.war"]