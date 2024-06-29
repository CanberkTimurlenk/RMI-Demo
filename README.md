# Java Remote Method Invocation (RMI) Demo

This project was created for demonstration purposes on the RMI feature in Java. RMI (Remote Method Invocation) is an implementation of Remote Procedure Call (RPC).

The server has a method to calculate the shipment price based on the weight and height of the product. The client passes its arguments to this remote method. The shipment price will be returned by the server.

## Firstly run the Server
First, run the Server application:
```bash
$ cd ./Server
$ mvn install -DskipTests
$ java -jar target/Server-1.0-SNAPSHOT.jar
```
After the Server application is running, you can run the Client application:
```bash
$ cd ./Server
$ mvn install -DskipTests
$ java -jar target/Client-1.0-SNAPSHOT.jar
```
