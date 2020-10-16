#FROM amazonlinux:latest
#
#RUN yum update -y &&\
#    yum upgrade -y &&\
#    yum install java-11-amazon-corretto-headless -y
FROM alinux-corretto

COPY ./build/libs/aws-ingress-refresher.jar /tmp/app.jar
ENTRYPOINT ["java", "-jar", "/tmp/app.jar"]