package JDBC01;

import java.sql.*;

public class jdbcPrint {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from examtable"); 
		while (rset.next()) { 
			System.out.print("이름 : " + rset.getString(1));
			System.out.print("\t학번 : " + rset.getString(2)); 
			System.out.print("\t국어 : " + rset.getString(3)); 
			System.out.print("\t영어 : " + rset.getString(4)); 
			System.out.println("\t수학 : " + rset.getString(5)); 
			
		} 
		rset.close(); 
		stmt.close(); 
		conn.close(); 


	}

}


