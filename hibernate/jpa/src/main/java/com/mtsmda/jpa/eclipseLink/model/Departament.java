package com.mtsmda.jpa.eclipseLink.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
@Entity
@Table
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dId;
    private String dName;

    @OneToMany(targetEntity = Employee.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "departament")
    private List<Employee> employees;

    public Departament() {

    }

    public Departament(String dName) {
        this.dName = dName;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                '}';
    }
}