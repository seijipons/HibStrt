<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/utilidades" method="post"> 
    <head>
        <meta charset="utf-8">



        <link rel="stylesheet" media="screen" href="css/estilo_particulas.css">
        <link href='http://fonts.googleapis.com/css?family=Oswald:400,700' rel='stylesheet' type='text/css'>

        <title>K.I.R.A | EL FUTURO ES NUESTRO</title>

        <!-- Google Fonts -->
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

        <!-- Custom Stylesheet -->
        <link rel="stylesheet" href="css/style.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>

    </head>

    <body>
        <html:form action="/utilidades" method="post">
            <div class="container">
                <div class="login-box animated fadeInUp">
                    <div class="box-header">
                        <h2>Log In</h2>
                    </div>
                    <br>
                    <h4>Usuario</h4>
                    <br/>
                    <html:text property="usuario"></html:text>
                    <html:errors property="usuarioerror"/>
                    <br/>
                    <h4>Password</h4>
                    <br/>
                    <html:password property="password"></html:password>
                    <html:errors property="passworderror"/>
                    <br/>
                    
                    
                    <html:submit property ="login" value="ENTRAR"/>
                    <html:errors property="loginerror"/>
                    <br/>
                </div>
            </div>
        </html:form>
    </body>

    <script>
        $(document).ready(function () {
            $('#logo').addClass('animated fadeInDown');
            $("input:text:visible:first").focus();
        });
        $('#username').focus(function () {
            $('label[for="username"]').addClass('selected');
        });
        $('#username').blur(function () {
            $('label[for="username"]').removeClass('selected');
        });
        $('#password').focus(function () {
            $('label[for="password"]').addClass('selected');
        });
        $('#password').blur(function () {
            $('label[for="password"]').removeClass('selected');
        });
    </script>
</html:form>