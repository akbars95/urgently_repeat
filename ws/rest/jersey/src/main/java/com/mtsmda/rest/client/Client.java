package com.mtsmda.rest.client;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;

/**
 * Created by MTSMDA on 28.12.2015.
 */
public class Client {

    public static void main(String[] args) {
        com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();
        WebResource webResource = client.resource("http://localhost:8080/rest/json/track/get");
        ClientResponse clientResponse = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

        if (clientResponse.getStatus() != 200) {
            throw new RuntimeException("Error response code - " + clientResponse.getStatus());
        }

        String entity = clientResponse.getEntity(String.class);
        System.out.println(entity);
        System.out.println("-----post-----");
        postClient();
    }

    private static void postClient() {
        com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();
        WebResource webResource = client.resource("http://localhost:8080/rest/json/track/post");
        String input = "{\"duration\":78.18,\"title\":\"my sing favorite\"}";

        ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, input);

        if (clientResponse.getStatus() != 201) {
            throw new RuntimeException("Error response code - " + clientResponse.getStatus());
        }

        System.out.println(clientResponse.getEntity(String.class));
    }

}