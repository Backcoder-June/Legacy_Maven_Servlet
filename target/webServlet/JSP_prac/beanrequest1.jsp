Bean1.jsp<%@ page import="Servlet.DTO.memberDTO" %>

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
<jsp:setProperty name="dto" property="id"  />
<jsp:setProperty name="dto" property="pw"  />
<jsp:setProperty name="dto" property="name" />

<jsp:forward page="beanrequest2.jsp"/>



</body>
</html>
