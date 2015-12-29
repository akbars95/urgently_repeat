package com.mtsmda.java7Book.ch8.resourceBundle;

import java.util.ListResourceBundle;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
public class Message extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Привет"},
                {"car", "Машина"},
                {"bicycle", "велосипед"},
                {"milk", "Молоко"},
                {"bread", "Хлеб"}
        };
    }
}