package JDBC05Stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropStock {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����
		
		k05_stmt.execute("drop table stock;");	
		// drop table tablename ��ɾ ���ؼ� table��ü�� ����
		// table��ü�� �����ϱ⶧���� data�� ���̻���
		
		k05_stmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		k05_conn.close(); // ������ �߻������ʱ� ���� ������� 
	}

}