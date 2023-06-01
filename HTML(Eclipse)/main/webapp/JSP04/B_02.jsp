<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="kr.ac.kopo05.tupyo.dao.*"%>
<%@page import="kr.ac.kopo05.tupyo.domain.*"%>
<%@page import="kr.ac.kopo05.tupyo.dto.*"%>
<%@page import="kr.ac.kopo05.tupyo.service.*"%>
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
</HEAD>
<%
int hubo = Integer.parseInt(request.getParameter("hubo"));
int age = Integer.parseInt(request.getParameter("age"));
%>
<style>
a {
	text-decoration: none;
}
</style>
<BODY>
	<div style="text-align: center">
		<a href="./A_01.jsp"> <input type="button" value="후보등록"
			style="width: 200px; height: 50px"></a> <a href="./B_01.jsp">
			<input type="button" value="투표" style="width: 200px; height: 50px; background-color: yellow">
		</a> <a href="./C_01.jsp"> <input type="button" value="개표결과"
			style="width: 200px; height: 50px"></a>
	</div>
	<%
	tupyoDao tupyo = new tupyoDaoImpl();
	int checkerror = tupyo.inserttupyo(hubo, age);
	
	%>
	<table width=600px; align=center border= 1>
	<%
	if (checkerror == 0) {
	%>
	<tr style="text-align : center"><td>투표 결과 : 투표하였습니다.</td></tr>
	<%
	} else {
	%>
	<tr style="text-align : center"><td>투표 결과 : 투표등록을 실패하였습니다.</td></tr>
	<%
	}
	%>
	</table>

</BODY>
</HTML>