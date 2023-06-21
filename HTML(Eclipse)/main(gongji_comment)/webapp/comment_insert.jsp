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
int rootid = Integer.parseInt(request.getParameter("rootid"));
int relevel = Integer.parseInt(request.getParameter("relevel"));
int recnt = Integer.parseInt(request.getParameter("recnt"));
%>
<body>
	<form method="post" action="gongji_comment_write.jsp">
		<table border=1>
			<%
			try {
				GongjiCDao gongjiCDao = new GongjiCDaoImpl();
				GongjiC gongji = new GongjiC();
				Service service = new ServiceImpl();
			%>
			<tr>
				<td width="100px" style="text-align: center">번호</td>
				<td width="550px">댓글(insert) : <%=gongjiCDao.maxId() + 1%>번 <input
					type="hidden" name="id" value="<%=gongjiCDao.maxId() + 1%>">
				</td>
			</tr>
			<tr>
				<td style="text-align: center">제목</td>
				<td><input type="text" style="width: 550px" name="title"
					pattern="[A-Za-z0-9\uAC00-\uD7A3]+" required maxlength="10"
					style="width:550px"></td>
			</tr>
			<tr>
				<td style="text-align: center">날짜</td>
				<td><%=service.nowTime()%> <input type="hidden" name="date"
					value="<%=service.nowTime()%>"></td>
			</tr>
			<tr style="height: 400px">
				<td style="text-align: center">내용</td>
				<td><textarea style="height: 400px; width: 550px"
						name="content"></textarea></td>
			</tr>
			<tr>
				<td style="text-align: center">원글</td>
				<td><input type="text" style="width: 550px" name="rootid"
					pattern="[A-Za-z0-9\uAC00-\uD7A3]+" required maxlength="10"
					style="width:550px" readonly value="<%=rootid%>"></td>
			</tr>
			<tr>
				<td style="text-align: center">댓글 Level</td>
				<td><%=relevel + 1%>&nbsp;&nbsp;&nbsp; 댓글내 순서 : <input
					type="number" readonly name="recnt" min="0" max="1000" required
					value="<%=recnt + 1%>"> <input type="hidden" name="relevel"
					value="<%=relevel + 1%>"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td style="text-align: right"><a
					href="./gongji_comment_list.jsp"> <input type="button"
						value="취소"></a>&nbsp; <input type="submit" value="쓰기"></td>
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
>
