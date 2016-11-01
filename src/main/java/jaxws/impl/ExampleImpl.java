package jaxws.impl;


import jaxws.IExample;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by Alex on 01.11.2016.
 */
@WebService(
        serviceName = "ExampleSoapService",
        targetNamespace = "http://fuchs-page.de/",
        endpointInterface = "jaxws.IExample"
)
public class ExampleImpl implements IExample {
    @Override
    @WebMethod
    public String getReverseString(final String string) {
        return new StringBuilder(string).reverse().toString();
    }

    @Override
    public String getName(final String name, final int age) {
        return name + " " + age;
    }
}

