<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-12
  Time: 오후 3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl2</title>
</head>
<body>

<%--url 태그 선언, 만들어만 두기 --%>
<c:url var="mypage" value="jstl_if_choose.jsp" />
<%----%>
<%--

<c:import url="jstl_if_choose.jsp">
<c:param name="name" value="jho"/>
<c:param name="age" value="100"/>
</c:import>

--%>
import 니까 JSP include 개념으로
저 url 페이지를 아예 포함해서 현재 페이지로 가져오는 것
import 할때 사이에 param으로 변수도 같이 import 도 할 수 있음
( include 처럼 양쪽 view 다 포함 됨 )



redirect  ==  forward 랑 비슷  redirect 쪽 view 만 보여줌
대신 아예 주도권도 넘길 뿐더러
페이지도 그 url로 리다이렉트 시킴.

<c:redirect url="${mypage}">
  <c:param name="name" value="jho"/>
  <c:param name="age" value="100"/>
</c:redirect>






</body>
</html>
