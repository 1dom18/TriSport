<%-- 
    Document   : index
    Created on : Feb 23, 2010, 4:03:37 PM
    Author     : jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Your New Account</title>
    </head>
    <body>
        <h1>Register Your New Account</h1>

        <form name="Name Action Form" action="response.jsp">
            Enter your name:
            <input type="text" name="name" value="" />
            <br>Your Desired username: <input type="text" name="username" value="" />
            <br>Your Desired password: <input type="password" name="password" value="" />
            <br>Your address: <input type="text" name="address" value="" />
            <br>Your zip code <input type="text" name="zip" value="" />
            <br>Your email: <input type="text" name="email" value="" />
            <br>Your credit card number: <input type="text" name="CCN" value="" />
            <br><input type="submit" value="OK" />
        </form>
    </body>
</html>
