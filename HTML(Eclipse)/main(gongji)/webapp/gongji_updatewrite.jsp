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
a {
	text-decoration: none;
}
</style>
<%
request.setCharacterEncoding("UTF-8");
%>
<%
int id = 0;
String title = "";
String nowDate = " ";
String content = " ";
try {
	id = Integer.parseInt(request.getParameter("id"));
	title = request.getParameter("title");
	nowDate = request.getParameter("date");
	content = request.getParameter("content");
} catch (Exception e) {
	out.println("<h1>에러 발생</h1>");
}
%>
<body>
	<%
	try {
		GongjiDao gongjiDao = new GongjiDaoImpl();
		int checkerror = gongjiDao.upadteWrite(id, title, nowDate, content);
		out.println("<h1>수정 완료</h1>");
		%>
		<a href="./gongji_list.jsp"><input type="button" value="처음화면으로 가기"></a>
		<%
	} catch (Exception e) {
		out.println("<h1>수정 실패</h1>");
	}
	%>
</BODY>
</HTML>