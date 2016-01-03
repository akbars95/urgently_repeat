package com.mtsmda.resteasy.service.json;

import com.mtsmda.resteasy.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 02.01.2016.
 */
@Path("/json")
public class JSONService {

    @GET
    @Path("/get")
    @Produces("application/json")
    public User getJSONuser(){
        return new User("petrov", "123456789",9356);
    }

    @GET
    @Path("/get/list")
    @Produces("application/json")
    public List<User> getJSONUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User("petrov", "123456789",9356));
        users.add(new User("golubov", "123456789",9356));
        users.add(new User("simonov", "123456789",9356));
        users.add(new User("zagdonov", "123456789",9356));
        users.add(new User("erepiev", "123456789",9356));
        return users;
    }

}