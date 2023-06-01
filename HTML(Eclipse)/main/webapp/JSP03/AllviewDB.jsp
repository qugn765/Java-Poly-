<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="kr.ac.kopo05.dao.*"%>
<%@page import="kr.ac.kopo05.domain.*"%>
<%@page import="kr.ac.kopo05.dto.*"%>
<%@page import="kr.ac.kopo05.service.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<HTML>
<HEAD>
<style>
table {
	border-collapse: collapse;
} /*table의 형식 선언*/
</style>

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
</HEAD>
<BODY>
	<%
	try {
		StudentItemDao studentItemDao = new StudentItemDaoImpl();
		StudentItemService studentItemService = new StudentItemServiceImpl();
		List<StudentItem> studentItemList = new ArrayList<StudentItem>();
		Pagination pagination = studentItemService.getPagination(now_page, countPerPage);
		studentItemList = studentItemDao.selectAll();
	%>
	현재 페이지 :
	<%=pagination.getC()%>
	<table width='100%' border=1>
		<tr style="text-align: center" bgcolor=goldenrod>
			<td>이름</td>
			<td>학번</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
			<td>등수</td>
		</tr>
		<!--Table을 try 문에 넣어서 만약 data가 없을 경우 에러 발생만 출력할 수 있게 했습니다.-->
		<%
		int cPage = pagination.getC();
		int startNumber = (cPage - 1) * countPerPage;
		int total_cnt = studentItemDao.count();

		for (int i = startNumber; i < startNumber + countPerPage; i++) {
			if (i > total_cnt - 1)
				break;
			int rank = studentItemDao.getRank(studentItemList.get(i).getStudentid());
			int sum = studentItemList.get(i).getKor() + studentItemList.get(i).getEng() + studentItemList.get(i).getMat();
			double avg = ((int) ((sum / 3.0) * 100)) / 100.0;
		%>
		<tr>
			<td><a
				href="oneview.jsp?student_id=<%=studentItemList.get(i).getStudentid()%>"
				target="main"><%=studentItemList.get(i).getName()%></a></td>
			<td><%=studentItemList.get(i).getStudentid()%></td>
			<td><%=studentItemList.get(i).getKor()%></td>
			<td><%=studentItemList.get(i).getEng()%></td>
			<td><%=studentItemList.get(i).getMat()%></td>
			<td><%=sum%></td>
			<td><%=avg%></td>
			<td><%=rank%></td>
		</tr>
		<%
		}
		%>
	</table>
	<div style="text-align: center">
		<%
		if (pagination.getPp() == -1) {

		} else {
		%>
		<a
			href="AllviewDB.jsp?page=<%=pagination.getPp()%>&cnt=<%=countPerPage%>">&lt;&lt;</a>
		<a
			href="AllviewDB.jsp?page=<%=pagination.getP()%>&cnt=<%=countPerPage%>">&lt;</a>

		<%
} // if문을 통해서 첫번째 페이지 (1 2 3 4 ...10)을 출력할때 앞의 페이지가 없으므로 << 를출력하지 않는 조건문
%>
		<%
		for (int i = pagination.getS(); i < pagination.getS() + 10; i++) {
			if (((i - 1) * countPerPage) > total_cnt) {
				break; // 마지막 페이지일때 data가 있는  page까지만 출력하는 조건문
			}
		%>
		<a href="AllviewDB.jsp?page=<%=(i)%>&cnt=<%=countPerPage%>"><%=i%></a>
		<%
		
		} // 위에서 계산한 start_pagenumber를 기준으로 10개를 출력하면서 from과 cnt값을 parameter로 전달하는반복문
		%>
		<%
		if (pagination.getNn() == -1) {

		} else {
		%>
		<a
			href="AllviewDB.jsp?page=<%=(pagination.getN())%>&cnt=<%=countPerPage%>">&gt;</a>
		<a
			href="AllviewDB.jsp?page=<%=pagination.getNn()%>&cnt=<%=countPerPage%>">&gt;&gt;</a>
		<%
		} // if문을 통해서 마지막 페이지 (1481 1482...)을 출력할때 뒤의 페이지가 없으므로 >> 를출력하지 않는 조건문
		%>
	</div>
	<%
	} catch (Exception e) {
	%>
	<h1>에러 발생</h1>
	<%
}
%>

</BODY>
</HTML>