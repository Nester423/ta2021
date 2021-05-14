<%-- 
    Document   : lab5
    Created on : 29.04.2021, 21:23:30
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
        <h1>Лабораторна робота 5</h1>
        
        <h2>Варіант 6</h2>
        
        <p><%=request.getAttribute("cleanText")%></p>
       
        <h3>1.Удосконалити алгоритм linearSearch та застосувати його для аналізу тексту з минулої лабораторної роботи.</h3>
        <h3>Індекси слова <big><%=request.getAttribute("word")%></big> в заданному тексті</h3>
        <p><%=request.getAttribute("amountOfWord")%></p>
        
        <h3>2.Згенерувати список <big><%=request.getAttribute("amount")%></big> об'єктів з полями типу String та int.</h3>
        <p><%=request.getAttribute("strAndIntList")%></p>
        
        <h3>3.Створити та реалізувати алгорими сортування ( sortApproach1 ) та пошуку  ( jumpSearch ) для згенерованого у п.2 списку.</h3>
        <h4>Сортування (sortApproach1)</h4>
        <p><%=request.getAttribute("sortedList")%></p>
        <h4>Пошук (jumpSearch)</h4>
        <p><%=request.getAttribute("jumpSearch")%></p>
    </body>
</html>
