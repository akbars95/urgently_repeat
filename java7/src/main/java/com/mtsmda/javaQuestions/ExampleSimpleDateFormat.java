package com.mtsmda.javaQuestions;

import org.joda.time.LocalTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by c-DMITMINZ on 29.12.2015.
 */
public class ExampleSimpleDateFormat {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        System.out.println(dateFormat.format(date));

        LocalTime localTime = new LocalTime();
        System.out.println(localTime.toString());
        System.out.println(localTime.getMillisOfDay());
    }
    
}