package com.krumin.kitchenapp;

import com.krumin.kitchenapp.component.DaggerKitchenComponentTest;
import com.krumin.kitchenapp.model.FoodType;
import com.krumin.kitchenapp.model.Kitchen;
import com.krumin.kitchenapp.model.Meal;
import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.module.MicrowaveModule;
import com.krumin.kitchenapp.module.RefrigeratorModule;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.when;

/**
 * Created by Krumin on 9/30/2017.
 */

// Test class for Kitchen
public class KitchenTest {

    @Inject
    Kitchen mKitchen;

    @Before
    public void init() {
        // This method is run before any @Test annotated method.
        // Here we initialize the Kitchen instance, providing it mock dependencies
        DaggerKitchenComponentTest.builder()
                .microwaveModule(new MicrowaveModule(true))
                .refrigeratorModule(new RefrigeratorModule(true))
                .build().inject(this);
    }

    @Test
    public void testMakeMeal() {
        // Setup: tell the mock objects' methods which values to return, when called with
        // specific arguments, so we can isolate the Kitchen instance for testing

        FoodType dummyFoodType = FoodType.FISH;
        int dummyDuration = 30;
        float desiredTemperature = 70f;

        Meal expectedMeal = new Meal(dummyFoodType, Refrigerator.WORKING_TEMPERATURE);

        when(mKitchen.getRefrigerator().takeOutFood(dummyFoodType)).thenReturn(expectedMeal);
        expectedMeal.setTemperature(desiredTemperature);
        when(mKitchen.getMicrowave().takeOutMeal()).thenReturn(expectedMeal);

        // End of setup - now let's test the real method

        Meal realMeal = mKitchen.makeMeal(dummyFoodType, dummyDuration);

        // Make sure the Meal object, returned from makeMeal, equals to
        // the expectedMeal object
        Assert.assertEquals(realMeal, expectedMeal);
    }
}