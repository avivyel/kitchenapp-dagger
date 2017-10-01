package com.krumin.kitchenapp.module;

import com.krumin.kitchenapp.model.microwave.Microwave;
import com.krumin.kitchenapp.model.microwave.SamsungMicrowave;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Krumin on 9/30/2017.
 */

@Module
public class MicrowaveModule {

    @Provides
    Microwave provideMicrowave() {
        return new SamsungMicrowave();
    }
}
