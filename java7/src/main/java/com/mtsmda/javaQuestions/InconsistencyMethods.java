package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 15.01.2016.
 */
public class InconsistencyMethods {

    public static void main(String[] args) {
//        method(null);
//        parent(null);
    }

    private static void method(Object object) {
        System.out.println("object");
    }

    private static void method(String s) {
        System.out.println("string");
    }

    private static void method(Integer integer) {
        System.out.println("integer");
    }

    private static void parent(Object object) {
        System.out.println("object");
    }

    private static void parent(ParentA parentA) {
        System.out.println("parentA");
    }

    private static void parent(ParentB parentB) {
        System.out.println("parentB");
    }

    private static void parent(ParentC parentC) {
        System.out.println("parentC");
    }

    private static void parent(ParentD parentD) {
        System.out.println("parentD");
    }

}

class ParentA{

}

class ParentB extends ParentA{

}

class ParentC extends ParentB{

}

class ParentD extends ParentB{

}