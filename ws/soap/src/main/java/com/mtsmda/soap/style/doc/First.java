package com.mtsmda.soap.style.doc;

import javax.jws.WebService;

/**
 * Created by MTSMDA on 03.01.2016.
 */
@WebService(endpointInterface = "com.mtsmda.soap.style.doc.FirstI")
public class First implements FirstI {

    @Override
    public String getHelloAsString() {
        return "this soap ws, rpc style!";
    }
}