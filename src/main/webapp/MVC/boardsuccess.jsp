<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-12
  Time: 오후 5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1> 게시판 작성 내용 </h1>
제목 : ${param.title} <br>
내용 : ${param.contents} <br>
작성자 : ${param.writer}<br>

<br>
<a href="http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp">홈으로</a>


</body>
</html>
