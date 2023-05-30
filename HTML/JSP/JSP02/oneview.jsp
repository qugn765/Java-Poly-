<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<%
String student_id = request.getParameter("student_id");
%>
<HTML>
<HEAD>
<style>
    table {
        border-collapse : collapse;
    } /*table의 형식 선언*/
</style>
</HEAD>
<BODY>
<table width = '100%' border=1>
<tr style = "text-align : center" bgcolor=goldenrod>
    <td>이름</td>
    <td>학번</td>
    <td>국어</td>
    <td>영어</td>
    <td>수학</td>
</tr> <!--Table의 제목 선언-->
<%
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
	// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
	Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		
	ResultSet rset = stmt.executeQuery("select * from student_grade where studentid=" + student_id); // 명령어를 통해 나오는값을 rset에 저장
	while (rset.next()) {
%>
<tr>
    <td><%=rset.getString(1)%></td>
    <td><%=rset.getString(2)%></td>
    <td><%=rset.getString(3)%></td>
    <td><%=rset.getString(4)%></td>
    <td><%=rset.getString(5)%></td>
</tr>
<!--rset으로 가져온 값을 getString을 통해서 index번호를 통해서 테이블에 출력-->        
<%	
	} // rset을 한줄씩 불러오면서 각각의 값들의 맞게 출력
	rset.close();  // 객체닫기
	stmt.close();  // 객체닫기
	conn.close();  // 객체닫기
} catch(Exception e){
%>
<h1>에러 발생</h1>
<%
}
%>
</BODY>
</HTML>