package com.mtsmda.javaQuestions.immutable;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 * <p>
 * To create a class immutable, you need to follow following steps:
 * <p>
 * Declare the class as final so it can’t be extended.
 * Make all fields private so that direct access is not allowed.
 * Don’t provide setter methods for variables
 * Make all mutable fields final so that it’s value can be assigned only once.
 * Initialize all the fields via a constructor performing deep copy.
 * Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */
public final class ImmutableClassPerson {

    private final String name;
    private final Integer age;

    public ImmutableClassPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutableClassPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}