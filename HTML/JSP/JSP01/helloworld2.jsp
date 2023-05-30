<%@page import="java.sql.*, javax.mail.*,javax.mail.internet.*"
    contentType="text/html; charset=EUC_KR" %>
    <!--UTF-8이 아니므로 한글이 깨짐-->
<!--선언-->
<HTML>
<BODY>
    <% String myURL="http://www.kopo.ac.kr"; %><!--myURL 변수에 링크를 선언-->
    <a href="<%=myURL%>"> 안녕 </a> World. 
    <!--HTML의 a href = 주소 를 이용해서 위에 저장한 변수를 선언해 링크 선언-->
</BODY>
</html>