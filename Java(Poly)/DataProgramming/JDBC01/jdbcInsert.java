package JDBC01;

import java.sql.*;

public class jdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234");
		Statement stmt = conn.createStatement();
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('����',209901,95,100,95);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('����',209902,100,100,100);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('���',209903,100,90,100);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('�糪',209904,100,95,90);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('��ȿ',209905,80,100,70);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('�̳�',209906,95,90,95);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('����',209907,100,90,100);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('ä��',209908,100,75,90);");
		stmt.execute("insert into examtable(name,studentid,kor,eng,mat) values('����',209909,100,100,70);");
		
		
		stmt.close(); 
		conn.close(); 
	}

}
