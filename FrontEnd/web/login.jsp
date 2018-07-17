<%-- 
    Document   : login
    Created on : Jul 16, 2018, 9:57:59 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Hello World!</h1>
        <div>
            <label>Cedula</label>
            <input id="ced" type="text"/>
        </div>
        <div>
            <label>Contrasena</label>
            <input id="pass" type="text"/>
        </div>
        <div>
            <button id="callLogin">Log In!</button>
        </div>
        <div>
            <span id="error"></span>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="login.js"></script>                      
    </body>
</html>
