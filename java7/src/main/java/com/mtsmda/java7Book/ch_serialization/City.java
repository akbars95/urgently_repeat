package com.mtsmda.java7Book.ch_serialization;

import java.io.Serializable;

/**
 * Created by c-DMITMINZ on 19.01.2016.
 */
public class City extends Country implements Serializable{

    private String cityName;
    public static Integer cityNumber = 0;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                '}';
    }
}