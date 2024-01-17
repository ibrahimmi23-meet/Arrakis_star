package com.example.arrakis_star;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intro = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intro);
                finish();
            }
        }, 3000); // Corrected syntax for delayMillis
    }
}
