package com.mtsmda.java7Book.ch11.generics;

import com.mtsmda.java7Book.ch11.generics.model.Animal;
import com.mtsmda.java7Book.ch11.generics.model.CatalanSheepdogDog;
import com.mtsmda.java7Book.ch11.generics.model.Dog;
import com.mtsmda.java7Book.ch11.generics.model.SouthRussianOvcharkaDod;

import java.util.*;

/**
 * Created by MTSMDA on 09.01.2016.
 */
public class GenericMethods3 {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new CatalanSheepdogDog());

        Dog object = getObject(dogs, 1);
        System.out.println(object.getClass().getCanonicalName());

        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(dogs.get(0));
        dogSet.add(dogs.get(1));
        dogSet.add(new SouthRussianOvcharkaDod());
        System.out.println(get(dogSet, new Integer(2)).getClass().getCanonicalName());
    }

    private static <T> T getObject(List<T> tList, int index) {
        System.out.println(tList.get(1).getClass().isAssignableFrom(Dog.class));
        System.out.println(tList.get(0).getClass().isInstance(Dog.class));
        return tList.get(index);
    }

    private static <T extends Dog, V extends Integer> T get(Set<T> tSet, V index){
        Iterator<T> iterator = tSet.iterator();
        int count = 0;
        while(iterator.hasNext()){
            if(count == index.intValue()){
                return iterator.next();
            }
            count++;
        }
        return null;
    }

}