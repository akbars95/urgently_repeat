package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 06.12.2015.
 */
public class JavaInitBlocks {

    public static void main(String[] args) {
        /*new SuperClassA();
        new SuperClassA();*/
        new SubClassB();
    }

}

class SuperClassA {

    protected static int count = 0;

    static {
        System.out.println("static init block - " + (++count));
    }

    static {
        System.out.println("2 static init block - " + (++count));
    }

    {
        System.out.println("init block - " + (++count));
    }

    {
        System.out.println("2 init block - " + (++count));
    }

    {
        System.out.println("3 init block - " + (++count));
    }

    public SuperClassA() {
        System.out.println("constructor - " + (++count));
    }

}

class SubClassB extends SuperClassA{

    private static int count = 0;

    static {
        System.out.println("static init block SubClassB - " + (++count));
    }

    static {
        System.out.println("2 static init block SubClassB - " + (++count));
    }

    {
        System.out.println("init block SubClassB - " + (++count));
    }

    {
        System.out.println("2 init block SubClassB - " + (++count));
    }

    {
        System.out.println("3 init block SubClassB - " + (++count));
    }

    public SubClassB() {
        System.out.println("constructor SubClassB - " + (++count));
    }
}