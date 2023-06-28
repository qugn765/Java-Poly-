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
try {
	id = Integer.parseInt(request.getParameter("id"));
} catch (Exception e) {
	out.println("<h1>에러 발생</h1>");
}
%>
<body>
	<form method="post" action="gongji_comment_updatewrite.jsp">
		<table border=1>
			<%
			try {
				GongjiCDao gongjiDao = new GongjiCDaoImpl();
				GongjiC gongji = new GongjiC();
				gongji = gongjiDao.oneview(id);
				Service service = new ServiceImpl();
			%>
			<tr>
				<td width="100px" style="text-align: center">번호</td>
				<td width="550px"><%=gongji.getId()%><input type="hidden" name="id"
					value="<%=gongji.getId()%>">
				</td>
			</tr>
			<tr>
				<td style="text-align: center">제목</td>
				<td><input type="text" style="width: 550px" name="title"
					style="width:550px" value="<%=gongji.getTitle()%>"></td>
			</tr>
			<tr>
				<td style="text-align: center">날짜</td>
				<td><%=service.nowTime()%> <input type="hidden" name="date"
					value="<%=service.nowTime()%>"></td>
			</tr>
			<tr style="height: 400px">
				<td style="text-align: center">내용</td>
				<td><textarea style="height: 400px; width: 550px" pattern="[A-Za-z0-9\uAC00-\uD7A3]+" required maxlength="10"
						name="content"><%=gongji.getContent()%></textarea></td>
			</tr>
		</table>
		<table>
			<tr>
				<td style="text-align: right"><a href="./gongji_comment_list.jsp">
						<input type="button" value="취소">
				</a>&nbsp;<input type="submit" value="쓰기">&nbsp; 
				<a href="./gongji_comment_delete.jsp?id=<%=gongji.getId()%>&relevel=<%=gongji.getRelevel()%>"><input type="button" value="삭제"></a></td>
			</tr>
		</table>
		<input type="hidden" name="rootid" value="<%=gongji.getRootid()%>">
		<input type="hidden" name="relevel" value="<%=gongji.getRelevel()%>">
		<input type="hidden" name="recnt" value="<%=gongji.getRecnt()%>">
		<input type="hidden" name="viewcnt" value="<%=gongji.getViewcnt()%>">
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