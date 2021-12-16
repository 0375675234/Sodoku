package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView tvLoadDsNd,tvChoi,tvChao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        tvLoadDsNd = findViewById(R.id.tv_loadDsND);
        tvChoi = findViewById(R.id.tv_choi);
        tvChao = findViewById(R.id.tv_chao);

        Intent i =getIntent();
        String hello = i.getStringExtra("name");
        if (hello!=null){
            tvChao.setText(hello);
        }

        if (tvChao.getText().equals("Admin")){
            tvChoi.setVisibility(View.GONE);
        }

        tvLoadDsNd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DsNguoiDungActivity.class));
            }
        });
    }


    public void back(View view) {
        finish();
    }

    public void choi(View view) {
        Intent i = new Intent(getApplicationContext(),CapDoActivity.class);
        i.putExtra("name",tvChao.getText());
        startActivity(i);
    }

    public void kiluc(View view) {
        startActivity(new Intent(getApplicationContext(),KiLucActivity.class));
    }
}