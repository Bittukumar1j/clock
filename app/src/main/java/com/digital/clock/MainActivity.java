package com.digital.clock;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextClock;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   TextClock textClock,textampm,textdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        textClock = findViewById(R.id.textClockid);
        textampm = findViewById(R.id.textampmid);
        textdate = findViewById(R.id.textdateid);
    }
}