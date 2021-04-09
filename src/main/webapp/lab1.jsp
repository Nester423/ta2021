<%-- 
    Document   : lab1
    Created on : 07.04.2021, 16:21:11
    Author     : 19sam
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab1</h1>
        
            <%! MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>

        <% 
           int x= mFJC.getMyInt();
           
           x+=3;
           x%=3;
           
        %>
        
        <p>8mod3 = <%=x%></p>
        
        <a href="index.jsp">HOME PAGE</a>
    </body>
</html>
