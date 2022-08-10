<%@ page import="Servlet.DAO.memberDAO" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 5:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deletprocessjsp</title>
</head>
<body>

<%
  String id = request.getParameter("id");
  String pw = request.getParameter("pw");

  memberDAO dao = new memberDAO();

  int condition = dao.login(id, pw);

  if (condition == 2) {
    String userid = (String)session.getAttribute("userid");

    int deleteResult = dao.delete(id);
    if (deleteResult>0){ %>
    <%=userid%>님의 회원탈퇴가 완료되었습니다.<br>
    <a href ='jspmembers.jsp'>회원목록 조회</a>

  <% } %>
  <% }  else { %>
    아이디 혹은 비밀번호가 일치하지 않습니다.
    <a href = 'jspdelete.jsp'> 다시 시도</a> <br>
    <a href = 'jsplogin.jsp'> 로그인 페이지 </a> <br>
  <%}%>



</body>
</html>
