package JDBC05Stock;


import java.sql.*;

public class DeleteStock {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:33060/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����
		
		k05_stmt.execute("delete from stock;"); 
		// delete from tablename ��ɾ ���ؼ� table�� data����
		
		
		k05_stmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		k05_conn.close(); // ������ �߻������ʱ� ���� �������  
	}

}


