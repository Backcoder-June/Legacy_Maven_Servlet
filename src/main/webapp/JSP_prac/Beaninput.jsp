<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오전 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>beaninput</title>
</head>
<body>

<h1>회원 가입</h1>
<form action="beanrequest1.jsp">
  id : <input type="text" name="id"> <br>
  pw : <input type="password" name="pw"> <br>
  name : <input type="text" name="name"> <br>

  <input type="submit" value="가입">

</form>

<%-- form 태그로만 입력 값 받을거면 if null 등 조건 걸어서 사용 --%>


</body>
</html>
