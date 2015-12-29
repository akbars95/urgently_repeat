package com.mtsmda.java7Book.ch9.collections.sort;

import com.mtsmda.java7Book.ch9.collections.model.DVD;

import java.util.Comparator;

/**
 * Created by c-DMITMINZ on 29.12.2015.
 */
public class DVDComparatorGender implements Comparator<DVD> {

    @Override
    public int compare(DVD o1, DVD o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}