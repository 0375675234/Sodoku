package com.example.sudoku.ActivityCapDo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sudoku.ActivityManTB.TB1Activity;
import com.example.sudoku.ActivityManTB.TB2Activity;
import com.example.sudoku.ActivityManTB.TB3Activity;
import com.example.sudoku.ActivityManTB.TB4Activity;
import com.example.sudoku.ActivityManTB.TB5Activity;
import com.example.sudoku.R;



public class TBActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_b);

        getSupportActionBar().hide();
        Intent i = getIntent();
        name =  i.getStringExtra("name");
    }

    public void back(View view) {
        finish();
    }

    public void tb1(View view) {
        Intent i = new Intent(getApplicationContext(),TB1Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void tb2(View view) {
        Intent i = new Intent(getApplicationContext(),TB2Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void tb3(View view) {
        Intent i = new Intent(getApplicationContext(),TB3Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void tb4(View view) {
        Intent i = new Intent(getApplicationContext(),TB4Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
    public void tb5(View view) {
        Intent i = new Intent(getApplicationContext(),TB5Activity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
}