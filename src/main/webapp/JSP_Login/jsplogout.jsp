<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 5:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsplogout</title>
</head>
<body>

<%
  HttpSession session2 = request.getSession();

  String logoutid = (String) session.getAttribute("userid");


  if (logoutid == null) { %>
    로그인 된 정보가 없습니다.
  <% } else { %>
    <h2><%=logoutid%>님 로그아웃 되었습니다.</h2> <br>

    <% session.removeAttribute("userid"); %>

    <a href = 'jsplogin.jsp' > 홈으로 </a><br>

  <% }%>




</body>
</html>
