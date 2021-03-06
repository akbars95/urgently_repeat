package com.mtsmda.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by c-DMITMINZ on 22.12.2015.
 */
@Path(value = "/hw")
public class HWService {

    @GET
    @Path(value = "/")
    public Response hello() {
        return Response.status(200).entity("Hello, friend!").build();
    }

    @GET
    @Path(value = "/{param}")
    public Response getMsg(@PathParam("param") String message) {
        String out = "Hello! Here is your message - ' " + message + "'";
        return Response.status(200).entity(out).build();
    }

}