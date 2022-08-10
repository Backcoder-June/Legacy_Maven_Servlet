<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오후 3:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>incldue1</title>
</head>
<body>



<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");

%>

<h1> <%=id%> 회원님 환영합니다 </h1>
<h2> 정보조회 가능합니다. </h2>

<jsp:include page="/JSP_prac/includeTarget.jsp">
<jsp:param name="hello" value="한글안깨지기"/>
</jsp:include>
<%--request Encoding set 추가해보자 --%>

</body>
</html>
