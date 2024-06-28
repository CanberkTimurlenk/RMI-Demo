package org.rmi.test;

import java.math.BigDecimal;
import java.rmi.RemoteException;

public class ShipmentPriceCalculatorImpl implements ShipmentPriceCalculator {

    @Override
    public BigDecimal calculate(int weight, int height) throws RemoteException {

        BigDecimal weightRatio, heightRatio;

        if (weight < 10)
            weightRatio = new BigDecimal(2);
        else if (weight < 20)
            weightRatio = new BigDecimal(4);
        else
            weightRatio = new BigDecimal(8);

        if (height < 100)
            heightRatio = new BigDecimal(2);
        else if (height < 150)
            heightRatio = new BigDecimal(4);
        else
            heightRatio = new BigDecimal(8);

        return weightRatio.multiply(heightRatio).multiply(new BigDecimal(10));
    }
}