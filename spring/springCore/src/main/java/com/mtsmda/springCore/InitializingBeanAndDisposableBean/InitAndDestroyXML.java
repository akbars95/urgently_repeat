package com.mtsmda.springCore.InitializingBeanAndDisposableBean;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class InitAndDestroyXML {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void initM() throws Exception {
        System.out.println("initM()");
    }

    public void cleanUp() throws Exception {
        System.out.println("cleanUp()");
    }

}