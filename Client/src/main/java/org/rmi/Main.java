package org.rmi;

import org.rmi.test.ShipmentPriceCalculator;

import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) {

        try {
            // get the registry and find the object
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ShipmentPriceCalculator shipmentPriceCalculator =
                    (ShipmentPriceCalculator) registry.lookup("ShipmentPriceCalculator");

            int weight = 30;
            int height = 1500;

            // call the method
            var price = shipmentPriceCalculator.calculate(weight, height);

            System.out.println("Calculated price: " + price);

        } catch (RemoteException | NotBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}