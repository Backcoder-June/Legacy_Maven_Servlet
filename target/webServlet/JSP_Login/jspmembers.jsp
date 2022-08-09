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

<%
  memberDAO dao = new memberDAO();
  ArrayList<memberDTO> selectAll = dao.selectAll();
%>


  <style> table, td {border : 5px solid black} </style>
  <table>
    <caption>전체회원 리스트</caption>
  <tr><th>아이디</th><th>이름</th></tr>

    <%
  for (memberDTO dto: selectAll
  ) { %>
    <tr><td> <%=dto.getId() %> </td>
      <td> <%=dto.getName()%> </td></tr>
  <%}%>
  </table>

<br> <a href='jsplogin.jsp'>홈으로</a>

</body>
</html>
