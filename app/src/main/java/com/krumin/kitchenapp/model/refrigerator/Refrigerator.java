package com.krumin.kitchenapp.model.refrigerator;

import com.krumin.kitchenapp.model.DoorState;
import com.krumin.kitchenapp.model.FoodType;

/**
 * Created by Krumin on 9/30/2017.
 */

public abstract class Refrigerator {

    public static final float ROOM_TEMPERATURE = 25f;
    public static final float WORKING_TEMPERATURE = 4f;

    String mBrandName;
    DoorState mCurrentDoorState;
    float mTemperature;

    abstract void setup();

    public void openDoor() {
        mCurrentDoorState = DoorState.OPEN;
    }

    public void closeDoor() {
        mCurrentDoorState = DoorState.CLOSED;
    }

    public Meal takeOutFood(FoodType foodType) {
        return new Meal(foodType, mTemperature);
    }

    public void turnOn() {
        mTemperature = WORKING_TEMPERATURE;
    }

    public void turnOff() {
        mTemperature = ROOM_TEMPERATURE;
    }

    public float getTemperature() {
        return mTemperature;
    }
}
