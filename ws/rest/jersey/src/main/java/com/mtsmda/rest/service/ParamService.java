package com.mtsmda.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 23.12.2015.
 */
@Path("/param")
public class ParamService {

    @GET
    @Path("/date/{day}/{month}/{year}")
    public Response getDate(@PathParam("day") int day, @PathParam("month") int month, @PathParam("year") int year) {
        String date = day + "." + month + "." + year;
        return Response.status(200).entity("Query date - " + date).build();
    }

}