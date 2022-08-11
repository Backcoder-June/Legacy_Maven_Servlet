<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오후 4:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el3</title>
</head>
<body>
<%--
<%
    if (request.getParameter("id") != null) {

    }
%>--%>


${empty param.id?"그냥손님":
param.id} 회원님
${param.pw} 암호를 확인했습니다.
오늘 메뉴는
${paramValues.lunch[0]}
입니다.
      <%--
<%
    String[] lunch = request.getParameterValues("lunch");
    for (int i = 0; i < lunch.length; i++) {
        out.println(lunch[i] + "<br>");
    }
%> 입니다.
--%>

</body>
</html>
