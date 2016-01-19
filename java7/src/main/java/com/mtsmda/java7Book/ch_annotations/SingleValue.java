package com.mtsmda.java7Book.ch_annotations;

import java.lang.annotation.*;

/**
 * Created by c-DMITMINZ on 19.01.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Inherited()
public @interface SingleValue {

    String value() default "";

}