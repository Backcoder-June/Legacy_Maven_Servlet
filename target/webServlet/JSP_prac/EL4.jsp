<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오후 5:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el4</title>
</head>
<body>

<jsp:useBean id="dto" class="Bean.beandto" scope="page" />
<jsp:setProperty property="id" name="dto" value="back" />
<jsp:setProperty property="pw" name="dto" value="1111"/>
<jsp:setProperty property="name" name="dto" value="coder"/>



<%--
<JSP 액션태그>
<H1> 회원정보를 생성 완료했습니다. </H1>
<h3>아이디:<jsp:getProperty property="id" name="dto"/> </h3>
<h3>암호:<jsp:getProperty property="pw" name="dto"/> </h3>
<h3>이름:<jsp:getProperty property="name" name="dto"/> </h3>

--%>
<hr>

<%-- EL 은 getProperty 를 개잘한다. getProperty 생략 --%>
<H1> 회원정보를 생성 완료했습니다. </H1>

<h3>아이디: <%=dto.getId()%> </h3>

<h3>아이디: ${dto.id} </h3>
<h3>암호: ${dto.pw} </h3>
<h3>이름: ${dto.name} </h3>


</body>
</html>
