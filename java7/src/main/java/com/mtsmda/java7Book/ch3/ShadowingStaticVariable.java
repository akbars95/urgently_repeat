package com.mtsmda.java7Book.ch3;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class ShadowingStaticVariable {

    public static int count = 0;

    private static void changeIt(int count) {
        count += 90;
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println(count);
        changeIt(count);
        System.out.println(count);

        System.out.println("\n\n\n_________________________");
        Country country = new Country("Moldova", 1953.6);
        System.out.println("before = " + country);
        changeCountry(country);
        System.out.println("after = " + country);
    }

    private static void changeCountry(Country country) {
        country.setArea(93.2);
        System.out.println("inner method = " + country);
        country = new Country("Russia", 153568.52);
        System.out.println("inner method other instance = " + country);
    }


}

class Country {
    private String name;
    private Double area;

    public Country(String name, Double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}