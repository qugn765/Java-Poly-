package JDBC05Stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성

		String k05_QueryTxt;// mysql에 명령어를 입력하기위한 변수 선언

		k05_QueryTxt = "select count(*) from stock";
		//installation_purpose 값이 생활방범인 data 출력
		ResultSet k05_rset = k05_stmt.executeQuery(k05_QueryTxt);
		// 명령어를 입력했을 때 나오는 값을 rset에 저장
		int k05_cnt = 1;
		while (k05_rset.next()) { // rset에 저장된 데이터 하나씩 넘기면서 반복
			System.out.println(k05_rset.getString(1));
		}
		k05_rset.close(); // 객체닫기
		k05_stmt.close(); // 객체닫기
		k05_conn.close(); // 객체닫기

	}
}



// 단축코드, 일자, 	              시가,         고가,       저가,      종가,         거래량,          거래대금
// code,     transaction_date, open_price, high_price, low_pricㄴe, close_price, trading_volume, trading_amount
// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]

//1번
// k05_QueryTxt = "select count(*) from stock";

// 2번
// k05_QueryTxt = "select * from stock where Stockcode = 'A005930'";

/*
			System.out.printf("*********************************************************\n");
			System.out.printf("유가증권 단축 종목코드 : %s\n", k05_rset.getString(1));
			System.out.printf("주식 영업 일자         : %s\n", k05_rset.getString(2));
			System.out.printf("시가                   : %s\n", k05_rset.getString(3));
			System.out.printf("고가                   : %s\n", k05_rset.getString(4));
			System.out.printf("저가                   : %s\n", k05_rset.getString(5));
			System.out.printf("종가                   : %s\n", k05_rset.getString(6));
			System.out.printf("거래량                 : %s\n", k05_rset.getString(7));
			System.out.printf("거래대금               : %s\n", k05_rset.getString(8));
			System.out.println("출력개수              : " + k05_cnt);
			k05_cnt++;
*/
// 3번
// k05_QueryTxt = "select * from stock where transaction_date = '20061006'";