<?xml version="1.0" encoding="UTF-8"?>
<%@ page contentType="text/xml; charset=utf-8"%>

<%@ page import="weather.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.net.*"%>

<%
XmlCreate xmlCreate = new XmlCreate();
List<StudentItem> studentItemList = xmlCreate.selectAll();

out.print("<datas>");
for (StudentItem member : studentItemList) {

   out.print("<data>");

   out.print("<name>" + member.getName() + "</name>");
   out.print("<studentid>" + member.getStudentId() + "</studentid>");
   out.print("<kor>" + member.getKor() + "</kor>");
   out.print("<eng>" + member.getEng() + "</eng>");
   out.print("<mat>" + member.getMat() + "</mat>");

   out.print("</data>");

}
out.print("</datas>");
%>
