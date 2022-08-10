<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오전 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>
<h1> 어플리케이션으로 받아온 정보 입니다. </h1>
로그인 하신분은 <%=session.getAttribute("id")%> 입니다.<br>
<hr>
<%
  String[] menu = (String[])application.getAttribute("menu");


  for (String m: menu
       ) {%>
메뉴목록 : <%=m%> <br>
<%}%>
<hr>

<%--<% out.getBuffersize()%>--%>


</body>
</html>
