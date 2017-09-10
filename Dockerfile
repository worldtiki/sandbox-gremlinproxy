FROM openjdk:8-jdk-alpine
ADD target/gremlinproxy-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS="-Xmx128m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]

EXPOSE 8080