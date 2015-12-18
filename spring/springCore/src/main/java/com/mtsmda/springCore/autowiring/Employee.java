package com.mtsmda.springCore.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component(value = "employee1")
public class Employee {

    @Value(value = "Petro")
    private String name;

    @Value("PHP dev")
    private String occupation;

    @Value(value = "17000")
    private int salary;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
