package com.mtsmda.service;

import com.mtsmda.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 29.12.2015.
 */
@Path("/service")
public class TransactionService {

    @Autowired
    @Qualifier(value = "transactionImpl")
    private Transaction transaction;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @GET
    @Path("/example")
    public Response example() {
        return Response.status(200).entity(transaction.save()).build();
    }

}