package com.mtsmda.java7Book.ch12.innerClasses;

/**
 * Created by MTSMDA on 05.01.2016.
 */
public class InnerMethodClass {

    public static void main(String[] args) {
        Out out = new Out();
        out.doStuff();
    }

}


class Out {

    public void doStuff() {
        class In {
            public void go() {
                System.out.println("go in inner class");
            }
        }
        In in = new In();
        in.go();
    }

}