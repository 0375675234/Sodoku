package com.example.sudoku.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.sudoku.JClass.NguoiDung;
import com.example.sudoku.MySQL.MySQL;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO {
    MySQL mySQL;
    SQLiteDatabase db;
    public static final String TABLE_NAME = "NguoiDung";
    public static String SQL = "Create table "+TABLE_NAME+"("
            +"id text,"
            +"username text primary key,"
            +"password text,"
            +"name text"
            +");";

    public NguoiDungDAO(Context context) {
        mySQL = new MySQL(context);
        db = mySQL.getWritableDatabase();
    }

    public int themND(NguoiDung nguoiDung){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id",nguoiDung.getId());
        contentValues.put("username",nguoiDung.getUsername());
        contentValues.put("password",nguoiDung.getPass());
        contentValues.put("name",nguoiDung.getName());
        if (db.insert(TABLE_NAME,null,contentValues)<0){
            return -1;
        }
        else
            return 1;
    }
    public List<NguoiDung> getAll(){
        List<NguoiDung> nguoiDungs = new ArrayList<>();
        Cursor c = db.query(TABLE_NAME,null,null,null,null,null,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            NguoiDung nd = new NguoiDung();
            nd.setId(c.getString(0));
            nd.setUsername(c.getString(1));
            nd.setPass(c.getColumnName(2));
            nd.setName(c.getString(3));

            nguoiDungs.add(nd);
            c.moveToNext();
        }
        c.close();
        return nguoiDungs;
    }
    public NguoiDung formDN(String user,String pass){
        NguoiDung nd = new NguoiDung();
        String truyVan = "SELECT * FROM " + TABLE_NAME + " WHERE username"+ " = '" + user
                +"' AND password "+" = '"+pass+"'";
        Cursor c = db.rawQuery(truyVan,null);
        if (c.getCount()==1){
            c.moveToFirst();
            nd.setId(c.getString(0));
            nd.setUsername(c.getString(1));
            nd.setPass(c.getColumnName(2));
            nd.setName(c.getString(3));
            return nd;
        }
        else return null;
    }
    public int xoaNguoiDung(String id){
        if (db.delete(TABLE_NAME,"id=?",new String[]{id})==0){
            return -1;
        }
        else
            return 1;

    }
}