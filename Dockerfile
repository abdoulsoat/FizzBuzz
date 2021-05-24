# Start with a base image containing Java runtime
FROM openjdk:13

# Add Maintainer Info
LABEL maintainer="partageressourcestechniques@soat.fr"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
COPY target/FizzBuzz-1.0-SNAPSHOT.jar /app.jar

# Run the jar file
CMD ["java","-jar","/app.jar"]
