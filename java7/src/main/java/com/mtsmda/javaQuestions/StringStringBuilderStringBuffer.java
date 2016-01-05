package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class StringStringBuilderStringBuffer {

    public static void main(String[] args) {
        String s = new String("fshjs");
        System.out.println(s.length());

        StringBuilder stringBuilder = new StringBuilder(s + "sdfsdf");
        System.out.println(stringBuilder.length());

        StringBuffer stringBuffer = new StringBuffer(stringBuilder.toString() + "dsfsfs545");
        System.out.println(stringBuffer.length());

        /*stringBuilder += "sadad";
        stringBuilder = stringBuilder.toString() + "sadad";*/
    }

}