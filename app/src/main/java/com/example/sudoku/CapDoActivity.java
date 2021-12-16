package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sudoku.ActivityCapDo.DeActivity;
import com.example.sudoku.ActivityCapDo.KhoActivity;
import com.example.sudoku.ActivityCapDo.TBActivity;

public class CapDoActivity extends AppCompatActivity {
    TextView tv_name_user;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_do);
        getSupportActionBar().hide();
        tv_name_user = findViewById(R.id.tv_name_user);
        Intent i = getIntent();
        name =  i.getStringExtra("name");
        tv_name_user.setText(name);
    }

    public void back(View view) {
        finish();
    }

    public void chon_de(View view) {
        Intent i = new Intent(getApplicationContext(), DeActivity.class);
        i.putExtra("name",name);
        startActivity(i);
    }

    public void chon_Tb(View view) {
        Intent i = new Intent(getApplicationContext(), TBActivity.class);
        i.putExtra("name",name);
        startActivity(i);
    }

    public void chon_kho(View view) {
        Intent i = new Intent(getApplicationContext(), KhoActivity.class);
        i.putExtra("name",name);
        startActivity(i);
    }
}