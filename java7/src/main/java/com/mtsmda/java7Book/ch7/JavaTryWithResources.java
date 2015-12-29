package com.mtsmda.java7Book.ch7;

import java.io.*;

/**
 * Created by c-DMITMINZ on 10.12.2015.
 */
public class JavaTryWithResources {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("E:\\simple\\j06052015\\urgently_repeat\\java7\\java7.iml");
             Reader reader = new BufferedReader(fileReader);) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        catchOrFinnaly();
        beforeJAVA7();

        try (MyResource myResource = new MyResource();
             MyResource myResource2 = new MyResource();) {
            System.out.println("inner TRY = " + myResource.getClass().getCanonicalName());
            throw new  RuntimeException();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

        /*try(String s = "19";){
//Error:(26, 20) java: incompatible types: try-with-resources not applicable to variable type
            (java.lang.String cannot be converted to java.lang.AutoCloseable)
        }*/

    }

    private static void catchOrFinnaly() {
        try {
//            throw new Exception();
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
        }
    }

    private static void beforeJAVA7() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("E:\\simple\\j06052015\\urgently_repeat\\java7\\.gitignore")));
            int c = 0;
            System.out.println("\n");
            System.out.println("E:\\simple\\j06052015\\urgently_repeat\\java7\\.gitignore");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    reader = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("public void close() throws Exception");
    }
}