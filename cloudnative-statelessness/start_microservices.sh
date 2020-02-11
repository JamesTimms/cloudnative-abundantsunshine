#!/bin/bash
java -Dserver.port=8081 -Dspring.datasource.url=jdbc:mysql://localhost:3306/cookbook -jar cloudnative-posts/target/cloudnative-posts-0.0.1-SNAPSHOT.jar
java -Dserver.port=8082 -Dspring.datasource.url=jdbc:mysql://localhost:3306/cookbook -jar cloudnative-connections/target/cloudnative-connections-0.0.1-SNAPSHOT.jar
java -jar cloudnative-connectionposts/target/cloudnative-connectionposts-0.0.1-SNAPSHOT.jar
