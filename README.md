# Java Remote Method Invocation (RMI) Demo

This project demonstrates the use of Java RMI via a simple shipment fee calculator, simulating client-server communication between distributed applications.
---

## 📦 Project Structure

```
RMI-Demo/
├── Server/     → RMI server application (contains remote method implementation)
├── Client/     → RMI client application (invokes remote method)
```

---

## 🛠️ How to Run

Before running the server, you need to start the RMI registry so that the server can bind remote objects to it.

### 1. Start the RMI Registry (if not started automatically):
```bash
rmiregistry &
```

> You may need to run this in the background from the project root.

### 2. Build & Run the Server
```bash
cd Server
mvn clean install -DskipTests
java -jar target/Server-1.0-SNAPSHOT.jar
```

### 3. Build & Run the Client 
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
