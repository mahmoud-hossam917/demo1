FROM openjdk:11-jdk
COPY ./target/dockerimage.jar dockerimage.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/dockerimage.jar"]