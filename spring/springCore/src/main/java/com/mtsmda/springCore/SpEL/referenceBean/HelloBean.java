package com.mtsmda.springCore.SpEL.referenceBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "helloBean1")
public class HelloBean {

    @Value("This is my message to you")
    private String message;

    @Value(value = "Fred")
    private String name;

    @Value(value = "29")
    private Integer age;

    @Value(value = "#{tellBean.sayHello(helloBean1.message)}")
    private String sayHello;

    @Value(value = "#{tellBean.information(helloBean1.name, helloBean1.age, 309, 'dog'.toUpperCase())}")
    private String myInformation;

    @Value(value = "#{tellBean.get100(100)}")
    private Double aDouble100;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSayHello() {
        return sayHello;
    }

    public void setSayHello(String sayHello) {
        this.sayHello = sayHello;
    }

    public String getMyInformation() {
        return myInformation;
    }

    public void setMyInformation(String myInformation) {
        this.myInformation = myInformation;
    }

    public Double getaDouble100() {
        return aDouble100;
    }

    public void setaDouble100(Double aDouble100) {
        this.aDouble100 = aDouble100;
    }

    @Override
    public String toString() {
        return "HelloBean{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}