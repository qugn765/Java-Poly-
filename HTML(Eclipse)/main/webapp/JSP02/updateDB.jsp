<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<%
String name = request.getParameter("name");
Integer student_id = Integer.parseInt(request.getParameter("studentid"));
Integer kor = Integer.parseInt(request.getParameter("kor"));
Integer eng = Integer.parseInt(request.getParameter("eng"));
Integer mat = Integer.parseInt(request.getParameter("mat"));
%>
<HTML>
<HEAD>
</HEAD>
<style>
 h1 {
    margin-bottom: -30px
 }
 input {
    padding-bottom: 10px;
 }
 td {
    text-align:center
 }

</style>
<BODY>
<%
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
	// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
	Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
	String QueryTxt = " "; // mysql에 명령해줄 명령어 저장변수
	QueryTxt = String.format("UPDATE student_grade SET name='%s', kor='%s', eng='%s', mat='%s'  WHERE studentid='%s';",name,kor,eng,mat,student_id);	
    stmt.execute(QueryTxt);
    ResultSet rset = stmt.executeQuery("select * from student_grade;"); // 명령어를 통해 나오는값을 rset에 저장	
%>
<h1>레코드 수정</h1><br><br>
<table width = '100%' border=1>
<tr style = "text-align : center" bgcolor=goldenrod>
    <td>이름</td>
    <td>학번</td>
    <td>국어</td>
    <td>영어</td>
    <td>수학</td>
</tr> <!--Table을 try 문에 넣어서 만약 data가 없을 경우 에러 발생만 출력할 수 있게 했습니다.-->
<%
	while (rset.next()) {
%>
<tr><td>
<a href="oneview.jsp?student_id=<%=rset.getString(2)%>" target="main"><%=rset.getString(1)%></a></td>
    <td><%=rset.getString(2)%></td>
    <td><%=rset.getString(3)%></td>
    <td><%=rset.getString(4)%></td>
    <td><%=rset.getString(5)%></td>
</tr>        
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