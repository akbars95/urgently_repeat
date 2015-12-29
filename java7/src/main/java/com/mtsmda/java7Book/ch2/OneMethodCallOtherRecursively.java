package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 06.12.2015.
 */
public class OneMethodCallOtherRecursively {

    static int count = 0;

    public static void main(String[] args) {
//        hi();//recursive error
//        go();// same error - at com.mtsmda.java7Book.ch2.OneMethodCallOtherRecursively.go(OneMethodCallOtherRecursively.java:25)
        go2();
    }

    public static void hello() {
        System.out.println("hello");
        hi();
    }

    public static void hi() {
        System.out.println("hi");
        hello();
    }

    public static void go(){
        System.out.println("go");
        go();
    }

    public static void go2(){
        System.out.println("go2 - " + count++);
        if(count == 6210){
            return;
        }
        go2();
    }

}