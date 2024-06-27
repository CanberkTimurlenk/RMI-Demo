package org.example;

import org.example.test.ShipmentPriceCalculator;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ShipmentPriceCalculator server = (ShipmentPriceCalculator) registry.lookup("ShipmentPriceCalculator");

            int weight = 40;
            int height = 30;

            System.out.println("Calculated price: " + server.calculate(weight, height));
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}