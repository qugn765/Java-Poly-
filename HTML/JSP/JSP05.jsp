<%@page contentType="text/html; charset=UTF-8"%>
<HTML>
<HEAD>
<%!
String arr[] = new String[]{"111","222","333"}; // 3개짜리 배열 선언
String str = "abc,efg,hij"; // 문자열선언
String str_arr[] = str.split(","); // 문자열을 ,단위로 스플릿한 3개짜리 배열
%>
</HEAD>
<BODY>
arr[0] : <%= arr[0] %><br>
arr[1] : <%= arr[1] %><br>
arr[2] : <%= arr[2] %><br>
str_arr[0] : <%= str_arr[0] %><br>
str_arr[1] : <%= str_arr[1] %><br>
str_arr[2] : <%= str_arr[2] %><br>
<!--배열들 호출해서 출력-->
</BODY>
</HTML>
