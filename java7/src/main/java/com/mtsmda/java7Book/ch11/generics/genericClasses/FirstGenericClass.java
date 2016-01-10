package com.mtsmda.java7Book.ch11.generics.genericClasses;

/**
 * Created by MTSMDA on 09.01.2016.
 */
public class FirstGenericClass<T> {

    T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

}