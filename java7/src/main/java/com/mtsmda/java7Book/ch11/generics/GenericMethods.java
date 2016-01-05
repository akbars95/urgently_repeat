package com.mtsmda.java7Book.ch11.generics;

import com.mtsmda.java7Book.ch11.generics.model.Animal;
import com.mtsmda.java7Book.ch11.generics.model.Bird;
import com.mtsmda.java7Book.ch11.generics.model.Cat;
import com.mtsmda.java7Book.ch11.generics.model.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class GenericMethods {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Dog()};
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.checkup();
            }
        }

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());
//        listAnimal(animalList);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
//        listAnimal(dogs);
        System.out.println("wildcard---------------------------");
        listAnimals(animalList);

        List<Animal> animalList1 = Arrays.asList(new Bird(), new Cat(), new Dog(), new Animal() {
            @Override
            public void checkup() {
                System.out.println(this.getClass().getCanonicalName() + " - Animal");
            }
        });

        System.out.println("*********************");
        listAnimals(animalList1);

        listDogs(animalList);

    }

    private static void listDogs(List<? super Dog> dogs){
        /*for (Dog dog : dogs){

        }*/
    }

    private static void listAnimals(List<? extends Animal> animals) {
//        animals.add(new Cat());
        for (Animal animal : animals) {
            animal.checkup();
        }
    }

    private static void listAnimal(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.checkup();
        }
    }

}