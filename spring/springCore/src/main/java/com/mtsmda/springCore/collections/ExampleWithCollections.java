package com.mtsmda.springCore.collections;

import com.mtsmda.springCore.Person;

import java.util.*;

/**
 * Created by c-DMITMINZ on 17.12.2015.
 */
public class ExampleWithCollections {

    private Map<String, Double> productPrice = new HashMap<>();
    private List<Character> genderPersons = new ArrayList<>();
    private Set<Person> persons = new HashSet<>();
    private Properties propertiesDB = new Properties();

    public Map<String, Double> getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Map<String, Double> productPrice) {
        this.productPrice = productPrice;
    }

    public List<Character> getGenderPersons() {
        return genderPersons;
    }

    public void setGenderPersons(List<Character> genderPersons) {
        this.genderPersons = genderPersons;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public Properties getPropertiesDB() {
        return propertiesDB;
    }

    public void setPropertiesDB(Properties propertiesDB) {
        this.propertiesDB = propertiesDB;
    }
}