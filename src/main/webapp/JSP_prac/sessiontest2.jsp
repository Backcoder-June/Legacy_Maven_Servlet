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
    memberDTO member1 = null;
if (session.getAttribute("member1")!=null){
    member1 = (memberDTO)session.getAttribute("member1");}
%>

<%if (member1 != null){%>
<h1> 회원님의 정보를 세션으로 가져왔습니다.</h1>

<table border="5">
    <tr>
        <td>아이디</td>
        <td><%=member1.getId()%></td>
    </tr>
    <tr>
        <td>비밀번호</td>
        <td><%=member1.getPw()%></td>
    </tr>
    <tr>
        <td>이름</td>
        <td><%=member1.getName()%></td>
    </tr>
</table>
<%} else {%>
<h1> 조회할 정보가 없습니다. </h1>
<%}%>


</body>
</html>
