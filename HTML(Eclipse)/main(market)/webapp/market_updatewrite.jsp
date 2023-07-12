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
	width: 800px;
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
int inventory = 0;
String inventorydate = "";
try {
	id = Integer.parseInt(request.getParameter("id"));
	inventory = Integer.parseInt(request.getParameter("inventory"));
	inventorydate = request.getParameter("inventorydate");
} catch (Exception e) {
	out.println("<h1>에러 발생</h1>");
}
%>
<body>
	<%
	try {
		MarketDao marketDao = new MarketDaoImpl();
		int checkerror = marketDao.updateWrite(id, inventory,inventorydate);
		String name = marketDao.getName(id);
		%>
		<h1>[<%=name%>] 상품의 재고가 수정되었습니다.</h1>
		<a href="./market_list.jsp"><input type="button" value="재고 현황"></a>
		<%
	} catch (Exception e) {
		out.println("<h1>수정 실패</h1>");
	}
	%>
</BODY>
</HTML>