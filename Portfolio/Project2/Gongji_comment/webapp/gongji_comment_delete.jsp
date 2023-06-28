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
int relevel=0;
try {
	id = Integer.parseInt(request.getParameter("id"));
	relevel = Integer.parseInt(request.getParameter("relevel"));
} catch (Exception e) {
	out.println("<h1>에러 발생</h1>");
}
%>
<body>
	<%
	try {
		GongjiCDao gongjiCDao = new GongjiCDaoImpl();
		int checkerror = gongjiCDao.delete(id,relevel);
		out.println("<h1>삭제 완료</h1>");
	%>
	<a href="./gongji_comment_list.jsp"><input type="button"
		value="처음화면으로 가기"></a>
	<%
	} catch (Exception e) {
	out.println("<h1>삭제 실패</h1>");
	}
	%>

</BODY>
</HTML>