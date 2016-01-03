package com.mtsmda.resteasy;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/**
 * Created by MTSMDA on 03.01.2016.
 */
public class RestEasyClient {

    public static void main(String[] args) throws Exception {
        ClientRequest clientRequest = new ClientRequest("http://localhost:8080/rest/json/get/list");
        clientRequest.accept("application/json");
        ClientResponse<String> stringClientResponse = clientRequest.get(String.class);
        if (stringClientResponse.getStatus() != 200) {
            System.out.println("Error");
            return;
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(stringClientResponse.getEntity().getBytes())));
        String result = "";

        while((result = bufferedReader.readLine()) != null){
            System.out.println(result);
        }

        System.out.println("Done");
    }

}