package com.mtsmda.transaction.impl;

import com.mtsmda.transaction.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by MTSMDA on 29.12.2015.
 */
@Component(value = "transactionImpl")
public class TransactionImpl implements Transaction{

    @Override
    public String save() {
        return "Rest ful ws Jersey";
    }
}