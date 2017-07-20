
package com.atguigu.jdk_ws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWsImpl", targetNamespace = "http://ws.jdk_ws.atguigu.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWsImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws.jdk_ws.atguigu.com/", className = "com.atguigu.jdk_ws.ws.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws.jdk_ws.atguigu.com/", className = "com.atguigu.jdk_ws.ws.SayHelloResponse")
    @Action(input = "http://ws.jdk_ws.atguigu.com/HelloWsImpl/sayHelloRequest", output = "http://ws.jdk_ws.atguigu.com/HelloWsImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
