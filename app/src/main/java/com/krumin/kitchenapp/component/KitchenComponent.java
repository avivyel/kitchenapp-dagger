package com.krumin.kitchenapp.component;

import com.krumin.kitchenapp.KitchenActivity;
import com.krumin.kitchenapp.model.microwave.Microwave;
import com.krumin.kitchenapp.model.refrigerator.Refrigerator;
import com.krumin.kitchenapp.module.MicrowaveModule;
import com.krumin.kitchenapp.module.RefigeratorModule;
import dagger.Component;

/**
 * Created by Krumin on 9/30/2017.
 */

@Component(modules = {MicrowaveModule.class, RefigeratorModule.class})
public interface KitchenComponent {
    
    Microwave microwave();
    
    Refrigerator refrigerator();
    
    void inject(KitchenActivity kitchenActivity);
}
