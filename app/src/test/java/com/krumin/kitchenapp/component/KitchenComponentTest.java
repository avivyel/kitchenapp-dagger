package com.krumin.kitchenapp.component;

import com.krumin.kitchenapp.KitchenTest;
import com.krumin.kitchenapp.module.MicrowaveModule;
import com.krumin.kitchenapp.module.RefrigeratorModule;
import dagger.Component;

/**
 * Created by aviv on 09/10/2017.
 */

@Component(modules = {MicrowaveModule.class, RefrigeratorModule.class})
// This is an interface which connects consumer and provider.
// Dagger will automatically generate a class, implementing this interface, to be used in the code for injection
public interface KitchenComponentTest extends KitchenComponent {

    // This method (its name can be different) takes as a parameter an instance to inject dependencies into
    void inject(KitchenTest kitchenTest);
}