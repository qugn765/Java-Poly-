package JDBC05Stock;

import java.sql.*;

public class CreateStock {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����
		
		
		// �����ڵ�, ����, 	              �ð�,         ��,       ����,      ����,         �ŷ���,          �ŷ����
		// code,     transaction_date, open_price, high_price, low_pric��e, close_price, trading_volume, trading_amount
		// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]
		k05_stmt.execute("create table stock(Stockcode varchar(50) not null,transaction_date int not null, open_price int, high_price int, low_price int,"
				+ "close_price int," + "trading_volume int," + "trading_amount bigint, primary key(Stockcode, transaction_date)) DEFAULT CHARSET=utf8;");
		// stock�̶�� table�� (fieldname  ��������)�� �������� table ����
		
		
		k05_stmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		k05_conn.close(); // ������ �߻������ʱ� ���� �������
	}

}

