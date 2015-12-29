package com.mtsmda.java7Book.ch6;

/**
 * Created by c-DMITMINZ on 09.12.2015.
 */
public class JavaSwitch {

    public static final String MERCEDES = "mercedes";

    public static void main(String[] args) {
        char c = 'G';
        switch (c){
            case 'G':{
                System.out.println("Here");
                System.out.println("Here2");
                break;
            }
            case 'I':
                System.out.println("I Here");
                System.out.println("I Here2");
                break;
        }

        SimpleEnum simpleEnum = SimpleEnum.BIG;
        switch (simpleEnum){
            case MIDDLE:{
                System.out.println("hello");
                break;
            }
            case SMALL:{
                System.out.println("helloSMALL");
                break;
            }
            case BIG:{
                System.out.println("helloBIG");
                break;
            }
        }

        String carName = "Audi";
        switch (carName){
            case "BMW":{
                System.out.println(carName);
                break;
            }
            case "Renault":{
                System.out.println(carName);
                break;
            }
            case "Audi":{
                System.out.println(carName);
                break;
            }
            case MERCEDES:{
                System.out.println(carName);
                break;
            }
        }

        final int a = 1;
        final int b;
        b = 2;
        int x = 0;
        switch (x){
            case a:{

            }
            /*case b:{

            }*/
        }


    }

}

enum SimpleEnum{

    BIG, SMALL, MIDDLE;

}