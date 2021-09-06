FROM openjdk:11
ARG MAIN_JAR
ARG MAIN_CLASS
ENV MAIN_JAR $MAIN_JAR
ENV MAIN_CLASS $MAIN_CLASS

EXPOSE 8080
RUN addgroup --system java && adduser --system java && adduser java java
USER java:java
COPY target/$MAIN_JAR .


ENTRYPOINT [ "sh", "-c", "java -jar $MAIN_JAR $MAIN_CLASS" ]