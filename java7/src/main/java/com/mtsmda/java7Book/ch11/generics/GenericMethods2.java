package com.mtsmda.java7Book.ch11.generics;

import com.mtsmda.java7Book.ch11.generics.model.*;

import javax.swing.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by c-DMITMINZ on 05.01.2016.
 */
public class GenericMethods2 {

    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Dog(), new Bird(), new Cat(), new CatalanSheepdogDog());
        List<Dog> dogList = Arrays.asList(new Dog(), new CatalanSheepdogDog(), new SouthRussianOvcharkaDod());
        List<CatalanSheepdogDog> catalanSheepdogDogs = Arrays.asList(new CatalanSheepdogDog(), new CatalanSheepdogDog());

        List<Integer> integers = Arrays.asList(new Integer(19));

//        listDogs(animalList);
        listDogs(dogList);

        listSuperDogs(animalList);
        listSuperDogs(dogList);
//        listSuperDogs(catalanSheepdogDogs);
//        listSuperDogs(integers);
        listSuperDogs(new ArrayList<Object>());
        listSuperDogs(new ArrayList<Dog>());
        listSuperDogs(new ArrayList<Animal>());
//        listSuperDogs(new ArrayList<Bird>());

        /*Collections.synchronizedList()*/
        List<Animal> animals = Arrays.asList(new Cat(), new Dog(), new Bird());
        List<Dog> dogs = Arrays.asList(new Dog(), new SouthRussianOvcharkaDod(), new GermanShepherdDog());

//        listDogs(animals);
//        listDogs(new ArrayList<Bird>());
        listDogs(dogs);

        listSuperDogs(animals);
        listSuperDogs(dogs);
//        listSuperDogs(new ArrayList<Bird>());
        listSuperDogs(new ArrayList<Object>());
//        listSuperDogs(new Object());

        allList(animals);
        allList(dogs);

        List<Object> objects = new ArrayList<>();
        objects.add(new BigInteger("19"));
        objects.add(new Object());
        allList(objects);
        allList(new ArrayList<Object>());
        allList(new ArrayList<JButton>());

//        allObjects(animals);
//        allObjects(dogs);
        allObjects(new ArrayList<Object>());
//        allObjects(new ArrayList<String>());


        animals(new ArrayList<Animal>());
//        animals(new ArrayList<Dog>());

        dogs(new ArrayList<Dog>());
//        dogs(new ArrayList<SouthRussianOvcharkaDod>());
    }

    private static void dogs(List<Dog> dogs){
        dogs.add(new Dog());
//        dogs.add(new Animal());
//        dogs.add(new Bird());
        dogs.add(new SouthRussianOvcharkaDod());
        dogs.add(new CatalanSheepdogDog());
    }

    private static void animals(List<Animal> animals){
        animals.add(new Bird());
        animals.add(new Cat());
    }

    /**
     * only object class types
     * */
    private static void allObjects(List<Object> objects){
        objects.add(new BigInteger("19"));
        objects.add(new Integer(15));
        System.out.println("---------------------------------only Objects");
    }

    /**
     * all types
     * */
    private static void allList(List<?> objects) {
//        objects.add(new BigInteger("95"));
        System.out.println("---------------------------------all types");
        for(Object o : objects){
            System.out.println(o);
        }
    }

    /**
     * Animal
     * Animals(Dog, Cat, Bird)
     * Dogs(CatalanSheepdogDog, GermanShepherdDog, SouthRussianOvcharkaDod)
     * <p>
     * all classes which is a dog or subClasses of Dog, CatalanSheepdogDog, GermanShepherdDog, SouthRussianOvcharkaDod
     */
    private static void listDogs(List<? extends Dog> dogs) {
//        dogs.add(new CatalanSheepdogDog());
//        dogs.add(new Dog());
        for (Dog dog : dogs) {
            System.out.println(dog.getClass().getCanonicalName());
        }
        System.out.println("----------------------------------");
    }


    /**
     * all classes is a Dog and All superClasses of Dog
     * Dog, Animal, Object
     */
    private static void listSuperDogs(List<? super Dog> list) {
//        list.add(new Dog());
//        list.add(new CatalanSheepdogDog());
        for (Object o : list) {
            System.out.println(o.getClass().getCanonicalName());
        }
        System.out.println("----------------------------------");
    }

}