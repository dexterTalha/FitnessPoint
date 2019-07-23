package com.studentwelfare.saturdaychallenge;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textSignUp, login_text;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        linearLayout = findViewById(R.id.layout_login);
        textSignUp = findViewById(R.id.text_signup);
        login_text = findViewById(R.id.textLogin);
        imageView = findViewById(R.id.image_login_logo);

        textSignUp.setPaintFlags(textSignUp.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);



        textSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                Pair[] pairs = new Pair[3];

                pairs[0] = new Pair<View, String>(imageView,"imglogo");
                pairs[1] = new Pair<View, String>(textSignUp,"text_up");
                pairs[2] = new Pair<View, String>(login_text,"textlogin");
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                startActivity(intent,optionsCompat.toBundle());
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
