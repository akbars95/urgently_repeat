package com.mtsmda.springCore.jdbc.model;

/**
 * Created by MTSMDA on 18.12.2015.
 */
public class CustomerJ {

    private Integer customerId;
    private String name;
    private int age;

    public CustomerJ() {

    }

    public CustomerJ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerJ{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}