package com.krumin.kitchenapp.module;

import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.model.refrigerator.SamsungRefrigerator;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Krumin on 9/30/2017.
 */

@Module
public class RefigeratorModule {

    @Provides
    Refrigerator provideRefrigerator() {
        return new SamsungRefrigerator();
    }
}
