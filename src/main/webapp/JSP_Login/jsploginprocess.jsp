<%@ page import="Servlet.DAO.memberDAO" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginprocess</title>
</head>
<body>

<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String role = request.getParameter("role");


  memberDAO dao = new memberDAO();
  int condition = dao.login(id,pw);


    if (condition == 2) {

        HttpSession loginsession = request.getSession();
        loginsession.setAttribute("userid", id);

        if (role.equals("admin")) { %>
 <h1><%=id%></h1> 관리자님 로그인 되셨습니다.
 <ul><li> <a href = 'jspmembers.jsp'>모든 사용자 정보 조회</a></li><br>
   <li>블랙리스트 관리</li><br>
   <li>서비스 관리</li><br>
  <li><a href="jsplogout.jsp">로그아웃</a></li></ul><br>


<% }  else if (role.equals("user")) { %>
 <%=id%> 사용자님 환영합니다!
<ul><li> <a href='jspedit.jsp'>내정보 수정</a></li><br>
  <li><a href ='jspdelete.jsp'>회원 탈퇴</a></li><br>
  <li><a href = 'jspboard.jsp'>게시판 이용</a></li><br>
  <li><a href="jsplogout.jsp">로그아웃</a></li></ul><br>

<% } %>

<% } else if(condition == 1 ){ %>
 비밀번호가 일치하지않습니다
<% }
else{ %>
 <a href = 'jspjoin.jsp'>회원가입이 필요합니다</a>
<%}%>



</body>
</html>
