FROM openjdk:11
WORKDIR /Users/max_slob/git/VideoService
COPY target/videoService-0.0.1-SNAPSHOT.jar service.jar
EXPOSE 8084
CMD ["java", "-jar", "service.jar"]