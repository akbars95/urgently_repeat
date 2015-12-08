package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class StringStudy {

    public static void main(String[] args) {
        String s = "Java is very cool programming language!";
        System.out.println(s.replace("a", "A"));
        System.out.println(s);
        System.out.println(s.replaceAll("a", "_"));
        System.out.println(s.split(" ").length);
    }

}