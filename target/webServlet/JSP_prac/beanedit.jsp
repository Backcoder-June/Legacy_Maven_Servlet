<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>eidtjsp</title>
</head>
<body>

<form action="beaneditprocess.jsp" method="post">
  <table border="5">
    <caption> 회원정보 수정 </caption>
    <tr><th>새 이름 :&nbsp;&nbsp; &nbsp; &nbsp;<input type="text" id="name" name="name"></th></tr>
  </table>

  <input type="submit" value="수정">
</form>

<br>
<a href="jsplogin.jsp">홈으로</a>



</body>
</html>
