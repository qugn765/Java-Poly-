<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<HTML>
<HEAD>
</HEAD>
<BODY>
<%
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
	// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
	Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성

	String name = ""; // 이름을 저장해줄 변수
	String QueryTxt = " "; // mysql에 명령해줄 명령어 저장변수
	int kor; // 국어점수
	int eng; // 영어점수
	int mat; // 수학점수
	int id = 209901; // Line을 세줄 변수 선언
	for(int i = 1; i <= 30; i++) {
		name = String.format("홍길동%02d",i); // 홍길동1, 홍길동2 .... 
		kor = (int)(Math.random() *101); // 점수를 0~100점까지 랜덤하게 뽑아냄
		eng = (int)(Math.random() *101); // 점수를 0~100점까지 랜덤하게 뽑아냄
		mat = (int)(Math.random() *101); // 점수를 0~100점까지 랜덤하게 뽑아냄

		QueryTxt = String.format("insert into student_grade(" + "name," + "studentid,"
				+ "kor," +"eng,"+ "mat)"
				+ "values(" +"'%s','%s','%s','%s','%s');",
				name, id, kor, eng, mat);
		// mysql에 입력할 문구를 작성하는 과정
		// table의 형태와 맞게 table(fieldname1,..... ,fieldname10) valuse(value1,......value10)이런형태로
		// data를 table에 insert into 명령어로 저장하기 위해 명령어를 저장
		stmt.execute(QueryTxt); // mysql에 명령어를전달해 실행
		// 저장될때마다 몇번째 항목을 저장한지와 저장한 내용을 출력
        id++;
	}	
	stmt.close(); // 에러가 발생하지않기 위해 객체닫기
	conn.close(); // 에러가 발생하지않기 위해 연결끊기 
%>
<h1>Table 데이터 값 넣기 성공!!</h1>
<%
} catch(Exception e){
%>
<h1>Table 데이터 값 넣기 실패!!</h1>
<%
}
%>
</BODY>
</HTML>