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
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:useBean id="iva" class="com.myapp.struts.AdminStrutsActionForm"/>
            <jsp:setProperty name="iva" property="*"/>
            <h3>Nombre<jsp:getProperty name="iva" property="nombre"/></h3>
            <h3>Apellido<jsp:getProperty name="iva" property="apellido"/></h3>
    </body>
</html>

