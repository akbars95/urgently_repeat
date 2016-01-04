package com.mtsmda.java7Book.ch11.generics;

import com.mtsmda.java7Book.ch11.generics.model.Child;
import com.mtsmda.java7Book.ch11.generics.model.Parent;

/**
 * Created by c-DMITMINZ on 04.01.2016.
 */
public class GenericIncapsulation {

    public static void main(String[] args) {
        Parent [] parents = new Parent[]{new Parent(), new Child()};
        for (Parent p :  parents){
            p.get();
        }
    }

}

class FF{

    public static void main(String[] args) {

    }

}