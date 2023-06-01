<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%
Integer from = 1;
Integer cnt = 10;
try {
	from = Integer.parseInt(request.getParameter("from"));
	cnt = Integer.parseInt(request.getParameter("cnt"));

} catch (Exception e) {
}
// from 값과 cnt값이 처음에 는 없기 때문에 초기값을 잡아주고
// 그이후에 from값과 cnt값을 parameter로 받아와서 정수형으로 변환해줍니다.
%>
<html>
<head>
</head>
<style>
table {
	border-collapse: collapse;
} /*table의 형식 선언*/
</style>
<body>
	<table width='100%' border=1>
		<tr style="text-align: center" bgcolor=goldenrod>
			<td>번호</td>
			<td>주소</td>
			<td>위도</td>
			<td>경도</td>
			<td>거리</td>
		</tr>
		<!--table의 제목부분을 출력-->

		<%
		List<String> filefield = new ArrayList<String>();
		File f = new File("C:\\Users\\KBH\\Desktop\\JSP_workspace\\JSP\\src\\main\\webapp\\JSP01\\전국무료와이파이표준데이터Refine.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		// 리눅스안에있는 파일경로를 지정해서 bufferedReader를 이용해서 읽어오기
		String readtxt;

		if ((readtxt = br.readLine()) == null) {
			out.println("빈 파일입니다.");
			return;
		} // 빈파일인지 체크 
		String[] field_name = readtxt.split(",");
		// 첫번째 줄은 필드명이기때문에 필드네임으로 저장
		int total_cnt = 0;
		while ((readtxt = br.readLine()) != null) {
			filefield.add(readtxt);
			total_cnt++;
		} // 총 파일의 data수를 세기 위해서 ArrayList를 활용해서
			//  ArrayList에 값을 저장하면서 total_cnt를 활용해 총 개수 구하기
		if (from < 1) {
			from = 1;
		} else if (from > total_cnt) {
			from = (total_cnt / 10) * 10 + 1;
		}
		if (cnt < 1) {
			cnt = 10;
		} else if (cnt > 1000) {
			cnt = 1000;
		}
		int total_page = 0;
		int last_page_number = 0;
		if (total_cnt % cnt == 0) {
			total_page = total_cnt / cnt;
			last_page_number = (total_page - 1) * cnt + 1; 
		} else {
			total_page = (total_cnt / cnt) + 1;
			last_page_number = total_page * cnt + 1; 
		}
		int now_page = from / cnt + 1;
		double lat = 37.3860521;
		double lng = 127.1214038;
		// 폴리텍대학의 위도 경도 변수 선언
		int start_pagenumber = (from / (10 * cnt)) * 10;
		// from으로 받아온 데이터 시작값을 이용해서 페이지를 출력하기 위한 계산식
		int LineCnt = 0;
		for (int i = from - 1; i < from + cnt - 1; i++) {
			if (i + 1 > total_cnt)
				break; // 총 파일의 갯수를 넘어가면 break;
			readtxt = filefield.get(i); // from을 이용해 시작data값을 i에 저장하고 for문을 통해서 readtxt에 데이터 저장
			String[] field = readtxt.split(","); // 저장한 data를 배열에 집어넣기
			double dist = Math
			.sqrt(Math.pow(Double.parseDouble(field[13]) - lat, 2) + Math.pow(Double.parseDouble(field[14]) - lng, 2));
			// 배열에 집어넣은 13번째 위도 값과 14번째 경도값을 이용해서 거리 계산
		%>

		<tr style="text-align: center">
			<td><%=field[0]%></td>
			<td><%=field[9]%></td>
			<td><%=field[13]%></td>
			<td><%=field[14]%></td>
			<td><%=dist%></td>
		</tr>
		<!--field로 나눈 배열을 이용해서 번호 주소 위도 경도 거리를 출력-->

		<%
}
br.close(); // bufferedReader닫기

%>
	현재 페이지 :
	<%=now_page%>
	</table>
	<!--table닫기-->
	<div style='text-align: center'>
		<!--밑에 페이지를 출력하기 위한 객체-->
		<form method="get" action="JSPWifi.jsp">
			<!--페이지를 클릭했을때 action과 get함수를 이용해서 parameter 전달-->
			<%
			if (start_pagenumber == 0) {
			} else {
			%>
			<a href="JSPWifi.jsp?from=1&cnt=<%=cnt%>">&lt;&lt;</a> <a
				href="JSPWifi.jsp?from=<%=((start_pagenumber - 10) * cnt + 1)%>&cnt=<%=cnt%>">&lt;</a>
			<%
} // if문을 통해서 첫번째 페이지 (1 2 3 4 ...10)을 출력할때 앞의 페이지가 없으므로 << 를출력하지 않는 조건문
%>
			<%
			for (int i = start_pagenumber; i < start_pagenumber + 10; i++) {
				if ((i * cnt) > total_cnt) {
					break; // 마지막 페이지일때 data가 있는  page까지만 출력하는 조건문
				}
				if (i == (from / cnt)) {
			%>
			<a href="JSPWifi.jsp?from=<%=(i * cnt + 1)%>&cnt=<%=cnt%>"
				style="color: red;"><%=i + 1%></a>
			<%
			} else {
			%>
			<a href="JSPWifi.jsp?from=<%=(i * cnt + 1)%>&cnt=<%=cnt%>"><%=i + 1%></a>
			<%
			}
			} // 위에서 계산한 start_pagenumber를 기준으로 10개를 출력하면서 from과 cnt값을 parameter로 전달하는반복문
			%>
			<%
			if (start_pagenumber == (total_cnt / (10 * cnt)) * 10) {

			} else {
			%>
			<a
				href="JSPWifi.jsp?from=<%=((start_pagenumber + 10) * cnt + 1)%>&cnt=<%=cnt%>">&gt;</a>
			<a
				href="JSPWifi.jsp?from=<%=last_page_number%>&cnt=<%=cnt%>">&gt;&gt;</a>
			<%
			} // if문을 통해서 마지막 페이지 (1481 1482...)을 출력할때 뒤의 페이지가 없으므로 >> 를출력하지 않는 조건문
			%>
		</form>
	</div>

</body>
</html>