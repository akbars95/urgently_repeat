package com.mtsmda.designPatterns.structural.composite.option2;

/**
 * Created by MTSMDA on 02.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        Employee employee = new Accountant(12, "Petr", 20.12);
        Employee employee1 = new BankManager(10, "Ivan", 12.20);
        Employee employee2 = new Cashier(5, "Uvas", 95.25);

        employee1.addEmployee(employee);
        employee1.addEmployee(employee2);

        employee1.print();
    }

}