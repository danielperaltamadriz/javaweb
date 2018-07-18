/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author user
 */
@WebService(serviceName = "IMBService")
public class IMBService {

    /**
     * Servicio para obtener IMB
     *
     * @param nacString
     * @param femenino
     * @param peso
     * @return
     */
    @WebMethod(operationName = "IMB")
    public double IMB(@WebParam(name = "nacimiento") String nacString, @WebParam(name = "fem") boolean femenino, @WebParam(name = "peso") double peso) {
        LocalDate nacimiento = LocalDate.parse(nacString);
        int edad = Period.between(nacimiento, LocalDate.now()).getYears();
        if (edad >= 10 && edad <= 18) {
            if (femenino) {
                return (peso * 12.2) + 746;
            } else {
                return (peso * 17.5) + 651;
            }
        } else if (edad >= 19 && edad <= 30) {
            if (femenino) {
                return (peso * 14.7) + 479;
            } else {
                return (peso * 15.3) + 679;
            }
        } else if (edad >= 31 && edad <= 60) {
            if (femenino) {
                return (peso * 8.7) + 829;
            } else {
                return (peso * 11.6) + 879;
            }
        } else if (edad > 60) {
            if (femenino) {
                return (peso * 10.5) + 596;
            } else {
                return (peso * 13.5) + 487;
            }
        }
        return -1;
    }
}
