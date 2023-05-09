package JDBC02freewifi;

import java.sql.*;

public class Drop {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		stmt.execute("drop table freewifi;");
		
		
		stmt.close(); 
		conn.close(); 
	}

}


