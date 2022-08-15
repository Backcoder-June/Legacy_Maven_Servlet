<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Servlet.DAO.memberDAO" %>
<%@ page import="Servlet.DTO.memberDTO" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 4:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>members</title>
</head>
<body>

${empty sessionScope.userid? "Guest" : sessionScope.userid} 님 어서오세요
<table border="5">
  <tr>
    <th>아이디</th>
    <th>이름</th>
  </tr>
<c:forEach items="${allmember}" var="dto" >
  <tr>
    <td>${dto.id}</td>
    <td>${dto.name}</td>
  </tr>
</c:forEach>

</table>




<br> <a href='http://localhost:8090/webServlet_war_exploded/MVC/logined_Home.jsp'>홈으로</a>

</body>
</html>
