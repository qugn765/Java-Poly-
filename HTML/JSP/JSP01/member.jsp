<%@page contentType="text/html; charset=UTF-8"%>
<%
    String name = request.getParameter("username");
    //username의 값을 받아와서 변수에 저장
    String password = request.getParameter("userpassword");
    //userpassword의 값을 받아와서 변수에 저장
%>
<html>
<head>
<TITLE>로그인</TITLE>
</head>
<body>
이    름 : <%= name %><br> <!--저장한 변수 출력-->
비밀번호 : <%= password %><br> <!--저장한 변수 출력-->

</body>
</html>