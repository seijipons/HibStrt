<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/utilidades" method="post"> 
    <head>
        <html:link  href="css/estilo_particulas.css"/>
        <html:link href='http://fonts.googleapis.com/css?family=Oswald:400,700' />

        <title>K.I.R.A | EL FUTURO ES NUESTRO</title>

        <html:link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' />


        
        <link href="${pageContext.request.contextPath}css/style.css" rel="stylesheet" type="text/css"/>

    </head>

    <body>
        <div id="particles-js"></div>
        <!-- scripts -->
        

        <!--FIN DEL CONTENEDOR DE PARTICULAS -->

        <div class="container">
            <div class="login-box animated fadeInUp">
                <div class="box-header">
                    <h2>Log In</h2>
                </div>
                <label name="username">Usuario</label>
                <br/>
                <input type="text" id="username">
                <br/>
                <label name="password">Contraseña</label>
                <br/>
                <input type="password" id="password">
                <br/>
                <button type="submit">Entrar</button>
                <br/>

            </div>
        </div>
    </body>


</html:form>