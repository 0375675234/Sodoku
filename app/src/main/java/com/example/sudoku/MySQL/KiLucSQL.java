package com.example.sudoku.MySQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.sudoku.DAO.KiLucDAO;
import com.example.sudoku.JClass.KiLuc;

public class KiLucSQL extends SQLiteOpenHelper {
    public KiLucSQL(Context context) {
        super(context, "kiLuc", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(KiLucDAO.de1);
        db.execSQL(KiLucDAO.de2);
        db.execSQL(KiLucDAO.de3);
        db.execSQL(KiLucDAO.de4);
        db.execSQL(KiLucDAO.de5);
        db.execSQL(KiLucDAO.de6);
        db.execSQL(KiLucDAO.TB1);
        db.execSQL(KiLucDAO.TB2);
        db.execSQL(KiLucDAO.TB3);
        db.execSQL(KiLucDAO.TB4);
        db.execSQL(KiLucDAO.TB5);
        db.execSQL(KiLucDAO.kho1);
        db.execSQL(KiLucDAO.kho2);
        db.execSQL(KiLucDAO.kho3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
