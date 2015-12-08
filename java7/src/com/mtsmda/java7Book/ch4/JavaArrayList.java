package com.mtsmda.java7Book.ch4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class JavaArrayList {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Short((short) 19));
        numbers.add(new Double(19.25));
        numbers.add(new Integer(692));
        numbers.add(new BigDecimal(95));
        numbers.add(new Byte((byte) 9));

        for (Number number : numbers) {
            System.out.println(number + " = " + number.getClass().getCanonicalName());
        }

    }

}