package com.mtsmda.designPatterns.structural.composite.option2;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public interface Employee {

    public Integer getId();
    public String getName();
    public double getSalary();
    public void print();
    public void addEmployee(Employee employee);
    public void removeEmployee(Employee employee);
    public Employee getEmployeeByIndex(int index);

}