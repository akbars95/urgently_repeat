package com.mtsmda.springCore.OXM;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class Computer {

    private String manufacturer;
    private Integer volumeHDD;
    private boolean gram;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getVolumeHDD() {
        return volumeHDD;
    }

    public void setVolumeHDD(Integer volumeHDD) {
        this.volumeHDD = volumeHDD;
    }

    public boolean isGram() {
        return gram;
    }

    public void setGram(boolean gram) {
        this.gram = gram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", volumeHDD=" + volumeHDD +
                ", gram=" + gram +
                '}';
    }
}