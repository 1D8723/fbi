
package com.ibm.was.wssample.sei.echo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b15-fcs
 * Generated source version: 2.0
 * 
 */
@WebService(name = "EchoService12PortType", targetNamespace = "http://com/ibm/was/wssample/sei/echo/")
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public interface EchoService12PortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns com.ibm.was.wssample.sei.echo.EchoStringResponse
     */
    @WebMethod(action = "echoOperation")
    @WebResult(name = "echoStringResponse", targetNamespace = "http://com/ibm/was/wssample/sei/echo/", partName = "parameter")
    public EchoStringResponse echoOperation(
        @WebParam(name = "echoStringInput", targetNamespace = "http://com/ibm/was/wssample/sei/echo/", partName = "parameter")
        EchoStringInput parameter);

}
