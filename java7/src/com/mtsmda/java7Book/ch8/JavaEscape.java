package com.mtsmda.java7Book.ch8;

/**
 * Created by c-DMITMINZ on 10.12.2015.
 */
public class JavaEscape {

    public static void main(String[] args) {
        System.out.println("\"  \\");
        String file = "E:\\simple\\j06052015\\urgently_repeat\\java7\\.classpath";
        String s[] = file.split("\\.");
        System.out.println(s[0] + "\t " + s[1]);

        String [] ss = file.split("\\\\");
        System.out.println(ss.length);
    }

}