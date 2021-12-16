package com.example.sudoku;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sudoku.JClass.Play;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void choingay(View view) {
            Intent i = new Intent(getApplicationContext(),CapDoActivity.class);
        startActivity(i);
    }

    public void dangnhap(View view) {
        Intent i = new Intent(getApplicationContext(),DangNhapActivity.class);
        startActivity(i);
    }

    public void dangki(View view) {
        Intent i =new Intent(getApplicationContext(),DangKiActivity.class);
        startActivity(i);
    }

}