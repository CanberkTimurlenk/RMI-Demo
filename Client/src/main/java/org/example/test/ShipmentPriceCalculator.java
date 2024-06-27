package org.example.test;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ShipmentPriceCalculator extends Remote {

    int calculate(int weight, int height) throws RemoteException;

}