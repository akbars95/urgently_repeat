package com.mtsmda.hibernateM.model;

/**
 * Created by c-DMITMINZ on 08.12.2015.
 */
public class Person {

    private Long idPerson;
    private String firstNamePerson;
    private String lastNamePerson;

    public Person() {

    }

    public Person(String firstNamePerson, String lastNamePerson) {
        this.firstNamePerson = firstNamePerson;
        this.lastNamePerson = lastNamePerson;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstNamePerson() {
        return firstNamePerson;
    }

    public void setFirstNamePerson(String firstNamePerson) {
        this.firstNamePerson = firstNamePerson;
    }

    public String getLastNamePerson() {
        return lastNamePerson;
    }

    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", firstNamePerson='" + firstNamePerson + '\'' +
                ", lastNamePerson='" + lastNamePerson + '\'' +
                '}';
    }
}