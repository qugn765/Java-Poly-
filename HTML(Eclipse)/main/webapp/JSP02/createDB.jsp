<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<HTML>
<HEAD>
</HEAD>
<BODY>
<%
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
	// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
	Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		
	stmt.execute("create table student_grade("+
			"name varchar(20),"+
			"studentid int not null primary key,"+
			"kor int,"+
			"eng int,"+
			"mat int)"+
			"DEFAULT CHARSET=utf8;");		
	// student_grade table을 (fieldname  저장형태)의 형식으로 table 생성
				
	stmt.close(); // 에러가 발생하지않기 위해 객체닫기
	conn.close(); // 에러가 발생하지않기 위해 연결끊기
%>
<h1>Table 생성 성공!!</h1>
<%
} catch(Exception e){
%>
<h1>Table 생성 실패!!</h1>
<%
}
%>

</BODY>
</HTML>