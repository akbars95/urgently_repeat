package com.mtsmda.springCore.InitializingBeanAndDisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class CustomService implements InitializingBean, DisposableBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
