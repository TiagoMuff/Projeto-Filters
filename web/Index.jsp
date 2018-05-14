<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INDEX</title>
    </head>
    <body style="background-color: darkblue">
    <center>
<!--HABILITAR COOKIES P SESSÃO FUNCIONAR-->
        <h1>LOGIN</h1>
        <form action="Servlet_Login" method="POST">
            Nome:<input type="text" name="nome" id="nome" /> <br/><br/>
            Senha:<input type="text" name="senha" id="senha"/> <br/><br/>
            <input type="submit" value="ok" size="40"/>
    </center>
</body>
</html>