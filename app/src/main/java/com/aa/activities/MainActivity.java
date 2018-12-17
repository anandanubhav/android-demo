package com.aa.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity{

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.relativeLayout);
    }

    public void changeToGreen(View view) {
        relativeLayout.setBackgroundColor(Color.GREEN);
    }

    public void changeToBlue(View view) {
        relativeLayout.setBackgroundColor(Color.BLUE);
    }
}
