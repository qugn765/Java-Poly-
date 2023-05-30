<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
</head>
<body>
<form method ="get" action ="member.jsp">
이    름 : <input type = "text" name ="username"><br>
<!--form get을 이용해서 username의 이름으로 이름저장-->
비밀번호 : <input type = "text" name ="userpassword"><br>
<!--form get을 이용해서 userpassword의 이름으로 이름저장-->
<input type="submit" value="전송"> <!--전송버튼-->
</body>
</html>