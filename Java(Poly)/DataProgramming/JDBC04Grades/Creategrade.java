package JDBC04Grades;

import java.sql.*;

public class Creategrade {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����
		k05_stmt.execute("create table grades(" + "studentid int not null primary key,"+ "name varchar(50),"
				+ "kor int," +"eng int,"+ "mat int)"
				+ "DEFAULT CHARSET=utf8;");
		// grades��� table�� (fieldname  ��������)�� �������� table ����
		
		k05_stmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		k05_conn.close(); // ������ �߻������ʱ� ���� �������
	}

}

