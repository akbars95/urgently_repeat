package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class ShortCircuitOperators {

    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = (b1) && (b2 = true);
        System.out.println(b2 + " ----- " + b3);

        boolean b4 = (b1 = true) & (b2 = true);
        System.out.println(b2 + " ----- " + b4);


        boolean b5 = true;
        boolean b6 = false;

        boolean b7 = (b5) || (b6 = true);
        System.out.println(b6 + " ----- " + b7);

        boolean b8 = (b5) | (b6 = true);
        System.out.println(b6 + " ----- " + b8);
    }

}