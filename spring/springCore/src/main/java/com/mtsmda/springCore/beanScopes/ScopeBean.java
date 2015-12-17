package com.mtsmda.springCore.beanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by MTSMDA on 16.12.2015.
 */

@Service(value = "scopeBean1")
@Scope(value = "prototype")
public class ScopeBean {

    private int count = 90;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}