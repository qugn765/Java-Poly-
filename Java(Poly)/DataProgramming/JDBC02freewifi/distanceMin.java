package JDBC02freewifi;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class distanceMin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root", "1234");
		Statement stmt = conn.createStatement();

		double lat = 37.3860521, lng = 127.1214038;

		String QueryTxt;
		//QueryTxt = String.format(
//1번	//		"select * from freewifi where SQRT(POWER(latitude-%f,2) + POWER(longitude - %f,2)) = (select MIN(SQRT(POWER(latitude-%f,2) + POWER(longitude-%f,2)))from freewifi);",
		//		lat, lng, lat, lng);

//2번	//		QueryTxt = "select * from freewifi;";

//3번	//QueryTxt = "select * from freewifi where service_provider = 'SKT'";

		QueryTxt = "select * from freewifi where inst_country = '수원시'";
		ResultSet rset = stmt.executeQuery(QueryTxt);

		while (rset.next()) {
			System.out.printf("*********************제일 가까운 곳**********************\n");
			System.out.printf("번호 : %s\n", rset.getString(1));
			System.out.printf("설치장소명 :%s\n", rset.getString(2));
			System.out.printf("설치장소상세    :%s\n", rset.getString(3));
			System.out.printf("설치시도명 :%s\n", rset.getString(4));
			System.out.printf("설치시군구명    :%s\n", rset.getString(5));
			System.out.printf("설치시설구분    :%s\n", rset.getString(6));
			System.out.printf("서비스제공사명 :%s\n", rset.getString(7));
			System.out.printf("와이파이SSID :%s\n", rset.getString(8));
			System.out.printf("설치년월  :%s\n", rset.getString(9));
			System.out.printf("소재지도로명주소 :%s\n", rset.getString(10));
			System.out.printf("소재지지번주소 :%s\n", rset.getString(11));
			System.out.printf("관리기관명 :%s\n", rset.getString(12));
			System.out.printf("관리기관전화번호 :%s\n", rset.getString(13));
			System.out.printf("위도 :%s\n", rset.getString(14));
			System.out.printf("경도 :%s\n", rset.getString(15));
			System.out.printf("데이터기준일자 :%s\n", rset.getString(16));
			System.out.printf("*****************************************************\n");
		}
		rset.close();
		stmt.close();
		conn.close();

	}
}