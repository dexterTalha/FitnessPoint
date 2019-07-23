package com.studentwelfare.saturdaychallenge;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    TextView textView, textSignUp;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        textView = findViewById(R.id.text_login);
        textSignUp = findViewById(R.id.signup);
        imageView = findViewById(R.id.signup_logo);
        textView.setPaintFlags(textView.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                Pair[] pairs = new Pair[3];
                intent.putExtra("key","val");
                pairs[0] = new Pair<View, String>(imageView,"imglogo");
                pairs[1] = new Pair<View, String>(textSignUp,"text_up");
                pairs[2] = new Pair<View, String>(textView,"textlogin");
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(SignUpActivity.this,pairs);
                startActivity(intent,optionsCompat.toBundle());
                //finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        Pair[] pairs = new Pair[3];
        intent.putExtra("key","val");
        pairs[0] = new Pair<View, String>(imageView,"imglogo");
        pairs[1] = new Pair<View, String>(textSignUp,"text_up");
        pairs[2] = new Pair<View, String>(textView,"textlogin");
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(SignUpActivity.this,pairs);
        startActivity(intent,optionsCompat.toBundle());
        //finish();
    }
}
