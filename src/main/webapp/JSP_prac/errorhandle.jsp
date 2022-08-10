<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오후 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>errorhandle</title>
</head>
<body>

<h1>====getRequestURI=====</h1>
<%=request.getRequestURI()%>



<h1>====tostring=====</h1>
<%=exception.toString()%>

<h1>====getmessage=====</h1>
<%=exception.getMessage()%>

<h1>====printStackTrace(서버콘솔출력)=====</h1>
<%exception.printStackTrace();%>



</body>
</html>
