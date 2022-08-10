<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오후 1:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
errorPage="errorhandle.jsp" %>
<html>
<head>
    <title>error</title>
</head>
<body>

<%
    String[] menu = {"회원정보", "게시판", "챗봇기능"};

    int index = Integer.parseInt(request.getParameter("index"));
%>

<h1>메뉴이름 = <%=menu[index]%></h1>



</body>
</html>
