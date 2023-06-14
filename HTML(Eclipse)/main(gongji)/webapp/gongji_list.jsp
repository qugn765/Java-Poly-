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
	text-align: center;
} /*table의 형식 선언*/
</style>
<%
request.setCharacterEncoding("UTF-8");
%>
<%
int now_page = 1;
int countPerPage = 10;
try {
	now_page = Integer.parseInt(request.getParameter("page"));
	countPerPage = Integer.parseInt(request.getParameter("cnt"));
} catch (Exception e) {
	now_page = 1;
	countPerPage = 10;
}
%>
<body>
	<%
	try {
			GongjiDao gongjiDao = new GongjiDaoImpl();
			List<Gongji> gongjiList = new ArrayList<Gongji>();
			Service service = new ServiceImpl();
			Pagination pagination = service.getPagination(now_page, countPerPage);
			gongjiList = gongjiDao.Allview();
	%>
	<div style="margin-left: 300px; width: 150px">
		현재 페이지 :
		<%=pagination.getC()%></div>
	<table border=1 style="">
		<tr style="text-align: center" bgcolor=skyblue>
			<td width="50px">번호</td>
			<td width="500px">제목</td>
			<td width="100px">등록일</td>
		</tr>
		<!--Table을 try 문에 넣어서 만약 data가 없을 경우 에러 발생만 출력할 수 있게 했습니다.-->
		<%
		int cPage = pagination.getC();
		int startNumber = (cPage - 1) * countPerPage;
		int total_cnt = gongjiDao.count();
		if (total_cnt == 0) {
			out.println("<h1>Table에 Data가 없습니다!</h1>");
			return;
		}
		for (int i = startNumber; i < startNumber + countPerPage; i++) {
			if (i > total_cnt - 1)
				break;
		%>
		<tr>
			<td><%=gongjiList.get(i).getId()%></td>
			<td><a href="gongji_view.jsp?id=<%=gongjiList.get(i).getId()%>">
					<%=gongjiList.get(i).getTitle()%></a></td>
			<td><%=gongjiList.get(i).getDate()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<table>
		<tr>
			<td style="width: 600px; text-align: center;">
				<%
				if (pagination.getPp() != -1) {
				%> <a
				href="gongji_list.jsp?page=<%=pagination.getPp()%>&cnt=<%=countPerPage%>">&lt;&lt;</a>
				<a
				href="gongji_list.jsp?page=<%=pagination.getP()%>&cnt=<%=countPerPage%>">&lt;</a>
				<%
				}
				%> <%
 for (int i = pagination.getS(); i < pagination.getE(); i++) {
 	if (((i - 1) * countPerPage) >= total_cnt) {
 		break;
 	}
 %> <a href="gongji_list.jsp?page=<%=(i)%>&cnt=<%=countPerPage%>"><%=i%></a>
				<%
				}
				if (pagination.getNn() != -1) {
				%> <a
				href="gongji_list.jsp?page=<%=(pagination.getN())%>&cnt=<%=countPerPage%>">&gt;</a>
				<a
				href="gongji_list.jsp?page=<%=pagination.getNn()%>&cnt=<%=countPerPage%>">&gt;&gt;</a>
				<%
				}
				%>
			</td>
			<td style="text-align: right;"><a href="./gongji_insert.jsp">
					<input type="button" value="신규">
			</a></td>
	</table>
	<%
	} catch (Exception e) {
	%>
	<h1>에러 발생</h1>
	<%
	}
	%>

</body>
</html>