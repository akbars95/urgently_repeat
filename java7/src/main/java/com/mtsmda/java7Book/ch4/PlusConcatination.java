package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class PlusConcatination {

    public static void main(String[] args) {
        String name = "Fedor";
        System.out.println("name + 3 + 9 = " + name + 3 + 9);
        System.out.println("name + (3 + 9) = " + name + (3 + 9));
        System.out.println("name + (3 * 9) = " + name + (3 * 9));
        System.out.println("name + 3 * 9 = " + name + 3 * 9);

    }

}