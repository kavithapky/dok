FROM eclipse-temurin:17
COPY target/simple.jar simdoc.jar
CMD [ "java","-jar","simdoc.jar" ]