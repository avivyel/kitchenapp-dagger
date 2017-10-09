package com.krumin.kitchenapp.module;

import com.krumin.kitchenapp.model.microwave.Microwave;
import com.krumin.kitchenapp.model.microwave.SamsungMicrowave;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Krumin on 9/30/2017.
 */

@Module
// This is a dependency provider for Microwave
public class MicrowaveModule {

    private boolean mIsTest;

    public MicrowaveModule(boolean isTest) {
        mIsTest = isTest;
    }

    @Provides
    Microwave provideMicrowave() {
        if (!mIsTest) {
            return new SamsungMicrowave();
        } else {
            return Mockito.mock(Microwave.class);
        }
    }
}