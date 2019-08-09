package com.wusir.arcprogressview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ArcProgressView arcProgressView;
    private Random mRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arcProgressView =findViewById(R.id.arcProgressView);
        mRandom = new Random();
        float value=mRandom.nextFloat() * arcProgressView.getMaxValue();
        arcProgressView.setValue(value);
    }
}
