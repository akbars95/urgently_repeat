package com.mtsmda.java8.linkMethod;

/**
 * Created by MTSMDA on 23.11.2015.
 */
public class LinkStatic {

    private static String stringOp(StringFunc stringFunc, String text){
        return stringFunc.stringOp(text);
    }

    private static int stringOpCount(StringLetterCount stringLetterCount, String text){
        return stringLetterCount.count(text);
    }

    public static void main(String[] args) {
        System.out.println(stringOp(MyStringOp::stringReverse, "TXTPDF"));
        System.out.println(stringOpCount(MyStringOp::stringLetterCount, "TXTPDF"));
    }

}

interface StringFunc{

    public String stringOp(String text);

}

interface StringLetterCount{

    public int count(String text);

}

class MyStringOp{

    public static String stringReverse(String text){
        String textReturn = "";
        for (int i = text.length() - 1; i >= 0; i--){
            textReturn += text.charAt(i);
        }
        return textReturn;
    }

    public static int stringLetterCount(String text){
        return text.length();
    }


}