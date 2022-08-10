<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-10
  Time: 오전 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page buffer="8kb" autoFlush="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>out</title>
</head>
<body>

<%=out.getBufferSize()%>
<br>
<%
    boolean autoFlush = out.isAutoFlush();
    out.print(autoFlush);


    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");
    out.write("sfasfjsafjpsafnsapdfjspd,fj");




    out.append("sdfsdfjaspfjpaf");

    out.append("sadndspvnpdsfafpfdsjaf");

    out.append("dasofpowqodopsopfjsofjodjfoapsfo");
%>
<%=out.getRemaining()%>


</body>
</html>
