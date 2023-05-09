package JDBC01;

import java.sql.*;

public class jdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('나연',209901,95,100,95);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('정연',209902,100,100,100);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('모모',209903,100,90,100);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('사나',209904,100,95,90);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('지효',209905,80,100,70);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('미나',209906,95,90,95);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('다현',209907,100,90,100);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('채영',209908,100,75,90);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('쯔위',209909,100,100,70);");
		
		
		stmt.close(); 
		conn.close(); 
	}

}
