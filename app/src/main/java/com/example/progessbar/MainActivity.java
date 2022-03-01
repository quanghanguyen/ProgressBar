package com.example.progessbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pb;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress();

    }

    private void progress() {
        pb = (ProgressBar) findViewById(R.id.pb);
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                pb.setProgress(counter);

                if (counter == 100) {
                    t.cancel();
                }
            }
        };
        t.schedule(tt, 0, 30);
    }
}