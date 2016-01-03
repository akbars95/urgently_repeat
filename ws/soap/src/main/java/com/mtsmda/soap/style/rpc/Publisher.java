package com.mtsmda.soap.style.rpc;

import javax.xml.ws.Endpoint;

/**
 * Created by MTSMDA on 03.01.2016.
 */
public class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7779/ws/first", new First());
        System.out.println("ok");
    }

}