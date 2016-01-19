package com.mtsmda.java7Book.ch_serialization;

import com.mtsmda.javaQuestions.castClasses.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by c-DMITMINZ on 18.01.2016.
 */
public class RunMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        File file = new File("cat1.ser");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(cat);
            objectOutputStream.close();
        } catch (Exception e) {
            exceptionHandler(e);
        }

        try {
            Cat cat1 = null;
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            if (o instanceof Cat) {
                cat1 = (Cat) o;
                objectInputStream.close();
            }
            System.out.println(cat1);
        } catch (Exception e) {
            exceptionHandler(e);
        }

        System.out.println("---------------------------");
        Color color = new Color(255, 0, 255);
        Collar collar9 = new Collar(9);
//        collar9.setColor(color); //java.io.NotSerializableException
        SubNotSerialazedObject subNotSerialazedObject = new SubNotSerialazedObject("Ivan", 35);
        Dog dog = new Dog(collar9, 15);
        dog.setColor(new Color(14, 19, 98));
        dog.setSubNotSerialazedObject(subNotSerialazedObject);
        File file1 = new File("dog1.ser");
        serialize(dog, file1);
        Dog deserialize = deserialize(Dog.class, file1);
        System.out.println(dog);
        System.out.println(deserialize + " - des");
        System.out.println(deserialize.dogNumber);


        City city = new City();
        city.setCountryName("Spain");
        city.setCityName("Barcelona");
        city.cityNumber =+ 10;

        File fileBS = new File("cityBS.txt");
        serialize(city, fileBS);
        City deserialize1 = deserialize(City.class, fileBS);
        System.out.println(city.toString() + " - " + city.getCountryName() + "  #" + City.cityNumber);
        System.out.println(deserialize1.toString() + " - " + deserialize1.getCountryName() + "  #" + deserialize1.cityNumber);

        NotSerialazedObject notSerialazedObject = new NotSerialazedObject("Grigorii", 19);
        serialize(notSerialazedObject, new File("t.txt"));

    }

    private static <T extends Object> void serialize(T obj, File file) {
        System.out.println("serialize");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
        } catch (Exception e) {
            exceptionHandler(e);
        }

    }

    private static <T extends Object> T deserialize(Class<T> aClass, File file) {
        System.out.println("deserialize");
        T t = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            t = (T) o;
            objectInputStream.close();
        } catch (Exception e) {
            exceptionHandler(e);
        }
        return t;
    }

    private static void exceptionHandler(Exception e) {
        System.out.println(e.getMessage() + " - - - - - " + e.getClass().getCanonicalName());
    }

}