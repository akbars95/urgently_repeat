package com.mtsmda.java7Book.ch8.resourceBundle;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by c-DMITMINZ on 11.12.2015.
 */
public class JavaResourceBundleSaveInJavaCode {

    public static void main(String[] args) {
        Locale localeRu = new Locale("ru", "RU");
        System.out.println(localeRu);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.mtsmda.java7Book.ch8.resourceBundle.Message_ru_RU", localeRu);
        System.out.println(resourceBundle.getObject("bicycle"));
    }

}

class Message_ru_RU extends ListResourceBundle{

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