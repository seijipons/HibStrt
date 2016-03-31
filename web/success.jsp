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
        <link href="estilo2.css" rel="stylesheet">
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
   
    <div id="campo1">
       <center>
          <table>
           <tr>
               <td class="espacio"> <h1 class="fuente">Nomina</h1></td>
               <td class="espacio"> <h3 class="fuente">29/03/2016 </h3></td>
               <td class="espacio2"> <img src="Downloaded/card.png" class="vete"></td>
           </tr>
       </table>
       </center>
    </div>
   
   <div>
       <td>
           <br>
           
       </td>
   </div>
    
    
    <div class="color1 table-responsive">
        <table class="table">
            <tr>
                
                <th class="espacio font">Fecha</th>
                <th class="espacio font">Forma Pago</th>
              
                
            </tr>
        </table>
    </div>
    
    <div class="color1 table-responsive">
        <table class="table">
            <tr>
                
               
                <th class="espacio font">Subtotal</th>
                <th class="espacio font">ISR</th>
               
                
            </tr>
        </table>
    </div>
    
    <div class="color1 table-responsive">
        <table class="table">
            <tr>
                
                
                <th class="espacio font">I.V.A</th>
                <th class="espacio font">Total</th>
                
            </tr>
        </table>
    </div>
    
    
    </div>
    </body>
</html>

