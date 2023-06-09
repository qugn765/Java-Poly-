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
<%
int number = Integer.parseInt(request.getParameter("number"));
%>
</HEAD>
<style>
a {
	text-decoration: none;
}
</style>
<BODY>
	<div style="text-align: center">
		<a href="./A_01.jsp"> <input type="button" value="후보등록"
			style="width: 20%; height: 50px"></a> <a href="./B_01.jsp"> <input
			type="button" value="투표" style="width: 20%; height: 50px">
		</a> <a href="./C_01.jsp"> <input type="button" value="개표결과"
			style="width: 20%; height: 50px; background-color: yellow"></a>
	</div>
	<%
	tupyoDao tupyo = new tupyoDaoImpl();
	AgeRate agerate = new AgeRate();
	hubo h = new hubo();
	agerate = tupyo.selectOneRate(number);
	h = tupyo.selectOne(number);
	String huboName = h.getNumber() + " 번 " + h.getName() + "후보 득표성향 분석";
	%>
	<table width="60%" ; align=center border=1>
		<tr>
			<td colspan="2" style="text-align: center"><h2><%=huboName%></h2></td>
		</tr>
		<tr>
			<td width="15%">10대</td>
			<td><img src="bar.PNG"
				width=<%=agerate.getRate10() * 80 / 100%> % height=15px><%=agerate.getRate10()%>%(<%=agerate.getCount10()%>표)</td>
		</tr>
		<tr>
			<td width="15%">20대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate20() * 80 / 100%>%" height=15px><%=agerate.getRate20()%>%(<%=agerate.getCount20()%>표)</td>
		</tr>
		<tr>
			<td width="15%">30대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate30() * 80 / 100%>%" height=15px><%=agerate.getRate30()%>%(<%=agerate.getCount30()%>표)</td>
		</tr>
		<tr>
			<td width="15%">40대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate40() * 80 / 100%>%" height=15px><%=agerate.getRate40()%>%(<%=agerate.getCount40()%>표)</td>
		</tr>
		<tr>
			<td width="15%">50대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate50() * 80 / 100%>%" height=15px><%=agerate.getRate50()%>%(<%=agerate.getCount50()%>표)</td>
		</tr>
		<tr>
			<td width="15%">60대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate60() * 80 / 100%>%" height=15px><%=agerate.getRate60()%>%(<%=agerate.getCount60()%>표)</td>
		</tr>
		<tr>
			<td width="15%">70대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate70() * 80 / 100%>%" height=15px><%=agerate.getRate70()%>%(<%=agerate.getCount70()%>표)</td>
		</tr>
		<tr>
			<td width="15%">80대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate80() * 80 / 100%>%" height=15px><%=agerate.getRate80()%>%(<%=agerate.getCount80()%>표)</td>
		</tr>
		<tr>
			<td width="15%">90대</td>
			<td><img src="bar.PNG"
				width="<%=agerate.getRate90() * 80 / 100%>%" height=15px><%=agerate.getRate90()%>%(<%=agerate.getCount90()%>표)</td>
		</tr>

	</table>
</BODY>
</HTML>