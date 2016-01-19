package com.mtsmda.java7Book.ch_annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

/**
 * Created by c-DMITMINZ on 19.01.2016.
 */
@SingleValue("MyClass")
@SingleNotValue(name = "Ivan")
@ClassPreamble(author = "MTSMDA", date = "19.01.2016", reviewers = {
        "Ivanov", "Sidorov"
}, lastModified = "19.01.2016 19:07:06")
public class MyClass {

    public static void main(String[] args) {
        Class<MyClass> myClassClass = MyClass.class;
        Annotation[] annotations = myClassClass.getAnnotations();
        System.out.println("count - " + annotations.length);
        System.out.println("count declared - " + myClassClass.getDeclaredAnnotations().length);
        for(Annotation annotation : annotations){
            System.out.println(annotation.toString());
        }
    }

}


@ClassPreamble(reviewers = {}, date = "", author = "")
interface FunctionAble{

}