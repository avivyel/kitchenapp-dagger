package com.krumin.kitchenapp.model;

import com.krumin.kitchenapp.model.microwave.Microwave;
import com.krumin.kitchenapp.model.refrigerator.Refrigerator;

import javax.inject.Inject;

/**
 * Created by Krumin on 9/30/2017.
 */

public class Kitchen {

    private Microwave mMicrowave;
    private Refrigerator mRefrigerator;

    @Inject
    // Injection via constructor arguments
    public Kitchen(Microwave microwave, Refrigerator refrigerator) {
        mMicrowave = microwave;
        mRefrigerator = refrigerator;
    }

    public Meal makeMeal(FoodType foodType, int durationToHeat) {
        mRefrigerator.openDoor();
        Meal meal = mRefrigerator.takeOutFood(foodType);
        mRefrigerator.closeDoor();

        mMicrowave.openDoor();
        mMicrowave.insertMeal(meal);
        mMicrowave.heat(durationToHeat);

        meal = mMicrowave.takeOutMeal();
        mMicrowave.closeDoor();

        return meal;
    }

    public Microwave getMicrowave() {
        return mMicrowave;
    }

    public Refrigerator getRefrigerator() {
        return mRefrigerator;
    }
}
