package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 20.11.2015.
 */
public class StringBuilderEx {

    public static void main(String[] args) {
        stringBuilderEx();
        stringConcatMethodEx();
        stringConcatEx();

        System.out.println("Diffenrence!");

        //????????
        String s = "";
        long start = System.nanoTime();
        for (int i = 0; i < 256; i++) {
            s = s + (char)i;
        }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println(time);


        //??????
        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 256; i++) {
            sb.append((char)i);
        }
        end = System.nanoTime();
        time = end - start;
        System.out.println(time);


    }

    private static void stringBuilderEx(){
        System.out.println("stringBuilderEx()");
        StringBuilder stringBuilder = new StringBuilder();
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            stringBuilder.append(i);
        }

        long end = System.nanoTime();
        long time = end - start;
        System.out.println(time + " in milliseconds - " + (time / 1_000_000));
        System.out.println(stringBuilder.toString());
    }

    private static void stringConcatMethodEx(){
        System.out.println("stringConcatMethodEx()");
        String string = new String();
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            string.concat(new String("" + i));
        }

        long end = System.nanoTime();
        long time = end - start;
        System.out.println(time + " in milliseconds - " + (time / 1_000_000));
        System.out.println(string.toString());
    }

    private static void stringConcatEx(){
        System.out.println("stringConcatEx()");
        String string = new String();
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            string += i;
        }

        long end = System.nanoTime();
        long time = end - start;
        System.out.println(time + " in milliseconds - " + (time / 1_000_000));
        System.out.println(string.toString());
    }

}
