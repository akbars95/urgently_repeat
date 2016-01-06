package com.mtsmda.javaQuestions;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by MTSMDA on 05.01.2016.
 */
public class SystemProperties {

    public static void main(String[] args) {
        System.setProperty("aaa", "bbb");
        Properties properties = System.getProperties();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for(Map.Entry<Object, Object> objectObjectEntry : entries){
            System.out.println(objectObjectEntry.getKey() + " ______ " + objectObjectEntry.getValue());
        }

        System.out.println("------------------------");
        System.out.println(System.getProperty("aaa"));
        System.out.println(System.getProperty("bbb"));
        System.out.println(System.getProperty("ccc", "ccc"));
    }

}