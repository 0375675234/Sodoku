package com.example.sudoku.MySQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.sudoku.DAO.KiLucDAO;
import com.example.sudoku.DAO.NguoiDungDAO;

public class MySQL extends SQLiteOpenHelper {
    public MySQL(Context context) {
        super(context, "QLND", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NguoiDungDAO.SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
