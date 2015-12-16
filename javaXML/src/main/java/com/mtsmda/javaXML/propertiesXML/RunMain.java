package com.mtsmda.javaXML.propertiesXML;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created by c-DMITMINZ on 16.12.2015.
 */
public class RunMain {

    public static void main(String[] args) throws Exception{
        storePropertiesToXML();

        storeXMLToProperties();
    }

    private static void storePropertiesToXML() throws Exception {
        Properties properties = new Properties();
        properties.put("google", "www.google.com");
        properties.put("yandex", "www.yandex.ru");

        OutputStream outputStream = new FileOutputStream("storePropertiesToXML.xml");

        properties.storeToXML(outputStream, "storeToXML", "UTF-8");
        System.out.println("Done - storePropertiesToXML");
    }

    private static void storeXMLToProperties()throws Exception{
        InputStream inputStream = new FileInputStream("storePropertiesToXML.xml");
        Properties properties = new Properties();
        properties.loadFromXML(inputStream);
        System.out.println(properties.size());
        System.out.println(properties.getProperty("yandex"));
    }

}