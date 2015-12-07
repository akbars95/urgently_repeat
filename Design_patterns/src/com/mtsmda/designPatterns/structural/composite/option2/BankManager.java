package com.mtsmda.designPatterns.structural.composite.option2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class BankManager implements Employee {

    private Integer id;
    private String name;
    private double salary;

    private List<Employee> employees = new ArrayList<>();

    public BankManager(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void print() {
        System.out.println("=====");
        System.out.println("Id = " + this.getId());
        System.out.println("Name = " + this.getName());
        System.out.println("Salary = " + this.getSalary());
        System.out.println("=====");

        for (Employee employee : employees){
            employee.print();
        }

    }

    @Override
    public void addEmployee(Employee employee) {
this.employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
this.employees.remove(employee);
    }

    @Override
    public Employee getEmployeeByIndex(int index) {
        return this.employees.get(index);
    }
}