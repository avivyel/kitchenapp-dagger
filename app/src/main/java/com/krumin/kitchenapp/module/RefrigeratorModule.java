package com.krumin.kitchenapp.module;

import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.model.refrigerator.SamsungRefrigerator;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Krumin on 9/30/2017.
 */

@Module
// This is a dependency provider for Refrigerator
public class RefrigeratorModule {

    private boolean mIsTest;

    public RefrigeratorModule(boolean isTest) {
        mIsTest = isTest;
    }

    @Provides
    Refrigerator provideRefrigerator() {
        if (!mIsTest) {
            return new SamsungRefrigerator();
        } else {
            return Mockito.mock(Refrigerator.class);
        }
    }
}
