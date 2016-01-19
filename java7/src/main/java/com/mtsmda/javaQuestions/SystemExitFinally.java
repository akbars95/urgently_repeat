package com.mtsmda.javaQuestions;

/**
 * Created by c-DMITMINZ on 15.01.2016.
 */
public class SystemExitFinally {

    public static void main(String[] args) {
        boolean flag = false;
        try{
            if(flag){
                while (true){

                }
            }else{
                System.exit(1);
            }
        }
        finally {
            System.out.println("finally");
        }
    }

}