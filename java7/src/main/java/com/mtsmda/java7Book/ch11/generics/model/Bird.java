package com.mtsmda.java7Book.ch11.generics.model;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class Bird extends Animal {

    @Override
    public void checkup() {
        System.out.println(this.getClass().getCanonicalName());
    }

}