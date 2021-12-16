package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sudoku.DAO.NguoiDungDAO;
import com.example.sudoku.JClass.NguoiDung;

public class DangNhapActivity extends AppCompatActivity {
    EditText edt_dn_user,edt_dn_pass;
    NguoiDungDAO nguoiDungDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        getSupportActionBar().hide();
        edt_dn_user = findViewById(R.id.edt_dn_user);
        edt_dn_pass = findViewById(R.id.edt_dn_pass);
        nguoiDungDAO = new NguoiDungDAO(this);
    }

    public void back(View view) {
        finish();
    }

    public void dangnhap(View view) {
        if (edt_dn_user.getText().toString().trim().equals("")){
            edt_dn_user.setError("Chưa nhập tài khoản");
        }
        else if (edt_dn_pass.getText().toString().trim().equals("")){
            edt_dn_pass.setError("Chưa nhập mật khẩu");
        }
        else if (edt_dn_user.getText().toString().trim().equalsIgnoreCase("Admin")
                && edt_dn_pass.getText().toString().trim().equalsIgnoreCase("Admin")){
            Intent i = new Intent(getApplicationContext(),MenuActivity.class);
            i.putExtra("name","Admin");
            finish();
            startActivity(i);
        }
        else {
               NguoiDung nd = nguoiDungDAO.formDN(edt_dn_user.getText().toString(),edt_dn_pass.getText().toString());
               if(nd != null){
                   Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                   Intent i = new Intent(getApplicationContext(),MenuActivity.class);
                   i.putExtra("name",nd.getName());
                   finish();
                   startActivity(i);
               }else {
                   Toast.makeText(getApplicationContext(),"Đăng nhập thất bại",Toast.LENGTH_SHORT).show();
               }
        }

    }
}