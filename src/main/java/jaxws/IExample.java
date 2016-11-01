package jaxws;

/**
 * Created by Alex on 01.11.2016.
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


@WebService(
        name = "IExample",
        targetNamespace = "http://fuchs-page.de/")
public interface IExample {
    @WebMethod(exclude = false)
    @WebResult(partName = "return")
    @Action(
            input = "http://fuchs-page.de/IExample/getReverseStringRequest",
            output = "http://fuchs-page.de/IExample/getReverseStringResponse")
    public String getReverseString(
            @WebParam(
                    name = "string",
                    partName = "string")
            String string);

    public String getName(
            @WebParam(
                    name = "Name",
                    partName = "string")
            String name,
            @WebParam(
                    name = "Age",
                    partName = "integer")
            int age);
}