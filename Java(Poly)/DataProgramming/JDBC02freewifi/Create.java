package JDBC02freewifi;

import java.sql.*;

public class Create {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		stmt.execute("create table freewifi(" + "id int not null primary key,"+ "inst_place varchar(50)," + "inst_place_detail varchar(200),"
		        + "inst_city varchar(50), " + "inst_country varchar(50)," + "inst_place_flag varchar(50),"
		        + "service_provider varchar(50)," + "wifi_ssid varchar(200)," + "inst_date date,"
		        + "place_addr_road varchar(200)," + "place_addr_land varchar(200)," + "manage_office varchar(50),"
		        + "manage_office_phone varchar(50)," + "latitude double," + "longitude double," + "write_date date)"
		        + "DEFAULT CHARSET=utf8;");
		
		
		stmt.close(); 
		conn.close(); 
	}

}


