<%@ page import="Servlet.DTO.memberDTO" %>

<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오전 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bean</title>
</head>
<body>

<jsp:useBean id="dto" class="Bean.beandto" scope="request"/>

<h1> <jsp:getProperty name="dto" property="name"/>  님의 아이디가 생성되었습니다. </h1>
<h3>아이디 : <jsp:getProperty name="dto" property="id"/>     </h3>
<h3>비밀번호 : <jsp:getProperty name="dto" property="pw" />   </h3>

</body>
</html>
