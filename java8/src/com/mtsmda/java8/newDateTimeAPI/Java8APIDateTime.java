package com.mtsmda.java8.newDateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by MTSMDA on 27.11.2015.
 */
public class Java8APIDateTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime.toLocalDate();
        localDateTime.toLocalTime();

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("d'.'M'.'y''H':'m':'s")));

        System.out.println(LocalDateTime.parse("29.11.2015 9:35:17", DateTimeFormatter.ofPattern("d'.'M'.'y' 'H':'m':'s")));
    }

}