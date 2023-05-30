<%@page contentType="text/html; charset=UTF-8"%>
<HTML>
<HEAD>
<%!
private String call1(){
    String a = "abc";
    String b = "efg";
    return (a+b);
} // Java 처럼 String형 변수 덧셈 함수 선언
private Integer call2(){
    Integer a = 1;
    Integer b = 2;
    return (a+b);
} // Java 처럼 Integer형 변수 덧셈 함수 선언
%>
</HEAD>
<BODY>
String 연산 : <%=call1()%> <br> <!-- 함수 호출-->
Integer 연산 : <%=call2()%> <br> <!-- 함수 호출-->
</BODY>
</HTML>
