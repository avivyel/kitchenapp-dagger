package com.krumin.kitchenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.krumin.kitchenapp.component.DaggerKitchenComponent;
import com.krumin.kitchenapp.model.Kitchen;
import com.krumin.kitchenapp.module.MicrowaveModule;
import com.krumin.kitchenapp.module.RefigeratorModule;

import javax.inject.Inject;

public class KitchenActivity extends AppCompatActivity {

    @Inject
    Kitchen mKitchen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        DaggerKitchenComponent.builder()
                .microwaveModule(new MicrowaveModule())
                .refigeratorModule(new RefigeratorModule())
                .build().inject(this);
    }
}