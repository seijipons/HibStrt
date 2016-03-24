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
        <html:form action="/admin" method="post">
        <nav class="navegacion">
            <a href="" class="a">CERRAR SESION</a>
            <a class="a derecha">BIENVENIDO: NOMBRE DE ADMINISTRADOR</a>
        </nav>
        
        <div class="abajo1">
            <center>
                <div id="campo1">
                    <h1 class="fuente">NUEVOS REGISTROS</h1>
                </div>
            </center>
        </div>

    <center>
        <div class="color1">
            <table class="table table-striped">

                <tbody>

                    <tr>
                        <td class="fuenteadmin">Nombre(s)</td>
                        <td>
                            <html:text property="nombre" value="Nombre(s)" styleClass="tamañoadmin"/>
                            
                        </td>
                    </tr>
                    <tr>
                        <td class="fuenteadmin">Apellido Paterno</td>
                        <td>
                            <html:text property="apaterno" value="Apellido Paterno" styleClass="tamañoadmin"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td class="fuenteadmin">Apellido Materno</td>
                        <td>
                            <html:text property="amaterno" value="Apellido Materno" styleClass="tamañoadmin"/>
                        </td>
                    </tr>


                    <tr>
                        <td class="fuenteadmin" style="fuenteadmin">Fecha Nacimiento</td>
                        <td>
                            <html:text property="fechaNaci" value="Fecha Nac." styleClass="tamañoadmin"/>
                        </td>
                    </tr>

                    <tr>
                        <td class="fuenteadmin">Direccion</td>
                        <td>
                            <html:text property="direccion" value="Direccion" styleClass="tamañoadmin"/>
                        </td>
                    </tr>

                    <tr>
                        <td class="fuenteadmin">Telefono:</td>
                        <td>
                            <html:text property="telefono" value="Celular/Casa" styleClass="tamañoadmin"/>
                        </td>
                    </tr>

                    <tr>
                        <td class="fuenteadmin" >Año de Contratacion</td>
                        <td>
                            <html:text property="fechaContratacion" value="Fecha Con." styleClass="tamañoadmin"/>
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
                        </td>
                    </tr>

                    <tr>
                        <td class="fuenteadmin">Sueldo</td>
                        <td>
                            <html:text property="sueldo" value="Sueldo" styleClass="tamañoadmin"/>
                        </td>
                    </tr>


                </tbody>
            </table>

            <center>
                <input class="btn btn-primary " type="submit" value="G U A R D A R">
            </center>
        </div>
    </center>

        </html:form>
</body>

</html>
