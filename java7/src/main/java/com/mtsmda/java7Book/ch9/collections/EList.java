package com.mtsmda.java7Book.ch9.collections;

import com.mtsmda.java7Book.ch9.collections.model.DVD;
import com.mtsmda.java7Book.ch9.collections.sort.DVDComparatorGender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by c-DMITMINZ on 29.12.2015.
 */
public class EList {

    public static void main(String[] args) {
        arrayList();
    }

    private static void arrayList() {
        List<String> strings = new ArrayList<>();
        strings.add("Ivan");
        strings.add("rubit");
        strings.add("drova");
        strings.add("padej");
        strings.add("Varvara");
        strings.add("topit");
        strings.add("peci");
        System.out.println(strings.size());
        System.out.println(strings.contains("ivan"));
        System.out.println(strings.contains("Ivan"));
        strings.remove("padej");
        System.out.println(strings.size());
        System.out.println("unsorted - " + strings);
        Collections.sort(strings);
        System.out.println("sorted - " + strings);

        List<DVD> dvds = Arrays.asList(new DVD("my favorite", "classic", "actor1"), new DVD("very song", "classic", "actor1"), new DVD("good song 1", "classic", "actor1"), new DVD("song 1", "classic", "actor1"), new DVD("pfong 1", "jazz", "ivanov"));
        System.out.println(dvds);
        Collections.sort(dvds);
        System.out.println(dvds);

        Collections.sort(dvds, new DVDComparatorGender());
        System.out.println("DVDComparatorGender = " + dvds);

    }

}