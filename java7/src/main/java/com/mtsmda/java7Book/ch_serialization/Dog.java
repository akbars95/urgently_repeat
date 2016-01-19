package com.mtsmda.java7Book.ch_serialization;

import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 18.01.2016.
 */
public class Dog implements Serializable {

    private Collar collar;
    private int dogSize;
    private transient Color color;
    private SubNotSerialazedObject subNotSerialazedObject;
    public static Integer dogNumber;

    static {
        dogNumber = new Integer(1);
    }

    {
        dogNumber++;
    }

    public Dog(Collar collar, int dogSize) {
        this.collar = collar;
        this.dogSize = dogSize;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

    public int getDogSize() {
        return dogSize;
    }

    public void setDogSize(int dogSize) {
        this.dogSize = dogSize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public SubNotSerialazedObject getSubNotSerialazedObject() {
        return subNotSerialazedObject;
    }

    public void setSubNotSerialazedObject(SubNotSerialazedObject subNotSerialazedObject) {
        this.subNotSerialazedObject = subNotSerialazedObject;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "collar=" + collar +
                ", dogSize=" + dogSize +
                ", color=" + color +
                ", subNotSerialazedObject=" + subNotSerialazedObject +
                '}';
    }
}