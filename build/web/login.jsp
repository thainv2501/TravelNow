<%-- 
    Document   : login
    Created on : Oct 9, 2021, 2:32:04 PM
    Author     : taola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/loginStyle.css" />
        <script src="js/loginJS.js"></script>


    </head>
    <body>
        <div class="center">
            <div class="header">Login</div>
            <form action="login" method="post">
                <p>${mess} </p>

                <input type="text" name="account_name" placeholder="Email or Username">
                <input id="pswrd" name="password" type="password" placeholder="Password">
                <input type="submit" name="login" value="Sign in">
            </form>
        </div>
    </body>
</html>
