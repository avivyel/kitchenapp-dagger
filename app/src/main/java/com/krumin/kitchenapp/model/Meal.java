package com.krumin.kitchenapp.model;

/**
 * Created by Krumin on 9/30/2017.
 */

public class Meal {

    FoodType mFoodType;
    float mTemperature;

    public Meal(FoodType foodType, float temperature) {
        mFoodType = foodType;
        mTemperature = temperature;
    }

    public void setTemperature(float temperature) {
        mTemperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meal meal = (Meal) o;

        if (Float.compare(meal.mTemperature, mTemperature) != 0) return false;
        return mFoodType == meal.mFoodType;
    }

    @Override
    public int hashCode() {
        int result = mFoodType != null ? mFoodType.hashCode() : 0;
        result = 31 * result + (mTemperature != +0.0f ? Float.floatToIntBits(mTemperature) : 0);
        return result;
    }
}
