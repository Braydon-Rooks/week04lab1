<%-- 
    Document   : login
    Created on : Oct 2, 2017, 8:11:11 AM
    Author     : 671978
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Remember Me Login Page</h1>
        <form method="post" action="Login">
            Username: <input type="text" name="user"> <br>
            Password: <input type="text" name="password"><br>
            <input type="submit" value="Login"><br>
            <input type="checkbox" name ="remember" value="remember"> Remember me
        </form>
        ${check}
    </body>
</html>
