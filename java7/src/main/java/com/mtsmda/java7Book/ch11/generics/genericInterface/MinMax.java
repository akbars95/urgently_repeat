package com.mtsmda.java7Book.ch11.generics.genericInterface;

/**
 * Created by MTSMDA on 10.01.2016.
 */
public interface MinMax<T extends Number> {

    T getMax();
    T getMin();

}