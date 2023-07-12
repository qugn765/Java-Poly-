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
			MarketDao marketDao = new MarketDaoImpl();
			Item item = new Item();
			item = marketDao.oneview(id);
			String path = "/upload";//저장하는 폴더 위치
		%>
		<tr>
			<td width="150px" style="text-align: center">상품 번호</td>
			<td width="650px"><%=item.getId()%></td>
		</tr>
		<tr>
			<td style="text-align: center">상품명</td>
			<td><%=item.getName()%></td>
		</tr>
		<tr>
			<td style="text-align: center">재고 현황</td>
			<td><%=item.getInventory()%></td>
		</tr>
		<tr>
			<td style="text-align: center">상품 등록일</td>
			<td><%=item.getGoodsdate()%></td>
		</tr>
		<tr>
			<td style="text-align: center">재고 등록일</td>
			<td><%=item.getInventorydate()%></td>
		</tr>
		<tr>
			<td style="text-align: center">상품 설명</td>
			<td><%=item.getExplanation()%></td>
		</tr>
		<tr>
			<td style="text-align: center">상품 사진</td>
			<td><img style="height:200px; width:300px" alt="이미지" src="<%="/Market" + path + "/" + item.getImg2()%>"></td>
		</tr>
	</table>
	<table>
		<tr>
			<td style="text-align: left"><a href="./market_list.jsp"> <input
					type="button" value="목록"></a></td>
			<td style="text-align: right"><a
				href="./market_delete.jsp?id=<%=item.getId()%>"> <input
					type="button" value="삭제"></a>&nbsp; <a
				href="./market_update.jsp?id=<%=item.getId()%>"> <input
					type="button" value="재고 수정"></a></td>
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