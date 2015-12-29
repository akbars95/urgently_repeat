package com.mtsmda.java7Book.ch7;

/**
 * Created by c-DMITMINZ on 10.12.2015.
 */
public class JavaNestedExceptions {

    public static void main(String[] args) {

        try {
            try {
                try(MyResource myResource = new MyResource()) {
                    System.out.println("-----");
                    myResource.close();
                    System.out.println("-----");
                    throw new Exception();
                }
            }
            finally {
                System.out.println("inner finally");
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getCanonicalName());
        }
    }

}