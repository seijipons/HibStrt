<%-- 
    Document   : success
    Created on : 26/01/2016, 06:12:11 PM
    Author     : SeijiPons
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet">
        <link href="jquery-ui-1.11.4.custom/jquery-ui.css" rel="stylesheet">
        <!-- LINEA PARA TIPO DE FUENTE DEL ENCABEZADO-->
        <link href='https://fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

        <title>JSP Page</title>
    </head>
    <body class="abajo">
        <jsp:useBean id="iva" class="com.myapp.struts.UtilidadesStrutsActionForm"/>
        <jsp:setProperty name="iva" property="*"/>        

        <nav class="navegacion">
            <a href="login.jsp" class="a">CERRAR SESION</a>
            <a class="a derecha">BIENVENIDO: <jsp:getProperty name="iva" property="usuario"/></a>
        </nav>

        <div class="abajo1">
            <center>
                <div id="campo1">
                    <table>
                        <tr>
                            <td > <h1 class="fuente">Nomina</h1></td>
                            <td> <img src="Downloaded/Expensive%202-96.png" class="vete"></td>
                        </tr>
                    </table>
                </div>
            </center>

            <center>
                <div class="color1 table-responsive">
                    <table class="table">
                        <tr>

                            <th class="espacio font">Fecha</th>
                            <th class="espacio font">Forma Pago</th>
                            <th class="espacio font">Subtotal</th>
                            <th class="espacio font">ISR</th>
                            <th class="espacio font">I.V.A</th>
                            <th class="espacio font">Total</th>

                        </tr>
                    </table>
                </div>
            </center>
        </div>
    </body>
</html>

