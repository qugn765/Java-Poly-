package JDBC02freewifi;

import java.io.*;
import java.sql.*;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		File f = new File("C:\\Users\\KBH\\Input\\전국무료와이파이표준데이터Refine.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String readtxt;

		if((readtxt = br.readLine()) == null) {
			System.out.println("빈파일입니다\n");
			return;
		}
		int Linecnt = 1;
		while((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			String QueryTxt = "";
			QueryTxt = String.format("insert into freewifi(" + "id,"
					+ "inst_place, inst_place_detail, inst_city, inst_country, inst_place_flag,"
					+ "service_provider, wifi_ssid, inst_date, place_addr_road, place_addr_land,"
					+ "manage_office, manage_office_phone, latitude,longitude, write_date)"
					+ "values("
					+"'%s','%s','%s','%s','%s',"
					+"'%s','%s','%s','%s','%s',"
					+"'%s','%s','%s',%s,%s,'%s');",
					field[0],field[1],field[2],field[3],field[4],
					field[5],field[6],field[7],field[8],field[9],
					field[10],field[11],field[12],field[13],field[14],field[15]);
			stmt.execute(QueryTxt);

			System.out.printf("%d번째 항목 Insert OK [%s]\n", Linecnt, QueryTxt);
			Linecnt++;

		}	
		br.close();
		stmt.close(); 
		conn.close(); 
	}
}


