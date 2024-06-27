package org.example.test;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ShipmentPriceCalculatorImpl implements ShipmentPriceCalculator {

    @Override
    public int calculate(int weight, int height) throws RemoteException {

        int weightRatio = 1, heightRatio = 1;

        if (weight < 10)
            weightRatio = 2;
        else if (weight < 20)
            weightRatio = 3;
        else if (weight < 30)
            weightRatio = 4;
        else
            weightRatio = 5;

        if (height < 100)
            heightRatio = 2;
        else if (height < 150)
            heightRatio = 3;
        else
            heightRatio = 4;

        return weightRatio * heightRatio * 10;
    }
}
