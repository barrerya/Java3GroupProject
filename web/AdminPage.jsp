<%-- 
    Document   : AdminPage
    Created on : Apr. 10, 2021, 7:07:22 p.m.
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        <h1>Rose Banquet Halls Booking System</h1>
        <br>
        <br>
        <form action="TODO" method="GET">
            <input type="submit" value="Add New Hall">
        </form>
        <form action="HallRegistrationServlet" method="GET">
            <input type="submit" value="Book Hall">
        </form>
        <form action="RegistrationServlet" method="GET">
            <input type="submit" value="Register Client">
        </form>
        <form action="AdminServlet" method="GET">
            <input type="submit" value="Hall Admin">
        </form>
    </body>
</html>
