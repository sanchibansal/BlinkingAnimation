package com.example.sakshi.blinkinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button button;
    TextView textView;
    Animation blink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.startanim);
        textView=(TextView)findViewById(R.id.text);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                textView.startAnimation(blink);
            }
        });
    }
}
