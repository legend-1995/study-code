package com.sucq.demo.bean;

public class Item {

    private int id;

    private String s;

    private double v;

    public Item() {
    }

    public Item(int id, String s, double v) {
        this.id = id;
        this.s = s;
        this.v = v;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", s='" + s + '\'' +
                ", v=" + v +
                '}';
    }
}
