<%-- 
    Document   : datos
    Created on : Jul 16, 2018, 11:01:31 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css">
        <title>Datos</title>
    </head>
    <body>
        <h1>Inserte sus datos!</h1>
        
        <div>
            <label>Nombre Completo:</label>
            <input id="nombre"/>
        </div>
        <div>
            <label>Fecha de nacimiento:</label>
            <input id="nacimiento" type="date"/>
        </div>
        <div>
            <label>Sexo:</label>
            <img src="female.jpg" id="femenino" class="img-genero"/>
            <img src="male.png" id="masculino" class="img-genero"/>
        </div>
        <div>
            <label>Peso en Kilogramos:</label>
            <input id="peso"/>
        </div>
        <button id="imb">Calcular IMB</button>
        <button id="ingesta">Calcular Ingesta Calórica</button>
        <button id="alimentacion">Mostar plan de alimentación</button>
        <div id='resultadosIMB' class='hiden'>
            <h3>Resultados del IMB</h3>
            <span id="IMBSpan"></span>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="datos.js"></script>
    </body>
</html>
