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
        <jsp:useBean id="iva" class="com.myapp.struts.UtilidadesStrutsActionForm"/>
            <jsp:setProperty name="iva" property="*"/>
            <h3>precio:<jsp:getProperty name="iva" property="usuario"/></h3>
            <h3>total:<jsp:getProperty name="iva" property="password"/></h3>
        
    </body>
</html>

