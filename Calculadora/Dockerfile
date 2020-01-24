FROM deisylh/ubuntu-basic

RUN mkdir -p /opt/miguel

WORKDIR /opt/miguel

COPY . ./

RUN mvn clean install

EXPOSE 9090

CMD java -jar ./target/Calculadora-0.0.1-SNAPSHOT.jar
