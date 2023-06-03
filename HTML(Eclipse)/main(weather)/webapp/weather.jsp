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
<title>Insert title here</title>
</head>
<style>
td {
   text-align: center;
}

th {
   background: #f1f1e8;
   height: 30px;
}
</style>

<!-- <script>
   window.setTimeout('window.location.reload()', 10000);
</script> -->

<body>


   <%
   WeatherDate weatherClass = new WeatherDate();
   String timeNow = weatherClass.getDateNow();

   DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
   Document doc = docBuilder.parse("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=61&gridy=123");

   Element root = doc.getDocumentElement();

   NodeList tag_001 = doc.getElementsByTagName("data");
   NodeList tag_hour = doc.getElementsByTagName("hour");
   NodeList tag_day = doc.getElementsByTagName("day");
   NodeList tag_temp = doc.getElementsByTagName("temp");
   NodeList tag_tmx = doc.getElementsByTagName("tmx");
   NodeList tag_tmn = doc.getElementsByTagName("tmn");
   NodeList tag_sky = doc.getElementsByTagName("sky");
   NodeList tag_pty = doc.getElementsByTagName("pty");
   NodeList tag_wfKor = doc.getElementsByTagName("wfKor");
   NodeList tag_wfEn = doc.getElementsByTagName("wfEn");
   NodeList tag_pop = doc.getElementsByTagName("pop");
   NodeList tag_r12 = doc.getElementsByTagName("r12");
   NodeList tag_s12 = doc.getElementsByTagName("s12");
   NodeList tag_ws = doc.getElementsByTagName("ws");
   NodeList tag_wd = doc.getElementsByTagName("wd");
   NodeList tag_wdKor = doc.getElementsByTagName("wdKor");
   NodeList tag_wdEn = doc.getElementsByTagName("wdEn");
   NodeList tag_reh = doc.getElementsByTagName("reh");
   NodeList tag_r06 = doc.getElementsByTagName("r06");
   NodeList tag_s06 = doc.getElementsByTagName("s06");

   out.print("<center><h1>경기도 성남시 분당구의 동네 예보</h1></center>");
   out.print("<center><h3>" + timeNow + " 발표</h3></center>");

   out.print("<table cellspacing=1  border=1>");
   out.print("<tr>");
   out.print("<th width=100 class='thead'>SEQ</th>");
   out.print("<th width=100 class='thead'>DAY,HOUR</th>");
   /* out.print("<td width=100>day</td>"); */
   out.print("<th width=100>TEMP</th>");
   out.print("<th width=100>TMX</th>");
   out.print("<th width=100>TMN</th>");
   out.print("<th width=100>SKY</th>");
   out.print("<th width=100>PTY</th>");
   out.print("<th width=100>WFKOR</th>");
   out.print("<th width=100>WFEN</th>");
   out.print("<th width=100>POP</th>");
   out.print("<th width=100>R12</th>");
   out.print("<th width=100>S12</th>");
   out.print("<th width=100>WS</th>");
   out.print("<th width=100>WD</th>");
   out.print("<th width=100>WDKOR</th>");
   out.print("<th width=100>WDEN</th>");
   out.print("<th width=100>REH</th>");
   out.print("<th width=100>R06</th>");
   out.print("<th width=100>S06</th>");
   out.print("</tr>");

   for (int i = 0; i < tag_hour.getLength(); i++) {
      out.print("<tr>");

      out.print("<td width=100>" + tag_001.item(i).getAttributes().getNamedItem("seq").getNodeValue() + "</td>"); //48시간중 몇번째 인지 가르킴

      int today = Integer.parseInt(tag_day.item(i).getFirstChild().getNodeValue());
      if (today == 0) {
         out.print("<td width=100>오늘" + tag_hour.item(i).getFirstChild().getNodeValue() + "시</td>"); //동네예보 3시간 단위
      } else if (today == 1) {
         out.print("<td width=100>내일" + tag_hour.item(i).getFirstChild().getNodeValue() + "시</td>"); //동네예보 3시간 단위
      } else if (today == 2) {
         out.print("<td width=100>모레" + tag_hour.item(i).getFirstChild().getNodeValue() + "시</td>"); //동네예보 3시간 단위
      }

      /* if (today == 0) {
         out.print("<td width=100>오늘</td>"); //1번째날 (0: 오눌/1: 내일/2: 모레)
      } else if (today == 1) {
         out.print("<td width=100>내일</td>");
      } else if (today == 2) {
         out.print("<td width=100>모레</td>");
      } */

      out.print("<td width=100>" + tag_temp.item(i).getFirstChild().getNodeValue() + "</td>"); //현재시간 온도
      out.print("<td width=100>" + tag_tmx.item(i).getFirstChild().getNodeValue() + "</td>"); //최고온도
      out.print("<td width=100>" + tag_tmn.item(i).getFirstChild().getNodeValue() + "</td>"); //최저온도

      int weatherStat = Integer.parseInt(tag_sky.item(i).getFirstChild().getNodeValue());
      if (weatherStat == 1) {
         out.print("<td width=100><img src='./img/sunny.png'></td>"); //하늘 상태 코드(1: 맑음/ 2: 구름조금, /3: 구름많음, /4: 흐림)
      } else if (weatherStat == 2) {
         out.print("<td width=100><img src='./img/sunCloud.png'></td>");
      } else if (weatherStat == 3) {
         out.print("<td width=100><img src='./img/littleCloud.png' style='width:40px'></td>");
      } else if (weatherStat == 4) {
         out.print("<td width=100><img src='./img/cloudy.png'></td>");
      }

      int ptyItem = Integer.parseInt(tag_pty.item(i).getFirstChild().getNodeValue());
      if (ptyItem == 0) {
         out.print("<td width=100><img src='./img/sunny.png'></td>");
      } else if (ptyItem == 1) {
         out.print("<td width=100><img src='./img/rainny.png'></td>");
      } else if (ptyItem == 2) {
         out.print("<td width=100><img src='./img/rainsnow.png'></td>");
      } else if (ptyItem == 3) {
         out.print("<td width=100><img src='./img/rainsnow.png'></td>");
      } else if (ptyItem == 4) {
         out.print("<td width=100><img src='./img/snow.png'></td>");
      }

      out.print("<td width=100>" + tag_wfKor.item(i).getFirstChild().getNodeValue() + "</td>"); //날씨 한국어
      out.print("<td width=100>" + tag_wfEn.item(i).getFirstChild().getNodeValue() + "</td>"); //날씨 영어
      out.print("<td width=100>" + tag_pop.item(i).getFirstChild().getNodeValue() + "</td>"); //강수 확율%
      out.print("<td width=100>" + tag_r12.item(i).getFirstChild().getNodeValue() + "</td>"); //12시간 예상 강수량
      out.print("<td width=100>" + tag_s12.item(i).getFirstChild().getNodeValue() + "</td>"); //12시간 예상 적설량

      Double wsItem = Double.parseDouble(tag_ws.item(i).getFirstChild().getNodeValue());
      String weItemFormat = String.format("%.2f", wsItem);

      out.print("<td width=100>" + weItemFormat + "</td>"); //풍속(m/s)

      int windDir = Integer.parseInt(tag_wd.item(i).getFirstChild().getNodeValue());
      if (windDir == 0) {
         out.print("<td width=100><img src='./img/0.png' style='width:35px;'></td>");
      } else if (windDir == 1) {
         out.print("<td width=100><img src='./img/1.png' style='width:35px'></td>");
      } else if (windDir == 2) {
         out.print("<td width=100><img src='./img/2.png' style='width:35px'></td>");
      } else if (windDir == 3) {
         out.print("<td width=100><img src='./img/3.png' style='width:35px'></td>");
      } else if (windDir == 4) {
         out.print("<td width=100><img src='./img/4.png' style='width:35px'></td>");
      } else if (windDir == 5) {
         out.print("<td width=100><img src='./img/5.png' style='width:35px'></td>");
      } else if (windDir == 6) {
         out.print("<td width=100><img src='./img/6.png' style='width:35px'></td>");
      } else if (windDir == 7) {
         out.print("<td width=100><img src='./img/7.png' style='width:35px'></td>");
      }

      out.print("<td width=100>" + tag_wdKor.item(i).getFirstChild().getNodeValue() + "</td>"); //풍향 한국어
      out.print("<td width=100>" + tag_wdEn.item(i).getFirstChild().getNodeValue() + "</td>"); //풍향 영어
      out.print("<td width=100>" + tag_reh.item(i).getFirstChild().getNodeValue() + "</td>"); //습도 %
      out.print("<td width=100>" + tag_r06.item(i).getFirstChild().getNodeValue() + "</td>"); //6시간 예상 강수량
      out.print("<td width=100>" + tag_s06.item(i).getFirstChild().getNodeValue() + "</td>"); //6시간 예상 적설량
      out.print("</tr>");
   }

   out.print("</table>");
   %>

</body>
</html>