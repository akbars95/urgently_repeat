package com.mtsmda.designPatterns.structural.proxy;

/**
 * Created by c-DMITMINZ on 14.01.2016.
 */
public class RunMain {

    /**
     * In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
     * <p>
     * In proxy pattern, we create object having original object to interface its functionality to outer world.
     * Implementation
     * <p>
     * We are going to create an Image interface and concrete classes implementing the Image interface. ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
     * <p>
     * ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.
     */
    public static void main(String[] args) {
        Image image = new ProxyImage("1.txt");
        image.display();
        System.out.println("");
        image.display();
    }

}