<%@page contentType="text/html; charset=UTF-8"%>
<HTML>
<HEAD>
<SCRIPT>
function call1(){
    var a = "abc";
    var b = "efg";
    document.write("String 연산 :" + (a+b));
} // string 두 변수를 합쳐주는 함수 선언
function call2(){
    var a = 1;
    var b = 2;
    document.write("Integer 연산 :" + (a+b));
} // Integer 두 변수를 합쳐주는 함수 선언
</SCRIPT>
</HEAD>
<BODY>
<SCRIPT>call1();</SCRIPT><br> <!-- 함수 호출-->
<SCRIPT>call2();</SCRIPT><!-- 함수 호출-->
</BODY>
</HTML>
