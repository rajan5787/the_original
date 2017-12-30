package com.example.android.app_ui;

/**
 * Created by Admin on 11/8/2017.
 */

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.github.hujiaweibujidao.wava.Techniques;
import com.github.hujiaweibujidao.wava.YoYo;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 1600;
    ImageView goEducation;
    ImageView imageview;
    YoYo.YoYoString rope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



        goEducation = (ImageView) findViewById(R.id.shield);
        imageview = (ImageView) findViewById(R.id.image);


        rope = YoYo.with(Techniques.FadeIn).duration(1500)
                .interpolate(new AccelerateDecelerateInterpolator())
                .listen(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }
                })
                .playOn(imageview);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),SampleActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}

