package com.example.lr_6;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    float x;

    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = -30;
    }

    public void onClick(View v) {
        Timer timer = new Timer();
        Scheduler scheduler = new Scheduler();
        scheduler.x = x;
        scheduler.setHandler(handler);
        scheduler.setActivity(this);
        timer.schedule(scheduler, 1000);
        x++;
    }
}