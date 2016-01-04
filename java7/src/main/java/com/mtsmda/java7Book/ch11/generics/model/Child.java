package com.mtsmda.java7Book.ch11.generics.model;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class Child extends Parent {

    @Override
    public void get() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
