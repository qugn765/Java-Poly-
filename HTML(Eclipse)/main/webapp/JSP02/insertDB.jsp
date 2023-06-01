<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
%>
<!-- JDBC 사용시 필요한 임포트 -->
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="java.io.*"%>
<%
String name = request.getParameter("name");
Integer kor = Integer.parseInt(request.getParameter("kor"));
Integer eng = Integer.parseInt(request.getParameter("eng"));
Integer mat = Integer.parseInt(request.getParameter("mat"));
%>
<HTML>
<HEAD>
</HEAD>
<style>
 h1 {
    margin-bottom: -30px
 }
 input {
    padding-bottom: 10px;
 }
 td {
    text-align:center
 }

</style>
<BODY>
<%
try{
    Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
	Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
	// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
	Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
    ResultSet rset = stmt.executeQuery("select Max(studentid) from student_grade;"); // 명령어를 통해 나오는값을 rset에 저장
	String QueryTxt = " "; // mysql에 명령해줄 명령어 저장변수
    rset.next();
    Integer id = Integer.parseInt(rset.getString(1));
    id = id + 1;
	QueryTxt = String.format("insert into student_grade(" + "name," + "studentid,"
				+ "kor," +"eng,"+ "mat)"
				+ "values(" +"'%s','%s','%s','%s','%s');",
				name, id, kor, eng, mat);
%>
<form>
    <h1 style="height:50px"> 성적입력추가 성공!!</h1><br><br>
    <div style="width:500px; text-align:right">
    <a href = "./intro.html" target="main">
        <input type="button" value="뒤로가기" style="width:100px; height: 25px;"></a>
    </div>
    <table border=1 style="width:500px;">
        <tr>
            <td style="width:100px">이름</td>
            <td style="width:400px"><input type="text" value="<%=name%>" readonly style="width:300px"></td>
        </tr>
        <tr>
            <td style="width:100px">학번</td>
             <td style="width:400px"><input type="text" value="<%=id%>" readonly style="width:300px"></td>
        </tr>
        <tr>
            <td style="width:100px">국어</td>
            <td style="width:400px"><input type="text" value="<%=kor%>" readonly style="width:300px"></td>
        </tr>
        <tr>
            <td style="width:100px">영어</td>
            <td style="width:400px"><input type="text" value="<%=eng%>" readonly style="width:300px"></td>
        </tr>
        <tr>
            <td style="width:100px">수학</td>
            <td style="width:400px"><input type="text" value="<%=mat%>" readonly style="width:300px"></td>
        </tr>
    </table>
<%
	// mysql에 입력할 문구를 작성하는 과정
	// table의 형태와 맞게 table(fieldname1,..... ,fieldname10) valuse(value1,......value10)이런형태로
	// data를 table에 insert into 명령어로 저장하기 위해 명령어를 저장
	stmt.execute(QueryTxt); // mysql에 명령어를전달해 실행
	// 저장될때마다 몇번째 항목을 저장한지와 저장한 내용을 출력
	
	stmt.close(); // 에러가 발생하지않기 위해 객체닫기
	conn.close(); // 에러가 발생하지않기 위해 연결끊기 
} catch(Exception e){
%>
<h1>Table 데이터 값 넣기 실패!!</h1>
<%
}
%>
</BODY>
</HTML>