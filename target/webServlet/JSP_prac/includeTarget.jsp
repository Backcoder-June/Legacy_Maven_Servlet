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
    <title>includetarget</title>
</head>
<body>

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuKg5mjaUMQmKFyyT2h8Tiftx3iTqOfcgoW2AKrDjICVplZAUg4oWxub8lf0V_XTwKUSA&usqp=CAU>
">
<h3> 개발자 정보 : backcoder </h3>
<h3> 위치 : 강남구 테헤란로 </h3>
<%if (request.getParameter("id")!=null){%>
<%=request.getParameter("id")%>님 을 초대합니다.
<%=request.getParameter("hello")%> 라는 생각이 추가되었습니다.
<%}%>

</body>
</html>
