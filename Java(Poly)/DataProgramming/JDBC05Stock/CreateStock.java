package JDBC05Stock;

import java.sql.*;

public class CreateStock {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성
		
		
		// 단축코드, 일자, 	              시가,         고가,       저가,      종가,         거래량,          거래대금
		// code,     transaction_date, open_price, high_price, low_pricㄴe, close_price, trading_volume, trading_amount
		// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]
		k05_stmt.execute("create table stock(Stockcode varchar(50) not null,transaction_date int not null, open_price int, high_price int, low_price int,"
				+ "close_price int," + "trading_volume int," + "trading_amount bigint, primary key(Stockcode, transaction_date)) DEFAULT CHARSET=utf8;");
		// stock이라는 table을 (fieldname  저장형태)의 형식으로 table 생성
		
		
		k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기
	}

}

