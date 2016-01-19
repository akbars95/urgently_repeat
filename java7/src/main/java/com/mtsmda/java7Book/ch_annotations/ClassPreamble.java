package com.mtsmda.java7Book.ch_annotations;

import java.lang.annotation.*;

/**
 * Created by c-DMITMINZ on 19.01.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface ClassPreamble {

    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();

}