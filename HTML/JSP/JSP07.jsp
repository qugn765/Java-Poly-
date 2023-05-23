<%@page contentType="text/html; charset=UTF-8"%>
<%@ page errorPage="error.jsp" %> <!--에러가 발생했을때 "error.jsp로 이동-->
<HTML>
<HEAD>
</HEAD>
<BODY>
<%
String arr[] = new String[]{"111","222","333"}; //3개짜리 배열선언
out.println(arr[4] + "<br>"); // 3개짜리 배열인데 arr[4]를 호출하므로 에러발생
// 에러가 발생했을떄 errorPage="error.jsp"로 이동
%>
Good..
</BODY>
</HTML>
