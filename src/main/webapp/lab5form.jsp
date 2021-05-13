<%-- 
    Document   : lab5form
    Created on : 29.04.2021, 21:23:49
    Author     : 19sam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Press the button!</h1>
        
        <div>
            <form action="./lab5" method="post">
                <h3>Введіть слово, яке бажаєте знайти в тексті</h3>
                <input type="text" name="word" placeholder="and, of, iot..."/>
                
                <h3>Введіть бажану кількість об'єктів з полями типу string та int</h3>
                <input type="text" name="amount" placeholder="5, 10, 11732"/>
                <input type="submit" value="Ok"/>
            </form>
        </div>
    </body>
</html>
