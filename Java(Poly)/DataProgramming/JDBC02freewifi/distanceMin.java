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
//1��	//		"select * from freewifi where SQRT(POWER(latitude-%f,2) + POWER(longitude - %f,2)) = (select MIN(SQRT(POWER(latitude-%f,2) + POWER(longitude-%f,2)))from freewifi);",
		//		lat, lng, lat, lng);

//2��	//		QueryTxt = "select * from freewifi;";

//3��	//QueryTxt = "select * from freewifi where service_provider = 'SKT'";

		QueryTxt = "select * from freewifi where inst_country = '������'";
		ResultSet rset = stmt.executeQuery(QueryTxt);

		while (rset.next()) {
			System.out.printf("*********************���� ����� ��**********************\n");
			System.out.printf("��ȣ : %s\n", rset.getString(1));
			System.out.printf("��ġ��Ҹ� :%s\n", rset.getString(2));
			System.out.printf("��ġ��һ�    :%s\n", rset.getString(3));
			System.out.printf("��ġ�õ��� :%s\n", rset.getString(4));
			System.out.printf("��ġ�ñ�����    :%s\n", rset.getString(5));
			System.out.printf("��ġ�ü�����    :%s\n", rset.getString(6));
			System.out.printf("����������� :%s\n", rset.getString(7));
			System.out.printf("��������SSID :%s\n", rset.getString(8));
			System.out.printf("��ġ���  :%s\n", rset.getString(9));
			System.out.printf("���������θ��ּ� :%s\n", rset.getString(10));
			System.out.printf("�����������ּ� :%s\n", rset.getString(11));
			System.out.printf("��������� :%s\n", rset.getString(12));
			System.out.printf("���������ȭ��ȣ :%s\n", rset.getString(13));
			System.out.printf("���� :%s\n", rset.getString(14));
			System.out.printf("�浵 :%s\n", rset.getString(15));
			System.out.printf("�����ͱ������� :%s\n", rset.getString(16));
			System.out.printf("*****************************************************\n");
		}
		rset.close();
		stmt.close();
		conn.close();

	}
}