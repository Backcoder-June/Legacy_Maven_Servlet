<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Servlet.DTO.memberDTO" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-12
  Time: 오전 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ELarray</title>
</head>
<body>

<%
    String[] color = {"red", "black", "white", "green", "gray"};
//    pageContext.setAttribute("color", color);
%>



<%--기본 반복문 + count index vs 사용--%>
<c:forEach items="<%=color%>" var="eachcolor" varStatus="vs">
    ${vs.count} 번째 색 : ${eachcolor} <br>
</c:forEach>


<hr>
<%-- vs.current 사용/ 반복중일때 데이터값/ 뽑을 변수 선언 안해도 됨--%>
<c:forEach items="<%=color%>" var="eachcolor" varStatus="vs">
     반복중일때 데이터 값 : ${vs.current} <br>
</c:forEach>






<%--first last 사용 자체가 의미 가짐 --%>
<c:forEach items="<%=color%>" var="eachcolor" varStatus="vs">
    <c:if test="${vs.last}">
        마지막 색 : ${eachcolor} <br>
    </c:if>

    <c:if test="${vs.first}">
        첫번째 색 : ${eachcolor} <br>
    </c:if>

</c:forEach>




<%--<c:set var="color" value="<%=color%>"  />--%>
<%--자바변수 => jstl 변수에  --%>
<%--변수에 넣어서 사용해도 되고.--%>





${color[0].toUpperCase()} <br>
${color[2].charAt(1)} <br>
${color[4].equals("gray")} <br>




<jsp:useBean id="memberlist" class="java.util.ArrayList" />
<%--<jsp:useBean id="dto4" class="Bean.beandto"/>--%>
<%--
<jsp:setProperty name="dto4" property="name" value="넣어둔이름"/>
<jsp:setProperty name="dto4" property="id" value="넣어둔id"/>
--%>

<%
    memberlist.add(new memberDTO("mem1", "1111", "hoy"));
    memberlist.add(new memberDTO("mem2", "2222", "boy"));
    memberlist.add(new memberDTO("mem3", "3333", "poy"));
//    memberlist.add(dto4);

%>

<table border="5">
<c:forEach items="${memberlist}" var="member" >
    <tr><td>${member.name}회원</td><td>아이디:${member.id}</td></tr>
</c:forEach>
</table>



<hr>
${memberlist[0]} <br>
${memberlist[1]} <br>
${memberlist[2]} <br>
${memberlist[3]} : 이건 ueBean으로 가져온 객체 <br>
${dto4.name}  <br>
${memberlist[3].name} 이거도되나  <br>


<hr>
<Br>


<%--<jsp:useBean id="map" class="java.util.HashMap"/>--%>

<%
    HashMap<String, String> membermap = new HashMap<>();
    membermap.put("빨", "red");
    membermap.put("주", "orange");
    membermap.put("노", "yellow");
    membermap.put("초", "green");
    membermap.put("pink", "핑크");

    pageContext.setAttribute("membermap", membermap);
%>

<hr>
<c:forEach items="${membermap}" var="onecolor" varStatus="vs">


    ${vs.count}key: ${onecolor.key}  / ${vs.count}value: ${onecolor.value}<br>


</c:forEach>





${membermap.get("빨")} <br>
${membermap.get("초")} <br>
== <br>
${membermap["주"]} <br>
${membermap["노"]} <br>
== <br>
${membermap.pink} : key값이 영어일 땐 바로 써도 되긴 한다. <br>



<%
    HashMap<String, memberDTO> dtomap = new HashMap<>();

    dtomap.put("1", new memberDTO("mem1", "1111", "hoy"));
    dtomap.put("2", new memberDTO("mem2", "2222", "boy"));
    dtomap.put("3", new memberDTO("mem3", "3333", "poy"));
%>

<hr>
<%--<c:set var="dm" value="<%=dtomap%>"/>--%>
<c:forEach items="<%=dtomap%>" varStatus="vs">
    ${vs.current.key} => ${vs.current.value} <br>
</c:forEach>





</body>
</html>
