package JDBC04Grades;

import java.io.*;
import java.sql.*;

public class Insertgrades {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성

		String k05_name = ""; // 이름을 저장해줄 변수
		String k05_QueryTxt = " "; // mysql에 명령해줄 명령어 저장변수
		int k05_kor; // 국어점수
		int k05_eng; // 영어점수
		int k05_mat; // 수학점수
		int k05_Linecnt = 1; // Line을 세줄 변수 선언
		for(int k05_i = 1; k05_i <= 1000; k05_i++) {
			k05_name = String.format("홍길동%04d",k05_i); // 홍길동1, 홍길동2 .... 
			k05_kor = (int)(Math.random() *100); // 점수를 0~100점까지 랜덤하게 뽑아냄
			k05_eng = (int)(Math.random() *100); // 점수를 0~100점까지 랜덤하게 뽑아냄
			k05_mat = (int)(Math.random() *100); // 점수를 0~100점까지 랜덤하게 뽑아냄

			k05_QueryTxt = String.format("insert into grades(" + "studentid,"+ "name,"
					+ "kor," +"eng,"+ "mat)"
					+ "values(" +"'%s','%s','%s','%s','%s');",
					k05_i, k05_name, k05_kor, k05_eng, k05_mat);
			// mysql에 입력할 문구를 작성하는 과정
			// table의 형태와 맞게 table(fieldname1,..... ,fieldname10) valuse(value1,......value10)이런형태로
			// data를 table에 insert into 명령어로 저장하기 위해 명령어를 저장

			k05_stmt.execute(k05_QueryTxt); // mysql에 명령어를전달해 실행
			System.out.printf("%d번째 항목 Insert OK [%s]\n", k05_Linecnt, k05_QueryTxt);
			// 저장될때마다 몇번째 항목을 저장한지와 저장한 내용을 출력
			k05_Linecnt++; // 한줄을 저장할때마다 1씩추가

		}	
		k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기 
	}
}


