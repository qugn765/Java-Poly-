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
			GongjiCDao gongjiDao = new GongjiCDaoImpl();
			GongjiC gongjiC = new GongjiC();
			gongjiC = gongjiDao.oneview(id);
			gongjiDao.viewCntPlus(id);
		%>
		<tr>
			<td width="100px" style="text-align: center">번호</td>
			<td width="550px"><%=gongjiC.getId()%></td>
		</tr>
		<tr>
			<td style="text-align: center">제목</td>
			<td><%=gongjiC.getTitle()%></td>
		</tr>
		<tr>
			<td style="text-align: center">날짜</td>
			<td><%=gongjiC.getDate()%></td>
		</tr>
		<tr>
			<td style="text-align: center">조회수</td>
			<td><%=gongjiC.getViewcnt()+1%></td>
		</tr>
		<tr>
			<td style="text-align: center">내용</td>
			<td><%=gongjiC.getContent()%></td>
		</tr>
	</table>
	<table>
		<tr>
			<td style="text-align: right"><a
				href="./gongji_comment_list.jsp"> <input type="button"
					value="목록"></a>&nbsp; <a
				href="./gongji_comment_update.jsp?id=<%=gongjiC.getId()%>"> <input
					type="button" value="수정"></a>
					&nbsp; <a
				href="./comment_insert.jsp?rootid=<%=gongjiC.getRootid()%>&relevel=<%=gongjiC.getRelevel()%>&recnt=<%=gongjiC.getRecnt()%>"> <input
					type="button" value="댓글"></a></td>
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