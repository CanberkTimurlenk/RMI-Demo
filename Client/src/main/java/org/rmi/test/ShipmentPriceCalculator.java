package org.rmi.test;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ShipmentPriceCalculator extends Remote {

    BigDecimal calculate(int weight, int height) throws RemoteException;

}