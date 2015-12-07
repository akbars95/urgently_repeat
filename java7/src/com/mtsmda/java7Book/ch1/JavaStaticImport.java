package com.mtsmda.java7Book.ch1;

import static com.mtsmda.java7Book.ch1.StaticI.*;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class JavaStaticImport {
    public static void main(String[] args) {
        System.out.println(StaticI.name);
        System.out.println(name);

    }
}

interface StaticI{
    public static final String name = "StaticI";
}