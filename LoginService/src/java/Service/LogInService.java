/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import javax.ws.rs.InternalServerErrorException;

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
    public boolean loginUsuario(@WebParam(name = "ced") String ced, @WebParam(name = "pass") String pass) throws Exception {
        System.out.println("Running");
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("mis_kilos");
        dataSource.setUser("root");
        dataSource.setPassword("pass");
        dataSource.setServerName("localhost");
        boolean isUser = false;
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM user WHERE ced='" + ced + "' and pass='" + pass + "'";
            System.out.format("Query: %s\n", query);
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                String db_ced = rs.getString("ced");
                String db_pass = rs.getString("pass");
                System.out.format("%s, %s\n", db_ced, db_pass);
                isUser = true;
            } else {
                System.out.println("usuario no encontrado!");
            }
             rs.close();
            stmt.close();
            conn.close();
            return isUser;
        } catch (Exception e) {
            e.printStackTrace();
            throw new InternalServerErrorException();
        } 
    }
}
