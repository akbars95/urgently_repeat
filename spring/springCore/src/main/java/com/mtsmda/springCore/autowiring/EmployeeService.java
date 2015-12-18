package com.mtsmda.springCore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
@Component
public class EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void insert(){
        System.out.println("Insert - " + employeeDAO.toString());
    }

}
