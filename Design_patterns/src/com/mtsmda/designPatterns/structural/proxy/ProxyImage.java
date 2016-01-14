package com.mtsmda.designPatterns.structural.proxy;

/**
 * Created by c-DMITMINZ on 14.01.2016.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(this.filename);
        }
        this.realImage.display();
    }
}