<%@ page import="Servlet.DTO.memberDTO" %>
<%@ page import="Servlet.DAO.memberDAO" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspjoin</title>
</head>
<body>

<%

  String id = request.getParameter("id");
  String pw = request.getParameter("pw");
  String name = request.getParameter("name");

  memberDTO dto = new memberDTO(id, pw, name);
  memberDAO dao = new memberDAO();

  //login 조회 로직 이용해서 회원가입
  int condition = dao.login(id, pw);

  if (condition == 3) {
    dao.join(dto);
    %>
     회원가입을 축하드랍니다!
  <%} else {%> 이미 가입된 회원입니다.
<%} %>

<br>

  <a href = 'jsplogin.jsp'>로그인하러 가기</a>


</body>
</html>
