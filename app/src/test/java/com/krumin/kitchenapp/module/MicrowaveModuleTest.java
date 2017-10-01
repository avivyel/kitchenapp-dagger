package com.krumin.kitchenapp.module;

import com.krumin.kitchenapp.model.microwave.Microwave;
import org.mockito.Mockito;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Krumin on 9/30/2017.
 */

@Module
public class MicrowaveModuleTest {

    @Provides
    Microwave provideMicrowave() {
        return Mockito.mock(Microwave.class);
    }
}