package com.krumin.kitchenapp.model.microwave;

import com.krumin.kitchenapp.model.DoorState;
import com.krumin.kitchenapp.model.FoodType;
import com.krumin.kitchenapp.model.refrigerator.Meal;

/**
 * Created by Krumin on 9/30/2017.
 */

public abstract class Microwave {

    String mBrandName;
    DoorState mCurrentDoorState;
    Meal mCurrentMeal;
    float mHeatingRate;

    abstract void setup();

    public void openDoor() {
        mCurrentDoorState = DoorState.OPEN;
    }

    public void closeDoor() {
        mCurrentDoorState = DoorState.CLOSED;
    }

    public void insertMeal(Meal meal) {
        mCurrentMeal = meal;
    }

    /**
     * @param durationSec duration in seconds to heat the current meal
     * @return the meal after heating
     */
    public Meal heat(int durationSec) {
        mCurrentMeal.setTemperature(durationSec * mHeatingRate);
        return mCurrentMeal;
    }

    public Meal takeOutMeal() {
        return mCurrentMeal;
    }
}