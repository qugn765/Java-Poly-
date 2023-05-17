package JDBC04Grades;

import java.sql.*;

public class Creategrade {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성
		k05_stmt.execute("create table grades(" + "studentid int not null primary key,"+ "name varchar(50),"
				+ "kor int," +"eng int,"+ "mat int)"
				+ "DEFAULT CHARSET=utf8;");
		// grades라는 table을 (fieldname  저장형태)의 형식으로 table 생성
		
		k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기
	}

}

