<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:form action="/utilidades" method="post"> 
    <h3>Tipo de servicio:</h3>
    <html:text property="tiempo"/>
    
    <html:errors property="tiempoerror"/>
    
   
    <html:select property="cargo">
        <option value="Administrador" >Administrador</option>
        <option value="Contador" >Contador</option>
        <option value="Empleado" >Empleado</option>
        
</html:select>
    
    <html:submit value="Submit"/>
    
</html:form>