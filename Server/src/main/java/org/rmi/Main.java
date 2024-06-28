package org.rmi;

import org.rmi.test.ShipmentPriceCalculator;
import org.rmi.test.ShipmentPriceCalculatorImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) throws RemoteException {

        ShipmentPriceCalculator calculator = new ShipmentPriceCalculatorImpl();

        // Make available the object for incoming calls on specified port (for 0 a random port will be selected)
        ShipmentPriceCalculator stub = (ShipmentPriceCalculator) UnicastRemoteObject
                .exportObject(calculator, 0);

        // Create registry and rebind the object on it
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("ShipmentPriceCalculator", stub);

        // Notify when the server is ready
        System.out.println("Server is ready.");
    }
}
