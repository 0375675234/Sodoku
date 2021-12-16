package com.example.sudoku.ListKL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.sudoku.Adapter.KiLucDe1Adapter;
import com.example.sudoku.DAO.KiLucDAO;
import com.example.sudoku.JClass.KiLuc;
import com.example.sudoku.R;

import java.util.List;

public class KiLucDe1Activity extends AppCompatActivity {
    ListView listView;
    KiLucDe1Adapter adapter;
    KiLucDAO kiLucDAO;
    List<KiLuc> kiLucList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ki_luc_de1);
        listView = findViewById(R.id.listView);
        kiLucDAO = new KiLucDAO(this);
        Intent i = getIntent();
        String k = i.getStringExtra("all");

        if (k.equals("de1")){
            setTitle("DỄ - 1");
            kiLucList = kiLucDAO.getAllDe1();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("de2")){
            setTitle("DỄ - 2");
            kiLucList = kiLucDAO.getAllDe2();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("de3")){
            setTitle("DỄ - 3");
            kiLucList = kiLucDAO.getAllDe3();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("de4")){
            setTitle("DỄ - 4");
            kiLucList = kiLucDAO.getAllDe4();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("de5")){
            setTitle("DỄ - 5");
            kiLucList = kiLucDAO.getAllDe5();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("de6")){
            setTitle("DỄ - 6");
            kiLucList = kiLucDAO.getAllDe6();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }

        else if (k.equals("tb1")){
            setTitle("TB - 1");
            kiLucList = kiLucDAO.getAllTB1();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("tb2")){
            setTitle("TB - 2");
            kiLucList = kiLucDAO.getAllTB2();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("tb3")){
            setTitle("TB - 3");
            kiLucList = kiLucDAO.getAllTB3();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("tb4")){
            setTitle("TB - 4");
            kiLucList = kiLucDAO.getAllTB4();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("tb5")){
            setTitle("TB - 5");
            kiLucList = kiLucDAO.getAllTB5();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("kho1")){
            setTitle("Khó - 1");
            kiLucList = kiLucDAO.getAllKho1();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("kho2")){
            setTitle("Khó - 2");
            kiLucList = kiLucDAO.getAllKho2();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
        else if (k.equals("kho3")){
            setTitle("Khó - 3");
            kiLucList = kiLucDAO.getAllKho3();
            adapter = new KiLucDe1Adapter(this,kiLucList);
            listView.setAdapter(adapter);
        }
    }
}