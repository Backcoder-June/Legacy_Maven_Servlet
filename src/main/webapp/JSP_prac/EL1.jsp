<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-11
  Time: 오후 3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el1</title>
</head>
<body>

${"EL로 화면에 그냥 바로 뿌리기 근데 이거 HTML이라 그냥도 되잖아" }
<Br>
응 그냥도 되는데, 대신 너는 연산도 된다더라
<br>
${100+100}<br>
${"오 그러네"} <br>

여기 문자 더하기 숫자해뒀어<br>
${'100'+100} <br>
이거 형변환은 자동으로 연산해주네.
<%--${"백"+100}--%>
String 하고 숫자 연산하면 numberformat 오류 준다.

${123} <br>
${"문자"}<br>
${true}<br>
${null}<br>
${'문자'}<br>
${null + 100}<br>
${10/3}<br>
${10%3}<br>
${empty 1} <br>

${'10' += '20'} <br>

${a=22} <br>

vari 뽑은값 : ${a}

<br>
<%
int i = 200;
pageContext.setAttribute("el", i);
%>

${el} <br>

${ j  = 500}
<br>
<%

    out.println("el에서 받아온값 : " +pageContext.getAttribute("j"));
%>






</body>
</html>
