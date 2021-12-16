package com.example.sudoku.JClass;

public class KiLuc {
    int id;
    double time;
    String name;

    public KiLuc(int id, double time, String name) {
        this.id = id;
        this.time = time;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KiLuc() {
    }
}
