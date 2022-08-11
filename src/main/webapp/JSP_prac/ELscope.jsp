<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오후 5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>elscope</title>
</head>
<body>

<% pageContext.setAttribute("a", 10 );%>
<% request.setAttribute("a", 20 );%>
<%session.setAttribute("a", 30 );%>
<% application.setAttribute("a", 40 );%>



<jsp:forward page="ELscope2.jsp"></jsp:forward>



</body>
</html>
