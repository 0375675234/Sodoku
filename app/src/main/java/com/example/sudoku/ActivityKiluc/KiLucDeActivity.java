package com.example.sudoku.ActivityKiluc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sudoku.ListKL.KiLucDe1Activity;

import com.example.sudoku.R;

public class KiLucDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ki_luc_de);
        getSupportActionBar().hide();
    }

    public void de1(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","de1");
        startActivity(i);
    }
    public void de2(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","de2");
        startActivity(i);
    }public void de3(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","de3");
        startActivity(i);
    }public void de4(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","de4");
        startActivity(i);
    }
    public void de5(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","de5");
        startActivity(i);
    }
    public void de6(View view) {
        Intent i = new Intent(getApplicationContext(),KiLucDe1Activity.class);
        i.putExtra("all","de6");
        startActivity(i);
    }


    public void back(View view) {
        finish();
    }
}