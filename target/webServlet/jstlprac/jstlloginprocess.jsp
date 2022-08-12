<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-12
  Time: 오후 1:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginprocess</title>
</head>
<body>

<%--if문--%>
<c:if test="${empty param.name || empty param.age}" >
  <h1> 입력된 정보가 부족합니다.</h1>
</c:if>

<c:if test="${!empty param.name && !empty param.age}" >
  <c:if test="${param.age >= 20}">
    <h1> ${param.name} 님 성인인증 완료 </h1>
  </c:if>

  <c:if test="${param.age < 20 && param.age>=17}">
    <h1> ${param.name} 님 고등학생 인증 완료 </h1>
  </c:if>

  <c:if test="${param.age<17 &&param.age >= 1}">
    <h1> ${param.name} 님 미성년자 입니다. </h1>
  </c:if>

  <c:if test="${param.age < 1}">
    <h1> ${param.name} 님은 외계인 입니까? </h1>
  </c:if>
</c:if>



<%--스위치문--%>
<c:choose>
  <c:when test="${param.age>=20}">
    <h1>성인인증</h1>
  </c:when>
  <c:when test="${param.age>=17}">
    <h1>고등학생</h1>
  </c:when>
  <c:when test="${param.age>=1}">
    <h1>미성년자</h1>
  </c:when>
  <c:otherwise>
    <h1>당신은 휴멘입니까?</h1>
  </c:otherwise>
</c:choose>








</body>
</html>
