package com.mtsmda.springCore.InitializingBeanAndDisposableBean;

import javax.annotation.PostConstruct;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class AnnotationVariant {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void initMA() throws Exception{
        System.out.println("initMA()");
    }

    public void destroyMA() throws Exception{
        System.out.println("destroyMA()");
    }

}