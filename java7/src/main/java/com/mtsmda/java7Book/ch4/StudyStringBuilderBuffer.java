package com.mtsmda.java7Book.ch4;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class StudyStringBuilderBuffer {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("Java").append(" 8");
        System.out.println(stringBuilder.capacity());
//        stringBuilder.reverse().insert(7, " - new java version");
        System.out.println(stringBuilder.length());
        stringBuilder./*reverse().*/insert(stringBuilder.length(), " - new java version");
        System.out.println(stringBuilder);
    }

}