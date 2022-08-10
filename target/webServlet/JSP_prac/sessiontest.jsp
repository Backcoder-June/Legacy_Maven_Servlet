<%@ page import="Servlet.DTO.memberDTO" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오전 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>

<%
  memberDTO dto = new memberDTO("cof", "1111", "coffee");

  session.setAttribute("member1", dto);
%>
<h1>cof 회원님의 정보를 세션에 저장했습니다.</h1>
<h1><%="cof2 회원님의 정보를 세션에 저장했습니다."%></h1>

<a href="sessiontest2.jsp">내 정보 보러가기</a>

</body>
</html>
