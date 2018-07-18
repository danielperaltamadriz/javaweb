/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "LogInService")
public class LogInService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "LoginUsuario")
    public boolean loginUsuario(@WebParam(name = "ced") String ced, @WebParam(name = "pass") String pass) {
        return ced.equals("1-0547-0587") && pass.equals("mipass");
    }
}
