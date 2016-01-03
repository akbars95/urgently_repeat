package com.mtsmda.soap.style.rpc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by MTSMDA on 03.01.2016.
 */
public class Client {

    public static void main(String[] args) throws MalformedURLException {
        URL urlFirst = new URL("http://localhost:7779/ws/first?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qName = new QName("http://rpc.style.soap.mtsmda.com/", "FirstService");
        Service service = Service.create(urlFirst, qName);
        FirstI first = service.getPort(FirstI.class);
        System.out.println(first.getHelloAsString());
    }

}