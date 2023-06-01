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
a{
text-decoration : none;
}
</style>
<BODY>
	<div style="text-align: center">
		<a href="./A_01.jsp"> <input type="button" value="후보등록"
			style="width: 200px; height: 50px"></a> <a href="./B_01.jsp">
			<input type="button" value="투표" style="width: 200px; height: 50px; background-color:yellow">
		</a> <a href="./C_01.jsp"> <input type="button" value="개표결과"
			style="width: 200px; height: 50px"></a>
	</div>
	<table style="width:600px" border=1 align=center>
	<%
	tupyoDao tupyo = new tupyoDaoImpl();
	List<hubo> huboList = new ArrayList<hubo>();
	huboList = tupyo.selectAll();
	%>
		<tr>
			<td>
			<div style="display : flex">
			<form action="B_02.jsp" method="get">
			<select name = "hubo" id ="hubo" style="width:250px; text-align:center">
			<%
			for(hubo h : huboList){
				String s = h.getNumber()+ "번 " + h.getName();
			%>
			<option value ="<%=h.getNumber()%>"><%=s%></option>  
			<%
			}
			%>
			</select>
			<select name = "age" id="age" style="width:250px; text-align:center">
			<option value ="10">10대</option>
			<option value ="20">20대</option> 
			<option value ="30">30대</option> 
			<option value ="40">40대</option> 
			<option value ="50">50대</option> 
			<option value ="60">60대</option> 
			<option value ="70">70대</option> 
			<option value ="80">80대</option> 
			<option value ="90">90대</option> 
			</select>
			<input type = "submit" value="제출">
			</form>
			</div>
			</td>
		</tr>
		<%
	%>
</BODY>
</HTML>