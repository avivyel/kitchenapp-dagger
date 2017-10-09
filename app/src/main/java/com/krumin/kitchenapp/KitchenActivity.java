package com.krumin.kitchenapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.krumin.kitchenapp.component.DaggerKitchenComponent;
import com.krumin.kitchenapp.model.Kitchen;
import com.krumin.kitchenapp.module.MicrowaveModule;
import com.krumin.kitchenapp.module.RefrigeratorModule;
import javax.inject.Inject;

// Dummy activity - just a sample for dependency injection using Dagger
public class KitchenActivity extends AppCompatActivity {

    // Field injection
    @Inject
    Kitchen mKitchen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        DaggerKitchenComponent.builder()
                .microwaveModule(new MicrowaveModule(false))
                .refrigeratorModule(new RefrigeratorModule(false))
                .build().inject(this);
    }
}