package com.mtsmda.designPatterns.structural.proxy;

/**
 * Created by c-DMITMINZ on 14.01.2016.
 */
public class RealImage implements Image{

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename + " ...");
    }

    private void loadFromDisk(){
        System.out.println("Loading ... " + this.filename);
    }

}