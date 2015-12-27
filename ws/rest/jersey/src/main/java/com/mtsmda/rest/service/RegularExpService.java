package com.mtsmda.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 22.12.2015.
 */
@Path(value = "/rexs")
public class RegularExpService {

    @GET
    @Path(value = "{id : \\d+}")
    public Response getOnlyNumber(@PathParam("id") String id) {
        return Response.status(200).entity("Only numbers - " + id).build();
    }

    @GET
    @Path(value = "/username/{username : [a-zA-Z][1a-zA-Z_0-9]}")
    public Response getStringNumber(@PathParam("username") String username) {
        return Response.status(200).entity("Strings and numbers - " + username).build();
    }

    @GET
    @Path(value = "/username/{username : [a-zA-Z_0-9]{5,9}}")
    public Response getUsernameMin5Max9(@PathParam("username") String username) {
        return Response.status(200).entity("Strings and numbers - " + username).build();
    }

}