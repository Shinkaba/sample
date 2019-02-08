package com.example.kanbasawashin.sample;

import android.annotation.SuppressLint;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.view.animation.Animation;

public class MainActivity extends AppCompatActivity {

    private ImageView icon1;
    private ImageView icon2;
    private ImageView icon3;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onStart(){
        super.onStart();

        img = (ImageView)findViewById(R.id.imageView);
        icon1 = (ImageView)findViewById(R.id.icon1);
        icon2 = (ImageView)findViewById(R.id.icon2);
        icon3 = (ImageView)findViewById(R.id.icon3);




        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ArcTranslateAnimation arcTranslateAnimation = new ArcTranslateAnimation(90, 0, Animation.ABSOLUTE, 300, Animation.ABSOLUTE, 0);
                arcTranslateAnimation.setDuration(1000);
                arcTranslateAnimation.setFillEnabled(true);
                arcTranslateAnimation.setFillAfter(true);
                icon2.startAnimation(arcTranslateAnimation);


                ArcTranslateAnimation arcTranslateAnimation1 = new ArcTranslateAnimation(90, 0, Animation.ABSOLUTE, -300, Animation.ABSOLUTE, 0);
//                ArcTranslateAnimation arcTranslateAnimation1 = new ArcTranslateAnimation(0, 90, Animation.ABSOLUTE, 300, Animation.ABSOLUTE, 0);

                arcTranslateAnimation1.setDuration(1000);
                arcTranslateAnimation1.setFillEnabled(true);
                arcTranslateAnimation1.setFillAfter(true);
                icon1.startAnimation(arcTranslateAnimation1);

            }
        });


        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArcTranslateAnimation arcTranslateAnimation1 = new ArcTranslateAnimation(0, 90, Animation.ABSOLUTE, -300, Animation.ABSOLUTE, 0);
                arcTranslateAnimation1.setDuration(1000);
                arcTranslateAnimation1.setFillEnabled(true);
                arcTranslateAnimation1.setFillAfter(true);
                icon1.startAnimation(arcTranslateAnimation1);
            }
        });



    }




}
