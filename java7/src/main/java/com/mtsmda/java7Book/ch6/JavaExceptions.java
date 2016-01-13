package com.mtsmda.java7Book.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by c-DMITMINZ on 09.12.2015.
 */
public class JavaExceptions {

    public static void main(String[] args) {
        multiplyExceptions();

//        error();
        error2();
        int i = 1000;
        try {
            /*File file = new File("E:\\simple\\j06052015\\urgently_repeat\\java7\\java7.iml");
            FileReader fileReader = new FileReader(file);*/
            switch (i) {
                case 0: {
                    throw new Exception("case 0");
//                    i = 5;
//                    break;
                }
                case 10: {
                    throw new IOException("case 10");
//                    i = 5;
//                    break;
                }
                case 100: {
                    throw new FileNotFoundException("case 100");
//                    i = 5;
//                    break;
                }
                case 1000: {
                    throw new Throwable("case 1000");
//                    i = 5;
//                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (IOException e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (Exception e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (Throwable e) {
            System.out.println(e.getClass().getCanonicalName());
        } finally {
            System.out.println("finally");
        }

        try {
            System.out.println("try without finally");
            throw new RuntimeException();
        } finally {
            System.out.println("FINALLY");
        }



    }

    private static void error() {
        throw new AssertionError("Hello!");
    }

    private static void error2() {
        try {
            throw new Error();
        } catch (Error e) {
            throw e;
        }
    }

    private static void multiplyExceptions(){
        try {
            double result = 15 / 0;
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("multiplyExceptions - " + e.getMessage());
        }

        try{
            if(true){
                throw new SQLException();
            }
            throw new IOException();
        }
        catch (RuntimeException | IOException | SQLException e){

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}