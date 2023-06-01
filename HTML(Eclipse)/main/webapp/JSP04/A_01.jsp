<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="kr.ac.kopo05.tupyo.dao.*"%>
<%@page import="kr.ac.kopo05.tupyo.domain.*"%>
<%@page import="kr.ac.kopo05.tupyo.dto.*"%>
<%@page import="kr.ac.kopo05.tupyo.service.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<html>
<head>
</head>
<style>
a{
text-decoration : none;
}
</style>
<body>
		<div style="text-align: center">
		<a href="./A_01.jsp"> <input type="button" value="후보등록"
			style="width: 200px; height: 50px; background-color:yellow"></a> <a href="./B_01.jsp">
			<input type="button" value="투표" style="width: 200px; height: 50px">
		</a> <a href="./C_01.jsp"> <input type="button" value="개표결과"
			style="width: 200px; height: 50px"></a>
	</div>
	<table style="width:600px" border=1 align=center>
		<%
		tupyoDao tupyo = new tupyoDaoImpl();
		List<hubo> huboList = new ArrayList<hubo>();
		huboList = tupyo.selectAll();
		for (hubo hb : huboList) {
			String name = hb.getName();
			int number = hb.getNumber();
		%>
		<tr>
			<td>
				<div style="display : flex">
					<div style="width: 251px">
						기호번호 :
						<%=number%>
					</div>
					<div style="width: 240px">
						후보명 :
						<%=name%></div>
					<div style="width: 100px">
					<a href = "./A_02.jsp?number=<%=number%>&name=<%=name%>">
						<input type="submit" value="삭제" style="text-align: right"></a>
					</div>
				</div>
			</td>
		</tr>
		<%
		}
		%>
		<form action="A_03.jsp" method="get">
		<tr>
			<td>기호번호 : <input type="number" name="number"> 후보명 : <input
				type="text" name="name"> <input type="submit" value="추가">
			</td>
		</tr>
		</form>
	</table>
</body>
</html>