package com.mtsmda.java7Book.ch11.generics.genericInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 10.01.2016.
 */
public class MinMaxImpl<T extends Number> implements MinMax<T> {

    private List<T> numbers;

    public MinMaxImpl() {
        numbers = new ArrayList<>();
    }

    public MinMaxImpl(List<T> numbers) {
        this.numbers = numbers;
    }

    @Override
    public T getMax() {
        T max = null;
        boolean b = true;
        for (T t : numbers) {
            if (b) {
                max = t;
                b = false;
            }
            if (t.doubleValue() > max.doubleValue()){
                max = t;
            }
        }
        return max;
    }

    @Override
    public T getMin() {
        T min = null;
        boolean b = true;
        for (T t : numbers) {
            if (b) {
                min = t;
                b = false;
            }
            if (t.doubleValue() < min.doubleValue()){
                min = t;
            }
        }
        return min;
    }
}