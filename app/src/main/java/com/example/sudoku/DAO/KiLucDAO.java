package com.example.sudoku.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.sudoku.JClass.KiLuc;
import com.example.sudoku.MySQL.KiLucSQL;

import java.util.ArrayList;
import java.util.List;

public class KiLucDAO {
    KiLucSQL kiLucSQL;
    SQLiteDatabase db;

    public static String de1= "Create table de1(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String de2= "Create table de2(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String de3= "Create table de3(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String de4= "Create table de4(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String de5= "Create table de5(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String de6= "Create table de6(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String TB1= "Create table tb1(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String TB2= "Create table tb2(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String TB3= "Create table tb3(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String TB4= "Create table tb4(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String TB5= "Create table tb5(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String kho1= "Create table kho1(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String kho2= "Create table kho2(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public static String kho3= "Create table kho3(" +
            "id int primary key," +
            "name text," +
            "time double" +
            ");";
    public KiLucDAO(Context context){
        kiLucSQL = new KiLucSQL(context);
        db = kiLucSQL.getWritableDatabase();
    }

    //de1
    public int addKiLucDe1(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("de1",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllDe1(){
        List<KiLuc> kiLucde1s = new ArrayList<>();
        String truyvan = "Select * from de1 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucde1s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucde1s;
    }


    //de2
    public int addKiLucDe2(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("de2",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllDe2(){
        List<KiLuc> kiLucde2s = new ArrayList<>();
        String truyvan = "Select * from de2 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucde2s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucde2s;
    }
    //de3
    public int addKiLucDe3(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("de3",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllDe3(){
        List<KiLuc> kiLucde3s = new ArrayList<>();
        String truyvan = "Select * from de3 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucde3s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucde3s;
    }
    //de4
    public int addKiLucDe4(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("de4",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllDe4(){
        List<KiLuc> kiLucde4s = new ArrayList<>();
        String truyvan = "Select * from de4 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucde4s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucde4s;
    }
    //de5
    public int addKiLucDe5(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("de5",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllDe5(){
        List<KiLuc> kiLucde5s = new ArrayList<>();
        String truyvan = "Select * from de5 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucde5s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucde5s;
    }
    //de6
    public int addKiLucDe6(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("de6",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllDe6(){
        List<KiLuc> kiLucde6s = new ArrayList<>();
        String truyvan = "Select * from de6 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucde6s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucde6s;
    }

    //TB1
    public int addKiLucTB1(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("TB1",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllTB1(){
        List<KiLuc> kiLucTB1s = new ArrayList<>();
        String truyvan = "Select * from TB1 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucTB1s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucTB1s;
    }
    //TB2
    public int addKiLucTB2(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("TB2",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllTB2(){
        List<KiLuc> kiLucTB2s = new ArrayList<>();
        String truyvan = "Select * from TB2 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucTB2s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucTB2s;
    }
    //TB3
    public int addKiLucTB3(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("TB3",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllTB3(){
        List<KiLuc> kiLucTB3s = new ArrayList<>();
        String truyvan = "Select * from TB3 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucTB3s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucTB3s;
    }
    //TB4
    public int addKiLucTB4(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("TB4",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllTB4(){
        List<KiLuc> kiLucTB4s = new ArrayList<>();
        String truyvan = "Select * from TB4 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucTB4s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucTB4s;
    }
    //TB1
    public int addKiLucTB5(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("TB5",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllTB5(){
        List<KiLuc> kiLucTB5s = new ArrayList<>();
        String truyvan = "Select * from TB5 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucTB5s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucTB5s;
    }

    //Kho1
    public int addKiLucKho1(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("kho1",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllKho1(){
        List<KiLuc> kiLucKho1s = new ArrayList<>();
        String truyvan = "Select * from kho1 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucKho1s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucKho1s;
    }
    //Kho2
    public int addKiLucKho2(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("kho2",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllKho2(){
        List<KiLuc> kiLucKho2s = new ArrayList<>();
        String truyvan = "Select * from kho2 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucKho2s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucKho2s;
    }
    //Kho3
    public int addKiLucKho3(KiLuc kiLuc){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", kiLuc.getId());
        contentValues.put("name",kiLuc.getName());
        contentValues.put("time",kiLuc.getTime());
        if (db.insert("kho3",null,contentValues)<0)
            return -1;
        else return 1;
    }

    public List<KiLuc> getAllKho3(){
        List<KiLuc> kiLucKho3s = new ArrayList<>();
        String truyvan = "Select * from kho3 order by time asc";
        Cursor c = db.rawQuery(truyvan,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            KiLuc kl = new KiLuc();
            kl.setId(c.getInt(0));
            kl.setName(c.getString(1));
            kl.setTime(c.getInt(2));
            kiLucKho3s.add(kl);
            c.moveToNext();
        }
        c.close();
        return kiLucKho3s;
    }
}
