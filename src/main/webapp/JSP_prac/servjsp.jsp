<%@ page import="Servlet.DTO.memberDTO" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오후 6:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>servjsp</title>
</head>
<body>

<%
%>

<table border="5">
    <tr>
        <th>id</th>
        <th>pw</th>
        <th>name</th>
    </tr>
        <%
            ArrayList<memberDTO> allmembers = (ArrayList<memberDTO>)request.getAttribute("allmember");

            for (memberDTO m1 : allmembers
                 ) {%>
        <tr>
        <td><%=m1.getId()%></td>
        <td><%=m1.getPw()%></td>
        <td><%=m1.getName()%></td>
        </tr>
            <%}%>

</table>

</body>
</html>
