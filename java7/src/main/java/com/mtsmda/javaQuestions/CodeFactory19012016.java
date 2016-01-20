package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 20.01.2016.
 */
public class CodeFactory19012016 {

    public static void main(String[] args) {
        System.out.println(mod2(1024));
        System.out.println(mod2(100));
        System.out.println(mod2(103));
        System.out.println(mod2(-1024));
        System.out.println(mod2(0));
    }

    private static boolean mod2(int integer) {
        if(integer == 0){
            return false;
        }

        if (integer < 0) {
            integer = integer * (-1);
        }
        while (integer >= 2) {
            if (integer % 2 != 0) {
                return false;
            } else {
                integer /= 2;
            }
        }
        return true;
    }

}