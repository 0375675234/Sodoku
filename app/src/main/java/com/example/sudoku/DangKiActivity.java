package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sudoku.DAO.NguoiDungDAO;
import com.example.sudoku.JClass.NguoiDung;

public class DangKiActivity extends AppCompatActivity {
    EditText edtUser,edtPass,edtRePass,edtName;
    NguoiDungDAO nguoiDungDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);

        getSupportActionBar().hide();
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        edtRePass = findViewById(R.id.edtRePass);
        edtName = findViewById(R.id.edtName);

        nguoiDungDAO = new NguoiDungDAO(this);
    }

    public void back(View view) {
        finish();
    }

    public void dangkiND(View view) {
        NguoiDung nd = new NguoiDung("ID: "+System.currentTimeMillis(),
                edtUser.getText().toString().trim(),
                edtPass.getText().toString().trim(),
                edtName.getText().toString().trim());
        if (edtUser.getText().toString().trim().equals("")){
            edtUser.setError("Hãy nhập Username");
        }
        else if (edtPass.getText().toString().trim().equals("")){
            edtPass.setError("Hãy nhập mật khẩu");
        }
        else if (edtRePass.getText().toString().trim().equals("")){
            edtRePass.setError("Nhập lại mật khẩu");
        }
        else if (!edtRePass.getText().toString().equals(edtPass.getText().toString())){
            edtRePass.setError("Mật khẩu không trùng khớp");
        }
        else if (edtName.getText().toString().equals("")){
            edtName.setError("Hãy nhập tên của bạn");
        }
        else if (nguoiDungDAO.themND(nd)==1){
            Toast.makeText(getApplicationContext(),"Đăng kí thành công",Toast.LENGTH_SHORT).show();
            finish();
        }
        else
            Toast.makeText(getApplicationContext(),"Đăng kí thất bại",Toast.LENGTH_SHORT).show();
    }
}