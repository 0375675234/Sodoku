package com.example.sudoku.ActivityKiluc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sudoku.ListKL.KiLucDe1Activity;

import com.example.sudoku.R;

public class KiLucKhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ki_luc_kho);
        getSupportActionBar().hide();
    }

    public void kho1(View view) {
        Intent i = new Intent(getApplicationContext(), KiLucDe1Activity.class);
        i.putExtra("all","kho1");
        startActivity(i);
    }
    public void kho2(View view) {
        Intent i = new Intent(getApplicationContext(), KiLucDe1Activity.class);
        i.putExtra("all","kho2");
        startActivity(i);
    }
    public void kho3(View view) {
        Intent i = new Intent(getApplicationContext(), KiLucDe1Activity.class);
        i.putExtra("all","kho3");
        startActivity(i);
    }

    public void back(View view) {
        finish();
    }
}