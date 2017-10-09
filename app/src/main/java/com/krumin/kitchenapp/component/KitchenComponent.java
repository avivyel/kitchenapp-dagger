package com.krumin.kitchenapp.component;

import com.krumin.kitchenapp.KitchenActivity;
import com.krumin.kitchenapp.model.microwave.Microwave;
import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.module.MicrowaveModule;
import com.krumin.kitchenapp.module.RefrigeratorModule;

import dagger.Component;

/**
 * Created by Krumin on 9/30/2017.
 */

@Component(modules = {MicrowaveModule.class, RefrigeratorModule.class})
// This is an interface which is connecting consumer and provider.
// Dagger will automatically generate a class, implementing this interface, to be used in the code for injection
public interface KitchenComponent {

    Microwave microwave();

    Refrigerator refrigerator();

    // This method (its name can be different) takes as a parameter an instance to inject dependencies into
    void inject(KitchenActivity kitchenActivity);
}