package com.mtsmda.springCore.SpEL.referenceBean;

import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "tellBean")
public class TellBean {

    public String sayHello(String message) {
        return "Hello, here your message - " + message;
    }

    public String information(String name, Integer age, Integer integer, String pet) {
        return "Information - Hello, my name is " + name + ". I am " + age + " my favorite number - " + integer + ", pet - " + pet;
    }

    public Double get100(Double d){
        return d * 100;
    }

}