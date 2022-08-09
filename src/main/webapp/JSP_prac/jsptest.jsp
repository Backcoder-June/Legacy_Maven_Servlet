<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오전 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.Month" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>Title</title>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<%--  $(document).ready(function(){ });--%>
</head>
<body>

<h1>  jsp 파일입니다. </h1>

<%
    String type2 = "Super JSP";
    // 이건 자바 주석
%>
<!--<img src="">-->


<%--<%= type2%>--%>



<h1>  이건 <%= type2 %> 파일입니다. </h1>


<%
    LocalDateTime current = LocalDateTime.now();
    Date now = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일");
    String nowString = sdf.format(now);

%>
<h1>오늘 날짜는 <%=nowString %>  입니다. </h1>





<script>
$(document).ready(function(){








});



</script>





</body>
</html>
