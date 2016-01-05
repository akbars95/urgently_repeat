package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class Autoboxing {

    public static void main(String[] args) {
        int c = 15;
        Integer g = new Integer(19);

        setInt(c);
        setInt(g);
    }

    private static void setInt(int c) {
        System.out.println(c + " - int");
    }

    private static void setInt(Integer integer) {
        System.out.println(integer + " - Integer");
    }

}