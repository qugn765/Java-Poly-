package JDBC05Stock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����

		String k05_QueryTxt;// mysql�� ��ɾ �Է��ϱ����� ���� ����

		k05_QueryTxt = "select count(*) from stock";
		//installation_purpose ���� ��Ȱ����� data ���
		ResultSet k05_rset = k05_stmt.executeQuery(k05_QueryTxt);
		// ��ɾ �Է����� �� ������ ���� rset�� ����
		int k05_cnt = 1;
		while (k05_rset.next()) { // rset�� ����� ������ �ϳ��� �ѱ�鼭 �ݺ�
			System.out.println(k05_rset.getString(1));
		}
		k05_rset.close(); // ��ü�ݱ�
		k05_stmt.close(); // ��ü�ݱ�
		k05_conn.close(); // ��ü�ݱ�

	}
}



// �����ڵ�, ����, 	              �ð�,         ��,       ����,      ����,         �ŷ���,          �ŷ����
// code,     transaction_date, open_price, high_price, low_pric��e, close_price, trading_volume, trading_amount
// field[0],  field[1]			field[4]    field[5]    field[6]     field[3]	   field[11]	  field[12]

//1��
// k05_QueryTxt = "select count(*) from stock";

// 2��
// k05_QueryTxt = "select * from stock where Stockcode = 'A005930'";

/*
			System.out.printf("*********************************************************\n");
			System.out.printf("�������� ���� �����ڵ� : %s\n", k05_rset.getString(1));
			System.out.printf("�ֽ� ���� ����         : %s\n", k05_rset.getString(2));
			System.out.printf("�ð�                   : %s\n", k05_rset.getString(3));
			System.out.printf("��                   : %s\n", k05_rset.getString(4));
			System.out.printf("����                   : %s\n", k05_rset.getString(5));
			System.out.printf("����                   : %s\n", k05_rset.getString(6));
			System.out.printf("�ŷ���                 : %s\n", k05_rset.getString(7));
			System.out.printf("�ŷ����               : %s\n", k05_rset.getString(8));
			System.out.println("��°���              : " + k05_cnt);
			k05_cnt++;
*/
// 3��
// k05_QueryTxt = "select * from stock where transaction_date = '20061006'";