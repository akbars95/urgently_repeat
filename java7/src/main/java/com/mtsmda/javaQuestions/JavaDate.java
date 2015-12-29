package com.mtsmda.javaQuestions;

import java.util.Date;

/**
 * Created by c-DMITMINZ on 10.12.2015.
 */
public class JavaDate {

    public static void main(String[] args) {
        Date dateToday = new Date();
        Date date = new Date(2007 - 1900, 03, 03);
        System.out.println(dateToday.after(date) ? "Today after 2007.03.03" : "Today before 2007.03.03");

        Date date2016 = new Date(2016 - 1900, 01,01);
        System.out.println(dateToday.before(date2016) ? "Today before 2016" : "NO!");
        System.out.println(date);
    }

}