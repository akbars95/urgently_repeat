package com.mtsmda.rest.service.json;

import com.mtsmda.rest.model.json.Track;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by MTSMDA on 27.12.2015.
 */
@Path("/json/track")
public class JSONService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrack() {
        return new Track("new sing", 3.18);
    }

    @POST
    @Path("/post")
    @Produces(MediaType.APPLICATION_JSON)
    public Response postTrack(Track track) {
        return Response.status(201).entity(track).build();
    }

}