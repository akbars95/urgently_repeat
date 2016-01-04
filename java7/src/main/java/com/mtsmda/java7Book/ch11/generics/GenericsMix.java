package com.mtsmda.java7Book.ch11.generics;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 03.01.2016.
 */
public class GenericsMix {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Object());
        list.add(new String(""));
        list.add(new Integer(9));
        for (Object o : list){
            System.out.println(o.getClass().getCanonicalName());
        }

        System.out.println("_________________");

        List<Integer> integers = new ArrayList<>();
        integers.add(new Integer(19));
        list(integers);

    }

    private static void list(List list){
        list.add("");
        list.add(new BigInteger("19"));

        for (Object o : list){
            System.out.println(o.getClass().getCanonicalName());
        }

    }

}