package com.example.sudoku.ActivityKiluc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sudoku.ListKL.KiLucDe1Activity;

import com.example.sudoku.R;

public class KiLucTBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ki_luc_t_b);
        getSupportActionBar().hide();
    }

    public void back(View view) {
        finish();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void tb1(View view) {
        Intent i = new Intent(getApplicationContext(), KiLucDe1Activity.class);
        i.putExtra("all","tb1");
        startActivity(i);
    }
    public void tb2(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","tb2");
        startActivity(i);
    }
    public void tb3(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","tb3");
        startActivity(i);
    }
    public void tb4(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","tb4");
        startActivity(i);
    }
    public void tb5(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","tb5");
        startActivity(i);
    }
}