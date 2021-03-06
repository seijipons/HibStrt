<%-- 
    Document   : administrador
    Created on : Mar 23, 2016, 9:04:04 PM
    Author     : Ivan
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilo.css" rel="stylesheet">
        <link href="jquery-ui-1.11.4.custom/jquery-ui.css" rel="stylesheet">
        <!-- LINEA PARA TIPO DE FUENTE DEL ENCABEZADO-->
        <link href="https://fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css">


    </head>

    <body class="abajo">
        <jsp:useBean id="iva" class="com.myapp.struts.UtilidadesStrutsActionForm"/>
        <jsp:setProperty name="iva" property="*"/>       

        <html:form action="/admin" method="post">
            <nav class="navegacion">
                <a href="login.jsp" class="a">CERRAR SESION</a>
                <a class="a derecha">BIENVENIDO: <jsp:getProperty name="iva" property="usuario"/></a>
            </nav>
        <center>
            <div class="abajo1">
                <div id="campo1">
                    <h1 class="fuente">NUEVOS REGISTROS</h1>
                </div>
            </div>
        </center>
        <center>
            <div class="color1">
                <table class="table table-striped">

                    <tbody>

                        <tr>
                            <td class="fuenteadmin">Nombre(s)</td>
                            <td>
                                <html:text property="nombre"  styleClass="tamañoadmin"/>
                                <html:errors property="errornombre"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="fuenteadmin">Apellido Paterno</td>
                            <td>
                                <html:text property="apaterno"  styleClass="tamañoadmin"/>
                                <html:errors property="errorapellidoap"/>
                            </td>
                        </tr>

                        <tr>
                            <td class="fuenteadmin">Apellido Materno</td>
                            <td>
                                <html:text property="amaterno"  styleClass="tamañoadmin"/>
                                <html:errors property="errorapellidoma"/>
                            </td>
                        </tr>


                        <tr>
                            <td class="fuenteadmin" style="fuenteadmin">Fecha Nacimiento</td>
                            <td>
                                <html:text property="fechaNaci"  styleClass="tamañoadmin"/>
                                <html:errors property="errorfechanac"/>
                            </td>
                        </tr>

                        <tr>
                            <td class="fuenteadmin">Direccion</td>
                            <td>
                                <html:text property="direccion"  styleClass="tamañoadmin"/>
                                <html:errors property="errordireccion"/>
                            </td>
                        </tr>

                        <tr>
                            <td class="fuenteadmin">Telefono:</td>
                            <td>
                                <html:text property="telefono"  styleClass="tamañoadmin"/>
                                <html:errors property="errortelefono"/>
                            </td>
                        </tr>

                        <tr>
                            <td class="fuenteadmin" >Año de Contratacion</td>
                            <td>
                                <html:text property="fechaContratacion"  styleClass="tamañoadmin"/>
                                <html:errors property="errorañocontra"/>
                            </td>
                        </tr>

                        <tr>
                            <td class="fuenteadmin" style="tamañoadmin">Tiempo de Pago</td>
                            <td>
                                <html:select property="tiempopagos" styleClass="tamañoadmin">
                                    <html:option value="0" >SELECCIONA TIEMPO</html:option>
                                    <html:option value="1" >QUINCENAL</html:option>
                                    <html:option value="2" >DECENAL</html:option>
                                    <html:option value="3" >MENSUAL</html:option>
                                </html:select>

                                <html:errors property="errortiempopagos" />
                            </td>
                        </tr>



                        <tr>
                            <td class="fuenteadmin" style="tamañoadmin">Forma de Pago</td>
                            <td>
                                <html:select property="formapagos" styleClass="tamañoadmin">
                        <option value="0" class="tamañoadmin">SELECCIONA PAGO</option>
                        <option value="1" class="tamañoadmin">NOMINA</option>
                        <option value="2" class="tamañoadmin">HONORARIOS</option>
                    </html:select>
                    <html:errors property="errorformapagos"/>
                    </td>
                    </tr>

                    <tr>
                        <td class="fuenteadmin">Sueldo</td>
                        <td>
                            <html:text property="sueldo"  styleClass="tamañoadmin"/>
                            <html:errors property="errorsueldo"/>
                        </td>
                    </tr>

                    <tr>
                        <td class="fuenteadmin" style="tamañoadmin">Tipo de Empleado</td>
                        <td>
                            <html:select property="rol" styleClass="tamañoadmin">
                        <option value="0" class="tamañoadmin">SELECCIONA TIPO DE EMPLEADO</option>
                        <option value="2" class="tamañoadmin">EMPLEADO</option>
                        <option value="1" class="tamañoadmin">ADMINISTRADOR</option>
                    </html:select>
                    <html:errors property="errorformapagos"/>
                    </td>
                    </tr>


                    </tbody>
                </table>

                <center>
                    <html:submit value="Enviar"  styleClass="btn btn-primary"/>
                </center>
            </div>
        </center>

    </html:form>
</body>

</html>
