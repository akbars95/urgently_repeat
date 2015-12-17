package com.mtsmda.springCore.di;

/**
 * Created by MTSMDA on 14.12.2015.
 */
public class CSVOutputGenerator implements OutputGenerator{

    public void generate(String s) {
        System.out.println("CSV file - " + s);
    }
}