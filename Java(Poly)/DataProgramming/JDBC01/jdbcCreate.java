package JDBC01;

import java.sql.*;

public class jdbcCreate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		stmt.execute("create table examtable("+
				 "name varchar(20),"+
			     "studentid int not null primary key,"+
				 "kor int,"+
				 "eng int,"+
				 "mat int)"+
				 "DEFAULT CHARSET=utf8;");
		
		
		stmt.close(); 
		conn.close(); 
	}

}
