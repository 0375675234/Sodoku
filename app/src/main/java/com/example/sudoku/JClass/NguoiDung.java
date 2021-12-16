package com.example.sudoku.JClass;

public class NguoiDung {
    String id;
    String username,pass,name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NguoiDung() {
    }

    public NguoiDung(String id, String username, String pass, String name) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.name = name;
    }
}
