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
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.io.File"%>
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
String name = "";
int inventory = 0;
String goodsdate = " ";
String inventorydate = " ";
String explanation = " ";
String img1="";
String img2="";
try {
	
	String path = "/upload";//저장하는 폴더 위치
	String savePath = request.getServletContext().getRealPath(path);//컴퓨터 저장 위치
	int maxSize = 1024 * 1024 * 1024; //1기가 넘으면 예외발생
	String encodingType = "utf-8";
	MultipartRequest multi = new MultipartRequest(request, savePath, maxSize, encodingType, new DefaultFileRenamePolicy());
	
	id = Integer.parseInt(multi.getParameter("id"));
	name = multi.getParameter("name");
	inventory = Integer.parseInt(multi.getParameter("inventory"));
	goodsdate = multi.getParameter("goodsdate");
	inventorydate = multi.getParameter("inventorydate");
	explanation = multi.getParameter("explanation");

	img1 = multi.getOriginalFileName("fileName");
	img2 = multi.getFilesystemName("fileName");
	//name = request.getParameter("name");
} catch (Exception e) {
	out.println("<h1>에러 발생</h1>");
	out.println(e);
}
%>
<body>
	<%
	try {
		MarketDao marketDao = new MarketDaoImpl();
		int checkerror = marketDao.newWrite(id, name, inventory,goodsdate,inventorydate,explanation,img1,img2);
		%>
		<h1>[<%=name%>] 상품이 등록되었습니다.</h1>
		<a href="./market_list.jsp"><input type="button" value="재고 현황"></a>
		<%
	} catch (Exception e) {
		out.println("<h1>신규 생성 실패</h1>");
	}
	%>
</BODY>
</HTML>