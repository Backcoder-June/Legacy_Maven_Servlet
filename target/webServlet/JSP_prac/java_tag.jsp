<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>javatag</title>
</head>
<body>

<%
  String msg = "콘솔출력";
  System.out.println(msg);
%>

<%
  String msg2 = "브라우저 출력";
%>
<h1><%=msg2%></h1>


<%!
int multiply(int a, int b){return a*b;}
%>

<h1>계산 결과는 <%= multiply(6,5)%> 입니다.</h1>

<%--http://localhost:8090/JSP_war/JSP_prac/java_tag.jsp--%>

</body>
</html>
