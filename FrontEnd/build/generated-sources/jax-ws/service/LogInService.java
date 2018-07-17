
package service;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LogInService", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LogInService {


    /**
     * 
     * @param ced
     * @param pass
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "LoginUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "LoginUsuario", targetNamespace = "http://Service/", className = "service.LoginUsuario")
    @ResponseWrapper(localName = "LoginUsuarioResponse", targetNamespace = "http://Service/", className = "service.LoginUsuarioResponse")
    @Action(input = "http://Service/LogInService/LoginUsuarioRequest", output = "http://Service/LogInService/LoginUsuarioResponse")
    public boolean loginUsuario(
        @WebParam(name = "ced", targetNamespace = "")
        String ced,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

}
