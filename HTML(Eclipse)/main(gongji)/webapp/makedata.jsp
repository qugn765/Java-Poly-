<%@page import="Dao.*"%>
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
</style>
<body>
	<%
	GongjiDao gongji = new GongjiDaoImpl();
	int checkerror = gongji.makedata();
	if (checkerror == 0) {
	%>
	<h1>오류발생</h1>
	<%
	}
	%>
</body>
</html>