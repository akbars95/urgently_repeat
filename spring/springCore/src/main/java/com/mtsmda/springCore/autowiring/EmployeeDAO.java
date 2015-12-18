package com.mtsmda.springCore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component
public class EmployeeDAO {

    @Autowired
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeDAO{" +
                "employee=" + employee +
                '}';
    }
}