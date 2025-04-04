# Java Remote Method Invocation (RMI) Demo

This repository contains a simple demonstration of **Java RMI (Remote Method Invocation)**, which is a Java-based implementation of **Remote Procedure Call (RPC)**. The project demonstrates that through a simple "Shipment Fee Calculator" example.
---

## 📦 Project Structure

```
RMI-Demo/
├── Server/     → RMI server application (contains remote method implementation)
├── Client/     → RMI client application (invokes remote method)
```

---

## 🛠️ How to Run

> You may need to run this in the background from the project root.

### 1. Build & Run the Server
```bash
cd Server
mvn clean install -DskipTests
java -jar target/Server-1.0-SNAPSHOT.jar
```

### 2. Build & Run the Client 
```bash
cd Client
mvn clean install -DskipTests
java -jar target/Client-1.0-SNAPSHOT.jar
```

---

## 🔍 What This Project Does

- The client connects to a remote server object over RMI.
- The server exposes a method to calculate shipping cost based on **weight and height**.
- The server performs the calculation and returns the result to the client.
- The goal is to demonstrate the basic usage of RMI in Java, which is a way to implement communication between distributed Java applications.
