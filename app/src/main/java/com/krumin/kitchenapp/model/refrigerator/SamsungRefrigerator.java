package com.krumin.kitchenapp.model.refrigerator;

/**
 * Created by Krumin on 9/30/2017.
 */

public class SamsungRefrigerator extends Refrigerator {

    @Override
    void setup() {
        mBrandName = "Samsung";
    }

    public SamsungRefrigerator() {
        setup();
    }
}
