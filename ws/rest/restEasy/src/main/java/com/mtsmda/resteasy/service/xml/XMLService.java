package com.mtsmda.resteasy.service.xml;

import com.mtsmda.resteasy.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by MTSMDA on 02.01.2016.
 */
@Path("/xml/user")
public class XMLService {

    @GET
    @Path("/ivanov")
    @Produces("application/xml")
    public User getUser(){
        return new User("ivanov", "ivan1593I", 1593);
    }

}