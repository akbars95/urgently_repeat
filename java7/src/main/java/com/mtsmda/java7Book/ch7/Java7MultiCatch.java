package com.mtsmda.java7Book.ch7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by c-DMITMINZ on 09.12.2015.
 */
public class Java7MultiCatch {

    public static void main(String[] args){
        try {
            throw new Exception();
        } catch (FileNotFoundException | SQLException e) {
            System.out.println(e.getClass().getCanonicalName());
        } catch (Exception e) {
            System.out.println(e.getClass().getCanonicalName());
        }

//        ex();


        try {
            rain();
        } /*catch (AExcetion aExcetion) {
            aExcetion.printStackTrace();
        } catch (BException e) {
            e.printStackTrace();
        }*/
        /*catch (AExcetion | BException e){
            System.out.println(e.getClass().getCanonicalName());
        }*/
        catch (Exception e){
            e = new IOException();
            System.out.println(e.getClass().getCanonicalName());
        }

    }

    private static void ex() throws /*IOException,*/ SQLException {
        try {
            throw new SQLException();
        } catch (/*IOException | */SQLException e) {
            /*throw e;*/
            System.out.println();
        }


        /*try {

        }
        catch (RuntimeException | IOException e){

        }*/

    }

    private static void ex2(){
        /*try{
            int c = 1 / 0;
        }
        catch (SQLException | IOException e){
//            e = new IOException();
        }*/
    }

    private static void rain()throws AExcetion, BException{
        throw new BException();
    }

}

class AExcetion extends Exception{

}

class BException extends Exception{}