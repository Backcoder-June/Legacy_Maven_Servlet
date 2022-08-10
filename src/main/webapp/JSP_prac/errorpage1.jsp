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
  int num = Integer.parseInt(request.getParameter("num"));
%>

<h1> 결과 = <%=num*num%> </h1>



</body>
</html>
