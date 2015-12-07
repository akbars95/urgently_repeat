package com.mtsmda.java7Book.ch1;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class JavaMainOtherOptions {

    /*public static void main(String[] args) {
        //Standard main
    }*/

    /*public static void main(String array[]){
//legal
    }*/

    public static void main(String... strings) {
        //legal
        main("Ivan", "Petr");
    }

    public static void main(String str1, String str2){
        System.out.println(str1 + " _ " + str2);
    }

}