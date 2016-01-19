package com.mtsmda.java7Book.ch_serialization;

import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 18.01.2016.
 */
public class Collar implements Serializable {

    private int collarSize;
    private Color color;

    public Collar(int size) {
        this.collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Collar{" +
                "collarSize=" + collarSize +
                ", color=" + color +
                '}';
    }
}