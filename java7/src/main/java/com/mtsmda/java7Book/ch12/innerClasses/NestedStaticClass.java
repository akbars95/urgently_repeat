package com.mtsmda.java7Book.ch12.innerClasses;

/**
 * Created by MTSMDA on 05.01.2016.
 */
public class NestedStaticClass {

    public static void main(String[] args) {

        OutClass.InClass inClass = new OutClass.InClass();
        inClass.inPrint();
        OutClass.InClass.here();

    }

}

class OutClass{

    public void print(String s){
        System.out.println(s);
    }

    public static void toUpper(String s){
        System.out.println(s.toUpperCase());
    }

    public static class InClass{

        public void inPrint(){
            toUpper("jim");
        }

        public static void here(){
            toUpper("joe");
            new OutClass().print("Name");
        }

    }

}