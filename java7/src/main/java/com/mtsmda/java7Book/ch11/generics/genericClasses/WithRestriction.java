package com.mtsmda.java7Book.ch11.generics.genericClasses;

import com.mtsmda.java7Book.ch11.generics.model.Animal;

import java.io.Serializable;

/**
 * Created by MTSMDA on 09.01.2016.
 */
public class WithRestriction<T extends Animal & Serializable> {

    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}