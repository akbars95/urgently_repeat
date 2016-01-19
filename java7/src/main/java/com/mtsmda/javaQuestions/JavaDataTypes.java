package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 15.01.2016.
 */
public class JavaDataTypes {

    public static void main(String[] args) {
        long l = 1000 * 60 * 60* 24* 365L;
        long lWithoutL = 1000 * 60 * 60* 24* 365;
        System.out.println(l);
        System.out.println(lWithoutL);
        Object o = lWithoutL;
        System.out.println(o.getClass().getCanonicalName());
    }

}