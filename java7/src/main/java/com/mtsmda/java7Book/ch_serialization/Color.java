package com.mtsmda.java7Book.ch_serialization;

/**
 * Created by c-DMITMINZ on 18.01.2016.
 */
public class Color {

    private Integer R;
    private Integer G;
    private Integer B;

    public Color(Integer r, Integer g, Integer b) {
        R = r;
        G = g;
        B = b;
    }

    public Integer getR() {
        return R;
    }

    public void setR(Integer r) {
        R = r;
    }

    public Integer getG() {
        return G;
    }

    public void setG(Integer g) {
        G = g;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    @Override
    public String toString() {
        return "Color{" +
                "R=" + R +
                ", G=" + G +
                ", B=" + B +
                '}';
    }
}