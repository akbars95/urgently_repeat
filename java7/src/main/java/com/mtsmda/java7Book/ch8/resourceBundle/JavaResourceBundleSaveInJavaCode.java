package com.mtsmda.java7Book.ch8.resourceBundle;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Created by c-DMITMINZ on 11.12.2015.
 */
public class JavaResourceBundleSaveInJavaCode {

    public static void main(String[] args) {
        Locale localeRu = new Locale("de", "DE");
        System.out.println(localeRu);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.mtsmda.java7Book.ch8.resourceBundle.Message", localeRu);
        System.out.println(resourceBundle.getObject("bicycle"));
        localeRu = new Locale("ru");
        resourceBundle = ResourceBundle.getBundle("com.mtsmda.java7Book.ch8.resourceBundle.Message", localeRu);
        System.out.println(resourceBundle.getObject("bicycle"));
    }

}
