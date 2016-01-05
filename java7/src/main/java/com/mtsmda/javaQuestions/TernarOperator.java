package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class TernarOperator {

    public static void main(String[] args) {
        int c = 95;

        String s = (c < 13) ? "one true" : (c > 90)? "two true":"two false";
        System.out.println(s);
    }


}