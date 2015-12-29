package com.mtsmda.java7Book.ch2;

/**
 * Created by MTSMDA on 06.12.2015.
 */
public class JavaInstanceVariableAccessStaticMethod {

    private int count = 0;
    private int coef = 1;

    private static int sum = 0;

    public static void main(String[] args) {
//        System.out.println(count);Error:(12, 28) java: non-static variable count cannot be referenced from a static context
        /*for(int i = count; i < 25; i++){Error:(13, 21) java: non-static variable count cannot be referenced from a static context

        }*/
        /*for(;count < 25; count++){
            Error:(16, 14) java: non-static variable count cannot be referenced from a static context
            Error:(16, 26) java: non-static variable count cannot be referenced from a static context
        }*/
        JavaInstanceVariableAccessStaticMethod javaInstanceVariableAccessStaticMethod = new JavaInstanceVariableAccessStaticMethod();
        System.out.println("before = " + javaInstanceVariableAccessStaticMethod.count);
        System.out.println("before sum = " + sum);
        javaInstanceVariableAccessStaticMethod.print();
        System.out.println("after = " + javaInstanceVariableAccessStaticMethod.count);
        System.out.println("after sum = " + sum);
    }

    public void print() {
        for (; count < 10; count++) {
            System.out.println("count - " + count);
            sum += count;
        }

    }

}