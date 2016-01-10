package com.mtsmda.java7Book.ch11.generics.genericInterface;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MTSMDA on 10.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(new Integer(19), new Integer(9530), new Integer(943), new Integer(8233), new Integer(-92));
        MinMax<Integer> integerMinMax = new MinMaxImpl<>(integers);
        System.out.println(integerMinMax.getMax());
        System.out.println(integerMinMax.getMin());
    }

}