package com.mtsmda.rest.service;

import com.mtsmda.rest.model.Person;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 25.12.2015.
 */
@Path(value = "/form/person")
public class FormParamService {

    private static List<Person> persons = new ArrayList<Person>();
    private static StringBuilder stringBuilderMenu = new StringBuilder();

    {
        stringBuilderMenu.append("Menu:<br>\n<ul>").append("<li><a href=\"/form.jsp\">Add person</a></li>");
        stringBuilderMenu.append("<li><a href=\"get\">get all persons</a></li>");
        stringBuilderMenu.append("</ul>");
    }

    @POST
    @Path(value = "/add")
    public Response formAction(@FormParam("firstname") String firstname, @FormParam("middlename") String middlename, @FormParam("lastname") String lastname) {
        Person person = new Person(firstname, middlename, lastname);
        persons.add(person);
        return Response.status(200).entity(stringBuilderMenu.toString() + "add success " + person.toString() + "\t<br>").build();
    }

    @GET
    @Path(value = "/get")
    public Response getByName() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Person person : persons) {
            stringBuilder.append(person).append("<br>\n");
        }
        return Response.status(200).entity(stringBuilderMenu.toString() + "get all persons: <br>\n " + stringBuilder.toString()).build();
    }

}