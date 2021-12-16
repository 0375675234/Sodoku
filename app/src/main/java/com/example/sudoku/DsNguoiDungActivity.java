package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sudoku.Adapter.NguoiDungAdapter;
import com.example.sudoku.DAO.NguoiDungDAO;
import com.example.sudoku.JClass.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class DsNguoiDungActivity extends AppCompatActivity {
    ListView lvDs;
    List<NguoiDung> nguoiDungList;
    NguoiDungDAO nguoiDungDAO;
    NguoiDungAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ds_nguoi_dung);

        setTitle("Danh sách người chơi");
        lvDs = findViewById(R.id.lvDs);
        nguoiDungList = new ArrayList<>();
        nguoiDungDAO = new NguoiDungDAO(this);
        nguoiDungList = nguoiDungDAO.getAll();
        adapter = new NguoiDungAdapter(nguoiDungList,this);

        lvDs.setAdapter(adapter);
    }
}