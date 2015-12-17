package com.mtsmda.springCore.javaConfig;

import com.mtsmda.springCore.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

/**
 * Created by MTSMDA on 14.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeans.class);
        Person personPetrov = applicationContext.getBean("personPetrov", Person.class);
        System.out.println(personPetrov);
        System.out.println(applicationContext.getBean("fileName1txt"));
        System.out.println(applicationContext.getBean("file", File.class).getAbsoluteFile());
    }

}