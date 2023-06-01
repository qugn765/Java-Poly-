<%@page contentType="text/html; charset=UTF-8"%>
<HTML>
<HEAD>
<%!
private class AA{
    private int Sum(int i, int j){
        return i + j;
    } // 클래스안의 함수 선언
} 
AA aa = new AA(); // AA의 클래스의 객체선언
%>
</HEAD>
<BODY>
<% out.println("2+3=" + aa.Sum(2,3));%><br>
<!--AA의 클래스를선언한aa의 Sum함수를 호출해 출력-->
Good...
</BODY>
</HTML>
