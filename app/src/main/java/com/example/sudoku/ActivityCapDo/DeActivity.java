package com.example.sudoku.ActivityCapDo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.sudoku.ActivityManDe.De1Activity;
import com.example.sudoku.ActivityManDe.De2Activity;
import com.example.sudoku.ActivityManDe.De3Activity;
import com.example.sudoku.ActivityManDe.De4Activity;
import com.example.sudoku.ActivityManDe.De5Activity;
import com.example.sudoku.ActivityManDe.De6Activity;
import com.example.sudoku.R;

public class DeActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de);
        getSupportActionBar().hide();
        Intent i = getIntent();
        name =  i.getStringExtra("name");
    }

    public void back(View view) {
        finish();
    }

    public void de1(View view) {
        Intent i = new Intent(getApplicationContext(), De1Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void de2(View view) {
        Intent i = new Intent(getApplicationContext(), De2Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void de3(View view) {
        Intent i = new Intent(getApplicationContext(), De3Activity.class);
        i.putExtra("name",name);
        startActivity(i);;
    }
    public void de4(View view) {
        Intent i = new Intent(getApplicationContext(), De4Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void de5(View view) {
        Intent i = new Intent(getApplicationContext(), De5Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void de6(View view) {
        Intent i = new Intent(getApplicationContext(), De6Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
}