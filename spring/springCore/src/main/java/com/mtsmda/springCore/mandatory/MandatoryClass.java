package com.mtsmda.springCore.mandatory;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class MandatoryClass {

    private String color;
    private Integer r;

    public MandatoryClass() {

    }

    public MandatoryClass(String color, Integer r) {
        this.color = color;
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    @Mandatory
    public void setColor(String color) {
        this.color = color;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "MandatoryClass{" +
                "color='" + color + '\'' +
                ", r=" + r +
                '}';
    }
}