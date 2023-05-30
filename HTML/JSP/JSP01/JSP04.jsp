<%@page contentType="text/html; charset=UTF-8"%>
<HTML>
<HEAD>
<%!
String str = "abcdfeffasdsd"; // 문자열 선언
int str_len = str.length(); // 문자열의 길이
String str_sub = str.substring(5); // 문자열 0~4까지 substring
int str_loc = str.indexOf("cd"); // cd의 index번호
String strL = str.toLowerCase(); // 다 소문자로
String strU = str.toUpperCase(); // 다 대문자로
%>
</HEAD>
<BODY>
Str : <%=str%><br> <!--문자열 출력-->
str_len : <%=str_len%><br> <!--문자열 길이 출력-->
str_sub : <%=str_sub%><br> <!--문자열 substring한거 출력-->
str_loc : <%=str_loc%><br> <!--cd의 index번호 출력-->
strL : <%=strL%><br> <!--소문자로 바꾼거 출력-->
strU : <%=strU%><br> <!--대문자로 바꾼거 출력-->
</BODY>
</HTML>
