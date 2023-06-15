<%@page import="Dao.*"%>
<%@page import="Domain.*"%>
<%@page import="Dto.*"%>
<%@page import="Service.*"%>
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
table {
	border-collapse: collapse;
	width: 650px;
	margin-left: 300px;
} /*table의 형식 선언*/
</style>
<%
request.setCharacterEncoding("UTF-8");
%>
<%
int id = 0;
try {
	id = Integer.parseInt(request.getParameter("id"));
} catch (Exception e) {
	out.println("<h1>에러 발생</h1>");
}
%>
<body>
	<table border=1>
		<%
		try {
			GongjiDao gongjiDao = new GongjiDaoImpl();
			Gongji gongji = new Gongji();
			gongji = gongjiDao.oneview(id);
		%>
		<tr>
			<td width="100px" style="text-align: center">번호</td>
			<td width="550px"><%=gongji.getId()%></td>
		</tr>
		<tr>
			<td style="text-align: center">제목</td>
			<td><%=gongji.getTitle()%></td>
		</tr>
		<tr>
			<td style="text-align: center">날짜</td>
			<td><%=gongji.getDate()%></td>
		</tr>
		<tr>
			<td style="text-align: center">내용</td>
			<td><%=gongji.getContent()%></td>
		</tr>
	</table>
	<table>
		<tr>
			<td style="text-align: right"><a href="./gongji_list.jsp"> <input
					type="button" value="목록"></a>&nbsp; <a
				href="./gongji_update.jsp?id=<%=gongji.getId()%>"> <input
					type="button" value="수정"></a></td>
		</tr>
	</table>
	<%
	} catch (Exception e) {
	out.println(e);
	%>
	<h1>에러 발생</h1>
	<%
	}
	%>
</BODY>
</HTML>