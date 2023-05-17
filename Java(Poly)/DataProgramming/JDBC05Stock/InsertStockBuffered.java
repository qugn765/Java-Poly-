
package JDBC05Stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertStockBuffered {

	private static final int k05_BATCH_SIZE = 100000;
	// 10000���� �޸𸮿� �����ؼ� �ѹ��� database�� �ֱ����� ��������

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://localhost/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		SimpleDateFormat k05_formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		// ���۽ð��� ������ �ð��� �����ϱ� ���� DateFormat ����
		File k05_f = new File("C:\\Users\\KBH\\Input\\StockDailyPriceRefine.csv"); // ������ �о����
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// �о�� ������ BufferedReader�� �б�
		String k05_readtxt; // ������ ���پ� ������ ���� ����

		Date k05_date_start = new Date(System.currentTimeMillis()); // ���۽ð� ����
		String k05_date_startdf = k05_formatter.format(k05_date_start); // ���۽ð��� DateFormat���·� ����

		if ((k05_readtxt = k05_br.readLine()) == null) {
			System.out.println("�������Դϴ�\n");
			return;
		}
		// ���� �ҷ��������� ù���� �о����� *���̶�� �������Դϴٸ� ����ϸ鼭 ����

		int k05_lineCnt = 1;  // Line�� ������ ���� ����
		int k05_batchCnt = 0; // 10000���� �޸𸮿� �����ؼ� �ѹ��� database�� �ֱ����� ��������

		String error_area = "";
		String error_message = "";


	

		k05_conn.setAutoCommit(false); // disable auto-commit
		String k05_Query = "insert into stock(Stockcode,transaction_date,open_price,high_price,"
				+ "low_price,close_price,trading_volume,trading_amount) values(?,?,?,?,?,?,?,?);";
		PreparedStatement k05_pstmt = k05_conn.prepareStatement(k05_Query);
		// JDBC�� �Է��� PreparedStatement ��ü�� ����

		while ((k05_readtxt = k05_br.readLine()) != null) { // ���پ� �о���鼭 ���� ������������ �ݺ�
			String[] k05_field = k05_readtxt.split(",");
			// field������ csv�� �����Ա� ������ ,������ �迭�� ����
			//String k05_dateyear = k05_field[1].substring(0, 4);
			//String k05_datemonth = k05_field[1].substring(4, 6);
			//String k05_dateday = k05_field[1].substring(6, 8);
			//String k05_date = k05_dateyear + "-" + k05_datemonth + "-" + k05_dateday;
			// mysql�� date�������� ��ȯ�ϱ����ؼ� 20230509 �̷������� �� date��
			// 2023-05-09�������� ��ȯ

			k05_pstmt.setString(1, k05_field[0]);
			k05_pstmt.setString(2, k05_field[1]);
			k05_pstmt.setString(3, k05_field[2]);
			k05_pstmt.setString(4, k05_field[3]);
			k05_pstmt.setString(5, k05_field[4]);
			k05_pstmt.setString(6, k05_field[5]);
			k05_pstmt.setString(7, k05_field[6]);
			k05_pstmt.setString(8, k05_field[7]);
			// PreparedStatement��ü�� ?������ ������� ä����
			k05_pstmt.addBatch(); // ����pstmt�� batch�� �߰�
			k05_pstmt.clearParameters();
			++k05_batchCnt;

			if (k05_batchCnt % k05_BATCH_SIZE == 0) {
				try{
					k05_pstmt.executeBatch();
					k05_pstmt.clearBatch();
					k05_conn.commit();
					System.out.printf("%d-%d��° �׸� Insert OK\n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt);
				} catch(Exception e){
					error_area = error_area + (k05_lineCnt - k05_BATCH_SIZE + 1) + " ~ "  + k05_lineCnt + "��° �׸�     ";
					error_message = error_message + e + "         ";
					System.out.printf("%d-%d��° �׸� error \n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt);
					System.out.println(error_message);
				}
			}
			// batch�� 10000���϶� database�� ������ ��ŭ �������� ���

			k05_lineCnt++;// ������ �����Ҷ����� 1���߰�
		}


		if (k05_batchCnt % k05_BATCH_SIZE != 0) {
			try{
				k05_pstmt.executeBatch();
				k05_pstmt.clearBatch();
				k05_conn.commit();
				System.out.printf("%d-%d��° �׸� Insert OK\n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt); 
			} catch(Exception e){
				error_area = error_area + (k05_lineCnt - k05_BATCH_SIZE + 1) + " ~ "  + k05_lineCnt + "��° �׸�     ";
				error_message = error_message + e + "         ";
				System.out.printf("%d-%d��° �׸� error \n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt);
			}
		}
		// batch�� 10000���� �����߱� ������ ���� ������ ����

		k05_conn.setAutoCommit(true);

		Date date_end = new Date(System.currentTimeMillis()); // �������� �����ð� ����
		String date_enddf = k05_formatter.format(date_end); // �����ð��� DateFormat�� �°� ����
		System.out.println("���۽ð� : " + k05_date_startdf);
		System.out.println("�����ð� : " + date_enddf);
		System.out.println("ó������ : " + (k05_lineCnt - 1));
		System.out.println("�����߻����� : " + error_area);
		System.out.println("�����޼���" + error_message);
		// ���۽ð�, �����ð�, ó���� ���� ���

		k05_br.close();	// BufferedReader�ݱ�
		k05_pstmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		k05_conn.close(); // ������ �߻������ʱ� ���� ������� 
	}
}
