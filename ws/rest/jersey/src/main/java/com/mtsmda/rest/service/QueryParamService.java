package com.mtsmda.rest.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * Created by MTSMDA on 23.12.2015.
 */
@Path("/query")
public class QueryParamService {

    @GET
    @Path("/get")
    public Response getQuery(@QueryParam("from") int from, @QueryParam("to") int toT, @QueryParam("orderBy") List<String> orderBy) {
        return Response.status(200).entity("from - " + from + " to - " + toT + "\norderBy " + orderBy.toString()).build();
    }

    @GET
    @Path("/get2")
    public Response getQueryVersion2(@Context UriInfo uriInfo) {
        String from = uriInfo.getQueryParameters().getFirst("from");
        String to = uriInfo.getQueryParameters().getFirst("to");
        List<String> orderBy = uriInfo.getQueryParameters().get("orderBy");
        return Response.status(200).entity("get2 - from - " + from + " to - " + to + "\norderBy " + orderBy.toString()).build();
    }

    @GET
    @Path("/getDefault")
    public Response getQueryDefaultValue(@DefaultValue("150") @QueryParam("from") int from, @DefaultValue("1500") @QueryParam("to") int toT, @DefaultValue("default") @QueryParam("orderBy") List<String> orderBy) {
        return Response.status(200).entity("from - " + from + " to - " + toT + "\norderBy " + orderBy.toString()).build();
    }

}