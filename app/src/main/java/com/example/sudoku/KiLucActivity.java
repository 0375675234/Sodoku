package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sudoku.ActivityKiluc.KiLucDeActivity;
import com.example.sudoku.ActivityKiluc.KiLucKhoActivity;
import com.example.sudoku.ActivityKiluc.KiLucTBActivity;

import org.w3c.dom.Text;

public class KiLucActivity extends AppCompatActivity {
    TextView tv_kl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ki_luc);

        getSupportActionBar().hide();
        tv_kl = findViewById(R.id.tv_kl);
        Typeface typeface =Typeface.createFromAsset(getAssets(),"Blazed.ttf");
        tv_kl.setTypeface(typeface);
    }

    public void de(View view) {
        startActivity(new Intent(getApplicationContext(), KiLucDeActivity.class));
    }
    public void tb(View view) {
        startActivity(new Intent(getApplicationContext(), KiLucTBActivity.class));
    }
    public void kho(View view) {
        startActivity(new Intent(getApplicationContext(), KiLucKhoActivity.class));
    }
}