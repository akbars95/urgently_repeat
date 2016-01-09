package com.mtsmda.java7Book.ch11.generics;

import com.mtsmda.java7Book.ch11.generics.model.*;

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

//        allObjects(animals);
//        allObjects(dogs);

    }

    private static void allObjects(List<Object> objects){
        System.out.println("---------------------------------allObjects");
    }

    private static void allList(List<?> objects) {
        System.out.println("---------------------------------all");
        for(Object o : objects){
            System.out.println(o);
        }
    }

    /**
     * Animal
     * Animals(Dog, Cat, Bird)
     * Dogs(CatalanSheepdogDog, GermanShepherdDog, SouthRussianOvcharkaDod)
     * <p>
     * all classes which is a dog or subClasses of Dog
     */
    private static void listDogs(List<? extends Dog> dogs) {
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
        for (Object o : list) {
            System.out.println(o.getClass().getCanonicalName());
        }
        System.out.println("----------------------------------");
    }

}