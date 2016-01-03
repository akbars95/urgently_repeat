package com.mtsmda.soap.style.doc;

import javax.xml.ws.Endpoint;

/**
 * Created by MTSMDA on 03.01.2016.
 */
public class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7979/ws/firstDoc", new First());
        System.out.println("ok");
    }

}