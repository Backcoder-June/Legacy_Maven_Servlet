<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-13
  Time: 오전 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1> Welcome Homepage </h1>
<hr>
<br>
<br>

<form action="http://localhost:8090/webServlet_war_exploded/starting?menu=login" >

    <table border="5">
        <caption> <h2> [ Login ] </h2> </caption>
        <tr><th>아이디:&nbsp; &nbsp;&nbsp;<input type="text" id="id" name="id"></th></tr>
    </table>

    <br>
    <input type="submit" value="로그인">

</form>



<a href="http://localhost:8090/webServlet_war_exploded/starting?menu=memberlist">회원정보 보러가기</a>
<br>
<br>
<a href="http://localhost:8090/webServlet_war_exploded/starting?menu=boardwriting">게시물 작성하러가기</a>
<br>
<br>
<br>






</body>
</html>
