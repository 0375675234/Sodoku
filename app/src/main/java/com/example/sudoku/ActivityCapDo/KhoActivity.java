package com.example.sudoku.ActivityCapDo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sudoku.ActivityManKho.Kho1Activity;
import com.example.sudoku.ActivityManKho.Kho2Activity;
import com.example.sudoku.ActivityManKho.Kho3Activity;
import com.example.sudoku.R;

public class KhoActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kho);

        getSupportActionBar().hide();
        Intent i = getIntent();
        name =  i.getStringExtra("name");
    }

    public void back(View view) {
        finish();
    }

    public void kho1(View view) {
        Intent i = new Intent(getApplicationContext(), Kho1Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void kho2(View view) {
        Intent i =new Intent(getApplicationContext(),Kho2Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }

}