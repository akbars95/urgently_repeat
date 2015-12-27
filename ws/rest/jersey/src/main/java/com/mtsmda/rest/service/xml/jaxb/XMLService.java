package com.mtsmda.rest.service.xml.jaxb;

import com.mtsmda.rest.model.xml.Customer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by MTSMDA on 27.12.2015.
 */

@Path("/xml/customer")
public class XMLService {

    @GET
    @Path(value = "/{pin}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerInXML(@PathParam("pin") int pin) {
        Customer customer = new Customer("Ivanov", pin);
        return customer;
    }

}