package com.krumin.kitchenapp.component;

import com.krumin.kitchenapp.KitchenTest;
import com.krumin.kitchenapp.model.microwave.Microwave;
import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.module.MicrowaveModuleTest;
import com.krumin.kitchenapp.module.RefrigeratorModuleTest;
import dagger.Component;

/**
 * Created by Krumin on 9/30/2017.
 */

@Component(modules = {MicrowaveModuleTest.class, RefrigeratorModuleTest.class})
public interface KitchenComponentTest {
    
    Microwave microwave();
    
    Refrigerator refrigerator();
    
    void inject(KitchenTest kitchenTest);
}
