<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 4:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspboard</title>
</head>
<body>

<%
    String userid = (String)session.getAttribute("userid");
%>

<h1> Board </h1>

<table border = 5>
<tr><th>제목</th><td><input type ='text' name = 'title'></td></tr>
<tr><th>내용</th><td><textarea name = 'contents' rows=5 cols=50></textarea></td></tr>
<tr><th>작성자</th><td><input type ='text' name = 'writer'
    value= <%=userid%> readonly></td></tr>
</table>


</body>
</html>
