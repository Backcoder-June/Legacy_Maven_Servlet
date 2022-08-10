<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오후 4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forward</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String file = "";
    Object menu1 = "사용자리스트";
    String menu2 = "상품관리";


    if (id!=null) {
        if (id.equalsIgnoreCase("admin")) {
            out.println("관리자로 로그인 하였습니다");
            file = "forward1.jsp";
        } else {
            out.println("사용자로 로그인 하였습니다");
            file = "forward2.jsp";
        }%>
<jsp:forward page="<%=file%>">
    <jsp:param name="menue1" value="<%=menu1%>"/>
    <jsp:param name="menue2" value="<%=menu2%>"/>
</jsp:forward>
<%--forward 시키면 forward 시키기 전에 입력값은 무시함 forward에서의 값만 셈--%>
<%}else {
        out.println("아이디 입력이 필요합니다.");
    }%>


<h1>forward 전에 입력값 </h1>
</body>
</html>
