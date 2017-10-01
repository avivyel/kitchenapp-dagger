package com.krumin.kitchenapp.model.microwave;

/**
 * Created by Krumin on 9/30/2017.
 */

public class BoschMicrowave extends Microwave {

    void setup () {
        mBrandName = "Bosch";
        mHeatingRate = 1f;
    }

    public BoschMicrowave() {
        setup();
    }
}
