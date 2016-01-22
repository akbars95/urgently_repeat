package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class Autoboxing {

    public static void main(String[] args) {
        int c = 15;
        Integer g = new Integer(19);
        int gg = g.intValue();
        gg++;
        Integer cg = 25;

        setInt(c);
        setInt(g);
        setInt(cg);

        String s = "abc";
        String s1 = "abc";
        System.out.println("s == s1: " + s == s1);

    }

    private static void setInt(int c) {
        System.out.println(c + " - int");
    }

    private static void setInt(Integer integer) {
        System.out.println(integer + " - Integer");
    }

}