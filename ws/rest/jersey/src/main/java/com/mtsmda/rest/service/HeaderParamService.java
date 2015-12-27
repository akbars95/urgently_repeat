package com.mtsmda.rest.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 25.12.2015.
 */
@Path(value = "/header")
public class HeaderParamService {

    @GET
    @Path("/getHeader")
    public Response getHeader(@HeaderParam("user-agent") String userAgent) {
        return Response.status(200).entity("user-agent is - " + userAgent).build();
    }

    @GET
    @Path("/getHeaderFromContext")
    public Response getHeaderFromContext(@Context HttpHeaders httpHeaders) {
        return Response.status(200).entity("user-agent is - " + httpHeaders.getRequestHeader("user-agent").get(0)).build();
    }

    @GET
    @Path("/getHeadersFromContext")
    public Response getHeadersFromContext(@Context HttpHeaders httpHeaders) {
        MultivaluedMap<String, String> requestHeaders = httpHeaders.getRequestHeaders();
        StringBuilder stringBuilder = new StringBuilder();
        for (String current : requestHeaders.keySet()) {
            stringBuilder.append("<b>").append(current).append(":</b>").append(requestHeaders.getFirst(current)).append("<br>");
        }
        return Response.status(200).entity("header: <br>" + stringBuilder).build();
    }

}