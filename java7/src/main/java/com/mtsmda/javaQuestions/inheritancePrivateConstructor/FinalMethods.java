package com.mtsmda.javaQuestions.inheritancePrivateConstructor;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class FinalMethods {

    public static void main(String[] args) {

    }

}

class AA{

    public final void print(){
        System.out.println("AA");
    }

    private final void print(String s){
        System.out.println("AA - " + s);
    }

}

class BB extends AA{
    /*public final void print(){
        System.out.println("AA");
    }*/

    public final void print(String s){
        System.out.println("AA - " + s);
    }

}