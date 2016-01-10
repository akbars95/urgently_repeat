package com.mtsmda.java7Book.ch11.generics.model;

import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class Dog extends Animal implements Serializable{

    @Override
    public void checkup() {
        System.out.println(this.getClass().getCanonicalName());
    }
}