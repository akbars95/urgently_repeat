package com.mtsmda.java7Book.ch11.generics.genericContructors;

/**
 * Created by MTSMDA on 10.01.2016.
 */
public class GenerConstructor {

    private double price;

    public GenerConstructor() {

    }

    public <T extends Number> GenerConstructor(T t) {
        this.price = t.doubleValue();
    }

    public static void main(String[] args) {
        new GenerConstructor();
        new GenerConstructor(new Byte((byte)19));
//        new GenerConstructor("");
    }

}