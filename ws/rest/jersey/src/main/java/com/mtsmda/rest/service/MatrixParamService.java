package com.mtsmda.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 24.12.2015.
 */
@Path("/matrix/books")
public class MatrixParamService {

    @GET
    @Path("/book/{year}")
    public Response matrixBook(@PathParam("year") String year, @MatrixParam(value = "author") String author, @MatrixParam("country") String country) {
        return Response.status(200).entity("Year - " + year + "<br>Author - " + author + "<br>Country - " + country).build();
    }

}