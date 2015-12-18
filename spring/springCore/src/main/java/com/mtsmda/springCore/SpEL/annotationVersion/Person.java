package com.mtsmda.springCore.SpEL.annotationVersion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "personGrigorii")
public class Person {

    @Value(value = "Grigorii")
    private String name;

    @Value(value = "19")
    private Integer age;

    @Value(value = "#{javaDev}")
    private Profession profession;

    @Value(value = "#{javaDev.salary - (javaDev.salary * 0.2)}")
    private Double salaryWithoutTax;

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

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Double getSalaryWithoutTax() {
        return salaryWithoutTax;
    }

    public void setSalaryWithoutTax(Double salaryWithoutTax) {
        this.salaryWithoutTax = salaryWithoutTax;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession=" + profession +
                ", salaryWithoutTax=" + salaryWithoutTax +
                '}';
    }
}