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
<style>
a {
	text-decoration: none;
}

table {
	border-collapse: collapse;
}
</style>
<BODY>
	<div style="text-align: center">
		<a href="./A_01.jsp"> <input type="button" value="후보등록"
			style="width: 200px; height: 50px"></a> <a href="./B_01.jsp">
			<input type="button" value="투표" style="width: 200px; height: 50px">
		</a> <a href="./C_01.jsp"> <input type="button" value="개표결과"
			style="width: 200px; height: 50px; background-color: yellow"></a>
	</div>
	<%
	tupyoDao tupyo = new tupyoDaoImpl();
	List<hubo> huboList = new ArrayList<hubo>();
	huboList = tupyo.selectAll();
	%>
	<table width=600px; align=center border=1>
		<tr style="text-align: center">
			<td colspan="2">후보 별 득표율</td>
		</tr>
		<%
		for (hubo h : huboList) {
			String s = h.getNumber() + " " + h.getName();
			AgeRate agerate = new AgeRate();
			agerate = tupyo.tupyorate(h.getNumber());
			float rate = ((float)((int)(agerate.getRate() * 10000)) / 100);
		%>
		<tr>
			<td width = 150px><a href = "./C_02.jsp?number=<%=h.getNumber()%>"><%=s%></a></td>
			<td><img src = "bar.PNG" width = <%=rate * 300 / 100%> height = 25px><%=rate%>%(<%=agerate.getCount()%>표)</td>
		</tr>
		<%
		}
		%>
	</table>
</BODY>
</HTML>