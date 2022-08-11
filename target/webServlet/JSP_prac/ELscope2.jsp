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
<%--

<%=pageContext.getAttribute("a" )%> <Br>
<%=request.getAttribute("a" )%> <Br>
<%=session.getAttribute("a" )%> <Br>
<%=application.getAttribute("a" )%> <Br>
--%>

ㅎㅇ<br>
${pageScope.a}<Br>
${requestScope.a}<Br>
${sessionScope.a}<Br>
${applicationScope.a}<Br>



</body>
</html>
