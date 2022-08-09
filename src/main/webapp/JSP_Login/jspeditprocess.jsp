<%@ page import="Servlet.DTO.memberDTO" %>
<%@ page import="Servlet.DAO.memberDAO" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 6:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editprocess</title>
</head>
<body>

<%
    HttpSession session1 = request.getSession();
    String userid = (String)session1.getAttribute("userid");

    String newname = request.getParameter("name");

    int editresult = 0;
    if (userid == null) { %>
        <h3>로그인이 필요합니다.</h3>
    <% }
    else {
        memberDTO dto = new memberDTO(userid, null, newname);

        memberDAO dao = new memberDAO();

         dao.edit(dto); %>

          <h3> <%=userid%> 님의 이름이 <%=newname%> 으로 변경되었습니다. </h3>
        <br>
        <a href = 'jspmembers.jsp'> 회원목록 조회 </a>

        <% } %>



</body>
</html>
