package com.krumin.kitchenapp.model.refrigerator;

/**
 * Created by Krumin on 9/30/2017.
 */

public class AmcorRefrigerator extends Refrigerator {

    @Override
    void setup() {
        mBrandName = "Amcor";
    }

    public AmcorRefrigerator() {
        setup();
    }
}
