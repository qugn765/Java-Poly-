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
<script>
/* 이미지 미리보기 */
function setThumbnail(event) {
   var reader = new FileReader();

   reader.onload = function(event) {
      var img = document.createElement("img");
      img.setAttribute("src", event.target.result);
      document.querySelector("div#image_container").appendChild(img);
   };

   reader.readAsDataURL(event.target.files[0]);
}
</script>
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
<body>
	<form action="market_write.jsp" method="post" enctype="multipart/form-data">
		<table border=1>
			<%
			try {
				MarketDao marketDao = new MarketDaoImpl();
				Item item = new Item();
				Service service = new ServiceImpl();
				
			%>
			<tr>
				<td width="150px" style="text-align: center">상품 번호</td>
				<td width="650px">신규(insert) : <%=marketDao.maxId() + 1%>번 <input
					type="hidden" name="id" value="<%=marketDao.maxId()+1%>">
				</td>
			</tr>
			<tr>
				<td style="text-align: center">상품명</td>
				<td><input type="text" pattern="[A-Za-z0-9\uAC00-\uD7A3]+" required maxlength="10" style="width: 650px" name="name"></td>
			</tr>
			<tr>
				<td style="text-align: center">재고 현황</td>
				<td><input type="number" min="0" max ="10000" style="width: 650px" required name="inventory"></td>
			</tr>
			<tr>
				<td style="text-align: center">상품 등록일</td>
				<td><%=service.nowTime()%> <input type="hidden"
					name="goodsdate" value="<%=service.nowTime()%>"></td>
			</tr>
			<tr>
				<td style="text-align: center">재고 등록일</td>
				<td><%=service.nowTime()%> <input type="hidden"
					name="inventorydate" value="<%=service.nowTime()%>"></td>
			</tr>
			<tr>
				<td style="text-align: center">상품 설명</td>
				<td><input type="text" pattern="[A-Za-z0-9\uAC00-\uD7A3]+" required maxlength="30" name="explanation"></td>
			</tr>
			<tr>
				<td style="text-align: center">상품 사진</td>
				<td>첨부파일 : <input type="file" name="fileName" id="image"
                  accept="image/*" onchange="setThumbnail(event)">
                  <div id="image_container"></div>
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td style="text-align: right"><a href="./market_list.jsp">
						<input type="button" value="취소">
				</a>&nbsp; <input type="submit" value="완료"></td>
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