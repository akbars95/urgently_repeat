package com.mtsmda.java7Book.ch_annotations;

import java.lang.annotation.Annotation;

/**
 * Created by c-DMITMINZ on 19.01.2016.
 */
public class SubCA extends SuperCA {

    public static void main(String[] args) {
        Class<SubCA> subCAClass = SubCA.class;
        Annotation[] annotations = subCAClass.getAnnotations();
        System.out.println(annotations.length);

        System.out.println("---------------------------");

        Football football = new Football();
        Annotation[] annotations1 = football.getClass().getAnnotations();
        System.out.println(annotations1.length);
        System.out.println(football.getClass().getDeclaredAnnotations().length);
        for (Annotation annotation : annotations1){
            System.out.println(annotation);
        }
    }

}

@SingleValue("FootballFC")
interface FootballFC{

}

@SingleValue("AbstractFootball")
abstract class AbstractFootball {

}

@SingleNotValue(name = "f")
class Football extends AbstractFootball implements FootballFC{

}