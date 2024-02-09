FROM eclipse-temurin:17
COPY target/InterviewDocker.jar InterviewDocker.jar
CMD ["java", "-jar", "InterviewDocker.jar"]