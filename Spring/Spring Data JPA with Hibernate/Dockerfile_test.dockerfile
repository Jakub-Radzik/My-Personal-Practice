FROM openjdk:11-jdk-oracle
ADD target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 7000
CMD java -jar demo-0.0.1-SNAPSHOT.jar --envname=test
