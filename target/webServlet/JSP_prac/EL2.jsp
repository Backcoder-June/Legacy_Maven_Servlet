<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오후 4:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el2</title>
</head>
<body>

<form action="EL3.jsp" method="get">
  아이디입력:<input type=text name=id ><br>
  암호입력:<input type=password name=pw ><br>
  <select name="lunch" multiple>
    <option>한식</option>
    <option>양식</option>
    <option>중식</option>
    <option>일식</option>
    <option>동남아식</option>
  </select>

  <input type=submit value=로그인 ><br>
</form>




</body>
</html>
