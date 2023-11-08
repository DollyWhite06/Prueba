package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MainActivity3 inicia = this;

        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent intent = new Intent( inicia, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }
    }


