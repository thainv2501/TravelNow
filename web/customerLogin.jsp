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
            <form action="customerLogin" method="get">
                <p>${mess} </p>

                <input type="text" name="cmnd" placeholder="CMND" required>
                <input id="pswrd" name="phone" type="text" placeholder="Phone" required>
                <input type="submit" name="login" value="Sign in">
            </form>
        </div>
    </body>
</html>
