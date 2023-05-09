package JDBC03cctv;

import java.sql.*;

public class CreateDatacctv {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		stmt.execute("create table cctv(" + "id int not null primary key,"+ "manage_office varchar(50),"
				+ "place_addr_road varchar(200)," +"place_addr_land varchar(200),"+ "installation_purpose varchar(50),"
				+ "number_camera varchar(50)," + "pixel_camer varchar(50)," + "shooting_area varchar(50)," + "storage_days varchar(50),"
				+ "inst_date date," + "manage_office_phone varchar(50)," +"latitude double," + "longitude double," + "write_date date)"
				+ "DEFAULT CHARSET=utf8;");
		stmt.close(); 
		conn.close(); 
	}

}


