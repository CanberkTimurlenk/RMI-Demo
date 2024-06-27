package org.example;

import org.example.test.ShipmentPriceCalculator;
import org.example.test.ShipmentPriceCalculatorImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) {

        ShipmentPriceCalculator calculator = new ShipmentPriceCalculatorImpl();
        try {
            ShipmentPriceCalculator stub = (ShipmentPriceCalculator) UnicastRemoteObject.exportObject(calculator, 0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }

        // Bind the remote object's stub in the registry
        Registry registry = null;
        try {
            registry = LocateRegistry.createRegistry(1099);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
        try {
            registry.rebind("ShipmentPriceCalculator", calculator);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Server is ready.");
    }
}
