<%--
  Created by IntelliJ IDEA.
  User: skyst
  Date: 2022-08-09
  Time: 오후 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>

<div style="margin-left: 20px; width: 300px;" >
    <form action="jsploginprocess.jsp" id="loginform">

        <table border="5">
            <caption> <h2> [ Login ] </h2> </caption>
            <tr><th>아이디:&nbsp; &nbsp;&nbsp;<input type="text" id="id" name="id"></th></tr>
            <tr><th>비밀번호 : <input type="password" id="pw" name="pw"></th></tr>
        </table>

        <input type="hidden" id="role" name="role">

        <br>
        <input type="submit" value="로그인">

    </form>

</div>
<br>
<hr>
<br>
<div>
    <ul>
        <li>
            <a href="jspjoin.jsp">회원가입</a>
        </li>
        <br>
        <br>
        <li>
            <a href="jspmembers.jsp">회원목록 조회</a>
        </li>
        <br>
        <br>
        <br>
        <br>
        <li>
            <a href="jspdelete.jsp">회원탈퇴</a>
        </li>
    </ul>
</div>

<script>

    window.onload = function (){

        document.querySelector("#loginform").addEventListener("submit",
            function(){

                if(document.querySelector("#id").value =='admin' ||
                    document.querySelector("#id").value == 'adm'){
                    document.querySelector("#role").value = 'admin';
                }else {
                    document.querySelector("#role").value = 'user';
                }
            }
            , false );
    }
</script>













</body>
</html>
