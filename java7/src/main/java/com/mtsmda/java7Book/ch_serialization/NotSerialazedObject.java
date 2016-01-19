package com.mtsmda.java7Book.ch_serialization;

/**
 * Created by c-DMITMINZ on 18.01.2016.
 */
public class NotSerialazedObject {

    private String name;
    private Integer age;

    public NotSerialazedObject() {

    }

    public NotSerialazedObject(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "NotSerialazedObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}