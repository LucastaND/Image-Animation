package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Declare the views and refer by the id of the views in activity_main.xml
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Button bt_cw = (Button) findViewById(R.id.bt_cw);
        Button bt_z = (Button) findViewById(R.id.bt_z);
        Button bt_f = (Button) findViewById(R.id.bt_f);

// Assign animation to button
        bt_cw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.animation_clockwise);
                image.startAnimation(animation);
            }
        });

// Assign animation to button
        bt_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.animation_zoom);
                image.startAnimation(animation);
            }
        });

// Assign animation to button
        bt_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.animation_fade);
                image.startAnimation(animation);
            }
        });
    }
}