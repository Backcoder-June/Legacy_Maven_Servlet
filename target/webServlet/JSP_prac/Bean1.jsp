<%@ page import="Servlet.DTO.memberDTO" %>
<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오전 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bean</title>
</head>
<body>

<%--<%--%>
<%--memberDTO dto2 = new memberDTO();--%>
<%--dto2.setId("pepsi");--%>
<%--dto2.setPw("1111");--%>
<%--dto2.setName("coke");--%>
<%--%>--%>
<%--
<h1> <%=dto.getName()%>님의 아이디가 생성되었습니다. </h1>

<h3>아이디 : <%=dto.getId()%></h3>
<h3>비밀번호 : <%=dto.getPw()%></h3>
--%>

<jsp:useBean id="dto" class="Bean.beandto" scope="page"/>
<jsp:setProperty name="dto" property="id" value="cider" />
<%--
<jsp:setProperty name="dto" property="id" />
<jsp:setProperty name="dto" property="pw" />
<jsp:setProperty name="dto" property="name" />
--%>

<%--property 하고 param 이 일치하면, 즉 set 할 객체 변수이름하고,
파라미터로 들어오는 이름이 같으면 param 을 생략할 수 있다.
 ( property 만 보고, 그거에 맞게 들어온 파라미터를 알아서 붙여서 가져와줌 ) --%>
<%--<jsp:setProperty name="dto" property="id" value="<%=request.getParameter("id")%>" />--%>

<jsp:setProperty name="dto" property="pw" value="1111" />
<jsp:setProperty name="dto" property="name" value="sevenstar" />


<h1> <jsp:getProperty name="dto" property="name"/>  님의 아이디가 생성되었습니다. </h1>

<h3>아이디 : <jsp:getProperty name="dto" property="id"/>     </h3>
<h3>비밀번호 : <jsp:getProperty name="dto" property="pw" />   </h3>

<hr>
<%
dto.getId();
%>


${dto.id}

</body>
</html>
