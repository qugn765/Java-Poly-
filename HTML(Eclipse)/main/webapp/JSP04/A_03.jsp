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
<style>
a {
	text-decoration: none;
}
</style>
<%
String name = request.getParameter("name");
int number = Integer.parseInt(request.getParameter("number"));
%>
</HEAD>
<BODY>
	<div style="text-align: center">
		<a href="./A_01.jsp"> <input type="button" value="후보등록"
			style="width: 200px; height: 50px; background-color: yellow"></a> <a href="./B_01.jsp">
			<input type="button" value="투표" style="width: 200px; height: 50px">
		</a> <a href="./C_01.jsp"> <input type="button" value="개표결과"
			style="width: 200px; height: 50px"></a>
	</div>
	<%
	tupyoDao tupyo = new tupyoDaoImpl();
	int checkerror = tupyo.inserthubo(number,name);
	%>
	<table width=600px; align=center border= 1>
	<%
	if (checkerror == 0) {
	%>
	<tr style="text-align : center"><td>후보 등록 결과 : 후보가 추가 되었습니다.</td></tr>
	<%
	} else {
	%>
	<tr style="text-align : center"><td>후보 등록 결과 : 후보 추가를 실패하였습니다.</td></tr>
	<%
	}
	%>
	</table>
</BODY>
</HTML>