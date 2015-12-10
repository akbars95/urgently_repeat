package com.mtsmda.java7Book.ch8.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by c-DMITMINZ on 10.12.2015.
 */
public class JavaResourceBundle {

    public static void main(String[] args) {
        for(String s : Locale.getISOCountries()){
//            if(s.equalsIgnoreCase("RU") || s.equalsIgnoreCase("EN") || s.equalsIgnoreCase("MD") ){
                System.out.println(s);
//            }

        }

        Locale localeEN = Locale.ENGLISH;
        Locale localeRU = Locale.forLanguageTag("RU");
        Locale localeMD = Locale.forLanguageTag("MD");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeRU);
        System.out.println(resourceBundle.getString("textbox.label"));

    }

}