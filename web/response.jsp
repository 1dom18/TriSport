<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="password" />    
        <jsp:setProperty name="mybean" property="address" />  
        <jsp:setProperty name="mybean" property="zip" /> 
        <jsp:setProperty name="mybean" property="email" /> 
        <jsp:setProperty name="mybean" property="CCN" />
        <jsp:setProperty name="mybean" property="username" />
        <jsp:setProperty name="mybean" property="con" />
        <sql:setDataSource  var="co"   driver="com.mysql.jdbc.Driver" 
        url="jdbc:mysql://localhost:3306/trisport?zeroDateTimeBehavior=convertToNull"
        user="root"
        password="password"
         />
        <sql:update var="res" dataSource="${co}">
            INSERT INTO customer(username, password, first_lastname, address,email,CCN,zip)
            VALUES ('<jsp:getProperty name="mybean" property="username" />','<jsp:getProperty name="mybean" property="password" />','<jsp:getProperty name="mybean" property="name" />','<jsp:getProperty name="mybean" property="address" />','<jsp:getProperty name="mybean" property="email" />',<jsp:getProperty name="mybean" property="CCN" />,<jsp:getProperty name="mybean" property="zip" />)
        </sql:update>
            
            
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
        <p>
    </body>
</html>
