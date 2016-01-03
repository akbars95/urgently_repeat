package com.mtsmda.resteasy.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 31.12.2015.
 */
@Path("/first")
public class FirstService {

    @GET
    @Path("/message/{msg}")
    public Response response(@PathParam("msg") String msg) {
        return Response.status(200).entity("My message - " + msg).build();
    }

    @GET
    @Path("/message")
    public Response defaultMessage() {
        return Response.status(200).entity("Default message!").build();
    }

}