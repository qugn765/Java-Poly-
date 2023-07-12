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
	<form method="post" action="market_updatewrite.jsp">
		<table border=1>
			<%
			try {
				MarketDao marketDao = new MarketDaoImpl();
				Item item = new Item();
				item = marketDao.oneview(id);
				Service service = new ServiceImpl();
				String path = "/upload";//저장하는 폴더 위치
			%>
			<tr>
				<td width="150px" style="text-align: center">상품 번호</td>
				<td width="650px"><%=item.getId()%><input type="hidden" name="id"
					value="<%=item.getId()%>">
				</td>
			</tr>
			<tr>
				<td style="text-align: center">상품명</td>
				<td><%=item.getName()%><input type="hidden" style="width: 550px" name="name"
					style="width: 650px" value="<%=item.getName()%>"></td>
			</tr>
			<tr>
				<td style="text-align: center">재고 현황</td>
				<td><input type="number" min="0" max="10000" required name="inventory"
					value="<%=item.getInventory()%>"></td>
			</tr>
			<tr>
				<td style="text-align: center">상품 등록일</td>
				<td><input type="hidden"
						name="goodsdate" value="<%=item.getGoodsdate()%>"><%=item.getGoodsdate()%></td>
			</tr>
			<tr>
				<td style="text-align: center">재고 등록일</td>
				<td><input type="hidden"
						name="inventorydate" value="<%=service.nowTime()%>"><%=service.nowTime()%></td>
			</tr>
			<tr>
				<td style="text-align: center">상품 설명</td>
				<td><input type="hidden"
						name="explanation" value="<%=item.getExplanation()%>"><%=item.getExplanation()%></td>
			</tr>
			<tr style="height:200px">
				<td style="text-align: center">상품 사진</td>
				<td><input type="hidden"
						name="img1" value="<%=item.getImg2()%>"><img style="height:200px; width:300px" alt="이미지" src="<%="/Market" + path + "/" + item.getImg2()%>"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td style="text-align: right"><a href="./market_list.jsp">
						<input type="button" value="취소">
				</a>&nbsp;<input type="submit" value="완료">&nbsp; 
			</tr>
		</table>
	</form>
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