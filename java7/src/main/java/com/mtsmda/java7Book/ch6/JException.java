package com.mtsmda.java7Book.ch6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by MTSMDA on 12.01.2016.
 */
public class JException {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            throw new RuntimeException("First");
        }
        finally {
            throw new RuntimeException("Second");
        }
    }

}