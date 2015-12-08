package com.mtsmda.java7Book.ch3;

import java.awt.*;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class AssignedOneReferenceToAnother {

    public static void main(String[] args) {
        Dimension dimension1 = new Dimension(5, 10);
        System.out.println("dimension1 = " + dimension1);
        Dimension dimension2 = dimension1;
        System.out.println("dimension2 = " + dimension2);
        dimension2.height = 15;

        System.out.println("dimension1 = " + dimension1);
        System.out.println("dimension2 = " + dimension2);


        String s = "x";
        System.out.println(s.hashCode());
        String s2 = "X";
        System.out.println(s2.hashCode());
        s2 = "x";
        System.out.println(s2.hashCode());
        s = "s1";
        s2 = "s2";
        s = s2;
        System.out.println(s + " - " + s2);
        s = "S1";
        System.out.println(s + " - " + s2);
        s2.toUpperCase();
    }

}