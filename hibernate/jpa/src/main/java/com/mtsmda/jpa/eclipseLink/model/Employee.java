package com.mtsmda.jpa.eclipseLink.model;

import javax.persistence.*;

/**
 * Created by c-DMITMINZ on 30.12.2015.
 */
@NamedQuery(name = "select_all_with_salary_greatThan2500", query = "from Employee e where e.salary >= 2500 order by e.salary asc")
@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eId;
    private String ename;
    private Double salary;
    private String deg;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Departament.class, fetch = FetchType.EAGER)
    private Departament departament;

    public Employee() {

    }

    public Employee(String ename, Double salary, String deg) {
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                '}';
    }
}