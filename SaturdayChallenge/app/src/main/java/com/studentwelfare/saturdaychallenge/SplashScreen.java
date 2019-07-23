package com.studentwelfare.saturdaychallenge;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        image = findViewById(R.id.image_splash_logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pair pair = Pair.create(image,"imglogo");
                ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(SplashScreen.this,pair);
                startActivity(new Intent(SplashScreen.this,LoginActivity.class), compat.toBundle());
            }
        },2200);


    }
}
