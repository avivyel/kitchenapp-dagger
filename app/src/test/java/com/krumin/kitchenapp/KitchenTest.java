package com.krumin.kitchenapp;

import com.krumin.kitchenapp.component.DaggerKitchenComponentTest;
import com.krumin.kitchenapp.model.FoodType;
import com.krumin.kitchenapp.model.Kitchen;
import com.krumin.kitchenapp.model.refrigerator.Meal;
import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.module.MicrowaveModuleTest;
import com.krumin.kitchenapp.module.RefrigeratorModuleTest;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.when;

/**
 * Created by Krumin on 9/30/2017.
 */

public class KitchenTest {

    @Inject
    Kitchen mKitchen;

    @Before
    public void init() {
        DaggerKitchenComponentTest.builder()
                .microwaveModuleTest(new MicrowaveModuleTest())
                .refrigeratorModuleTest(new RefrigeratorModuleTest())
                .build().inject(this);
    }

    @Test
    public void testKitchen() {
        FoodType dummyFoodType = FoodType.FISH;
        int dummyDuration = 30;
        float desiredTemperature = 70f;

        Meal returnedMeal = new Meal(dummyFoodType, Refrigerator.WORKING_TEMPERATURE);

        when(mKitchen.getRefrigerator().takeOutFood(dummyFoodType)).thenReturn(returnedMeal);
        returnedMeal.setTemperature(desiredTemperature);
        when(mKitchen.getMicrowave().takeOutMeal()).thenReturn(returnedMeal);

        Meal realMeal = mKitchen.makeMeal(dummyFoodType, dummyDuration);
        Assert.assertEquals(realMeal, returnedMeal);
    }
}