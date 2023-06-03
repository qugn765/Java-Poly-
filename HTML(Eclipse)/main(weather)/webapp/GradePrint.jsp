<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="weather.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.net.*"%>
<%@ page import="javax.xml.parsers.*,org.w3c.dom.*"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	border-collapse: collapse;
	text-align : center
}
</style>
</head>
<body>

	<%
   DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
   Document doc = docBuilder.parse("http://192.168.23.54:8081/WeatherForecast/XmlCreate.jsp");

   Element root = doc.getDocumentElement();
   NodeList tag_name = doc.getElementsByTagName("name");
   NodeList tag_studentid = doc.getElementsByTagName("studentid");
   NodeList tag_kor = doc.getElementsByTagName("kor");
   NodeList tag_eng = doc.getElementsByTagName("eng");
   NodeList tag_mat = doc.getElementsByTagName("mat");
   
   out.print("<h1>성적 조회 Page</h1>");
   out.print("<table width=500 border=1>");
   out.print("<tr style='background-color:greenyellow'>");
   out.print("<td width=100>이름</td>");
   out.print("<td width=100>학번</td>");
   out.print("<td width=100>국어</td>");
   out.print("<td width=100>영어</td>");
   out.print("<td width=100>수학</td>");
   out.print("</tr>");

   for (int i = 0; i < tag_name.getLength(); i++) {
      out.print("<tr>");
      out.print("<td width=100>" + tag_name.item(i).getFirstChild().getNodeValue() + "</td>");
      out.print("<td width=100>" + tag_studentid.item(i).getFirstChild().getNodeValue() + "</td>");
      out.print("<td width=100>" + tag_kor.item(i).getFirstChild().getNodeValue() + "</td>");
      out.print("<td width=100>" + tag_eng.item(i).getFirstChild().getNodeValue() + "</td>");
      out.print("<td width=100>" + tag_mat.item(i).getFirstChild().getNodeValue() + "</td>");
      out.print("</tr>");
   }

   out.print("</table>");
   %>

</body>
</html>