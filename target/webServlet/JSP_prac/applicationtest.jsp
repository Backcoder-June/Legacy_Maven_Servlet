<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오전 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>

<%
  String[] menu = {"회원정보", "게시판", "챗봇기능"};
application.setAttribute("menu", menu);
session.setAttribute("id", "june");

%>
<h1> application 에 정보를 담았습니다. 계속 유지됩니다. </h1><br>


</body>
</html>
