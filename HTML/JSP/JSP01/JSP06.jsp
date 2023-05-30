<%@page contentType="text/html; charset=UTF-8"%>
<HTML>
<HEAD>
</HEAD>
<BODY>
<%
String arr[] = new String[]{"111","222","333"};
try { 
    out.println(arr[4] + "<br>");
} catch (Exception e){
    out.println("error ===>" + e  + "<======<br>");
}
// 3개짜리 배열에서 arr[4]를 호출하기 떄문에 에러가 발생
// catch문을 출력
%>
Good..
</BODY>
</HTML>
