FROM eclipse-temurin:17
COPY target/simple.jar simple.jar
CMD [ "java","-jar","simple.jar" ]