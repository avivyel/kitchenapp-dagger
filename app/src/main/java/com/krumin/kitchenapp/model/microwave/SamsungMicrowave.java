package com.krumin.kitchenapp.model.microwave;

/**
 * Created by Krumin on 9/30/2017.
 */

public class SamsungMicrowave extends Microwave {

    @Override
    void setup() {
        mBrandName = "Samsung";
        mHeatingRate = 1.5f;
    }

    public SamsungMicrowave() {
        setup();
    }
}
