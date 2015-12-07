package com.mtsmda.designPatterns.structural.composite.option2;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class Cashier implements Employee {

    private Integer id;
    private String name;
    private double salary;

    public Cashier(Integer id, String name, double salary) {
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
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void removeEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployeeByIndex(int index) {
        return null;
    }
}