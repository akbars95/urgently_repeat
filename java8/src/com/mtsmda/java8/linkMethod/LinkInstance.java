package com.mtsmda.java8.linkMethod;

/**
 * Created by MTSMDA on 23.11.2015.
 */
public class LinkInstance {

    private static String stringUC(StringToUpperCase stringToUpperCase, String text) {
        return stringToUpperCase.uppercase(text);
    }

    private static <T> int counter(T[] values, TemperatureAble<T> tTemperatureAble, T t) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (tTemperatureAble.equals(values[i], t)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringToUpperCaseImpl stringToUpperCaseImpl = new StringToUpperCaseImpl();
        System.out.println(stringUC(stringToUpperCaseImpl::toUpperCase, "Hello SImple"));
//        System.out.println(stringUC(stringToUpperCaseImpl::wordCount, "Hello SImple"));

        int count = 0;
        HighTemparatureForDay highTemparatureForDay[] = new HighTemparatureForDay[]{new HighTemparatureForDay(19), new HighTemparatureForDay(25),
                new HighTemparatureForDay(20), new HighTemparatureForDay(17),
                new HighTemparatureForDay(19), new HighTemparatureForDay(39),
                new HighTemparatureForDay(19)};

        count = counter(highTemparatureForDay, HighTemparatureForDay::sameTemperature, new HighTemparatureForDay(19));
        System.out.println("count = " + count);
    }

}

class StringToUpperCaseImpl {

    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    public int wordCount(String text) {
        return text.split(" ").length;
    }

}

interface StringToUpperCase {

    public String uppercase(String text);

}

interface TemperatureAble<T> {

    public boolean equals(T t1, T t2);

}

class HighTemparatureForDay {
    private int temperature;

    public HighTemparatureForDay(int temperature) {
        this.temperature = temperature;
    }

    public boolean sameTemperature(HighTemparatureForDay highTemparatureForDay) {
        return this.temperature == highTemparatureForDay.getTemperature();
    }

    public int getTemperature() {
        return temperature;
    }
}