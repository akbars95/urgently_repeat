package com.mtsmda.soap.style.doc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by MTSMDA on 03.01.2016.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface FirstI {

    @WebMethod
    String getHelloAsString();

}