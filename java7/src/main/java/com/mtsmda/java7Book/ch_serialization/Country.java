package com.mtsmda.java7Book.ch_serialization;

/**
 * Created by c-DMITMINZ on 19.01.2016.
 */
public class Country {

    private String countryName = "Moldova";

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}