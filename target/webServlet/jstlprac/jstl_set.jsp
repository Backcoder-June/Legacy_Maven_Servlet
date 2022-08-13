<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-12
  Time: 오전 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


<c:set var="id" value="backcoder"/>

<h1> ${id} 님 jstl 입문완료 </h1>


<c:set var="pw" value="1111"/>


<hr><Br>
<%--자바문장 EL 로 바로 못쓴다. (1)pageContext 사용했어야 한다.
 (2) 자바변수 => JSTL 변수 => EL --%>
<% String nick = "둘리"; %>
<c:set var="id2" value="<%=nick%>"/>
${id2} : 자바에서 JSTL변수를 통해 EL로 보여주는 변수 <br>

<%-- 자바 => EL 가져온거 자바 메소드들 사용 가능 --%>
${id2.toUpperCase()}


<%-- JSTL변수 당연히 JSTL에서 가져다 쓸 수 있다.--%>
<c:set var="editpw" value="${pw+200}"/>

${editpw} : jstl 변수 jstl에서 사용해서 수정 <br>


<%--url--%>
나한테 요청한 클라이언트 ip <%=request.getRemoteAddr()%> <Br>
나한테 요청한 파일명  <%=request.getRequestURI()%> <br>
== <br>

el로 : ${pageContext.request.remoteAddr} <br>
el로 : ${pageContext.request.requestURI} <Br>

<%--JSTL 변수에 넣어두고 편하게 사욯 --%>
<c:set var="ip" value="${pageContext.request.remoteAddr}" />
jstl변수로 뽑은 아이피 : ${ip} <br>

<%--jstl 로 만든 변수값 지우기--%>
<c:remove var="ip"/>

remove 한 후 ip 출력 :${ip}  <br>

<%--if 태그 test="boolean"--%>

<c:if test="${empty ip}">
<h1> ip 정보는 이미 삭제되어 존재하지 않습니다. </h1>
</c:if>

<c:if test="${!empty ip}">
    <h1> ip 정보 : ${ip} </h1>
</c:if>






</body>
</html>
