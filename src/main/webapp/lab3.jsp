<%-- 
    Document   : lab3
    Created on : 14.04.2021, 21:23:25
    Author     : 19sam
--%>

<%@page import="knu.fit.ist.ta.lab3.Lab3Task"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Лабораторна робота 3</h1> 
        
        <p>Варіант 21</p>
        <p>Заповнити масив з k натуральних чисел. Визначити кількість елементів з максимальною сумою цифр.</p>
 
        <h2>Наш масив</h2>
        <p><%=request.getAttribute("array")%></p>

        <h2>Кількість елементів з максимальною сумою цифр:
            <%=request.getAttribute("ame")%>
        </h2>
        
        <div>
            <form action="index.jsp">
                <input type="submit" value="HOME PAGE">
            </form>
        </div>
        
    </body>
</html>
