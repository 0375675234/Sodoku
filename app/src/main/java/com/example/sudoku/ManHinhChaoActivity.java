package com.example.sudoku;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.widget.TextView;

public class ManHinhChaoActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        textView = findViewById(R.id.textView);
        Typeface typeface =Typeface.createFromAsset(getAssets(),"Blazed.ttf");
        textView.setTypeface(typeface);
        new CountDownTimer(2000, 2000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                finish();
                Intent i = new Intent(getApplicationContext(),ManHinhChaoClickActivity.class);
                startActivity(i);
            }
        }.start();
    }
}