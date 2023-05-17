
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
	// 10000개씩 메모리에 저장해서 한번에 database에 넣기위해 변수선언

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://localhost/kopo05", "root" , "1234"); 
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		SimpleDateFormat k05_formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
		// 시작시간과 끝나는 시간을 저장하기 위해 DateFormat 지정
		File k05_f = new File("C:\\Users\\KBH\\Input\\StockDailyPriceRefine.csv"); // 파일을 읽어오기
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// 읽어온 파일을 BufferedReader로 읽기
		String k05_readtxt; // 파일을 한줄씩 저장할 변수 선언

		Date k05_date_start = new Date(System.currentTimeMillis()); // 시작시간 선언
		String k05_date_startdf = k05_formatter.format(k05_date_start); // 시작시간을 DateFormat형태로 저장

		if ((k05_readtxt = k05_br.readLine()) == null) {
			System.out.println("빈파일입니다\n");
			return;
		}
		// 만약 불러온파일의 첫줄을 읽었을때 *빈값이라면 빈파일입니다를 출력하면서 종료

		int k05_lineCnt = 1;  // Line을 세어줄 변수 선언
		int k05_batchCnt = 0; // 10000개씩 메모리에 저장해서 한번에 database에 넣기위해 변수선언

		String error_area = "";
		String error_message = "";


	

		k05_conn.setAutoCommit(false); // disable auto-commit
		String k05_Query = "insert into stock(Stockcode,transaction_date,open_price,high_price,"
				+ "low_price,close_price,trading_volume,trading_amount) values(?,?,?,?,?,?,?,?);";
		PreparedStatement k05_pstmt = k05_conn.prepareStatement(k05_Query);
		// JDBC에 입력할 PreparedStatement 객체를 생성

		while ((k05_readtxt = k05_br.readLine()) != null) { // 한줄씩 읽어오면서 빈값이 나오기전까지 반복
			String[] k05_field = k05_readtxt.split(",");
			// field값들을 csv로 가져왔기 때문에 ,단위로 배열에 저장
			//String k05_dateyear = k05_field[1].substring(0, 4);
			//String k05_datemonth = k05_field[1].substring(4, 6);
			//String k05_dateday = k05_field[1].substring(6, 8);
			//String k05_date = k05_dateyear + "-" + k05_datemonth + "-" + k05_dateday;
			// mysql의 date형식으로 변환하기위해서 20230509 이런식으로 된 date를
			// 2023-05-09형식으로 변환

			k05_pstmt.setString(1, k05_field[0]);
			k05_pstmt.setString(2, k05_field[1]);
			k05_pstmt.setString(3, k05_field[2]);
			k05_pstmt.setString(4, k05_field[3]);
			k05_pstmt.setString(5, k05_field[4]);
			k05_pstmt.setString(6, k05_field[5]);
			k05_pstmt.setString(7, k05_field[6]);
			k05_pstmt.setString(8, k05_field[7]);
			// PreparedStatement객체에 ?값들을 순서대로 채워줌
			k05_pstmt.addBatch(); // 만든pstmt를 batch에 추가
			k05_pstmt.clearParameters();
			++k05_batchCnt;

			if (k05_batchCnt % k05_BATCH_SIZE == 0) {
				try{
					k05_pstmt.executeBatch();
					k05_pstmt.clearBatch();
					k05_conn.commit();
					System.out.printf("%d-%d번째 항목 Insert OK\n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt);
				} catch(Exception e){
					error_area = error_area + (k05_lineCnt - k05_BATCH_SIZE + 1) + " ~ "  + k05_lineCnt + "번째 항목     ";
					error_message = error_message + e + "         ";
					System.out.printf("%d-%d번째 항목 error \n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt);
					System.out.println(error_message);
				}
			}
			// batch가 10000개일때 database에 저장후 얼만큼 저장한지 출력

			k05_lineCnt++;// 한줄을 저장할때마다 1씩추가
		}


		if (k05_batchCnt % k05_BATCH_SIZE != 0) {
			try{
				k05_pstmt.executeBatch();
				k05_pstmt.clearBatch();
				k05_conn.commit();
				System.out.printf("%d-%d번째 항목 Insert OK\n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt); 
			} catch(Exception e){
				error_area = error_area + (k05_lineCnt - k05_BATCH_SIZE + 1) + " ~ "  + k05_lineCnt + "번째 항목     ";
				error_message = error_message + e + "         ";
				System.out.printf("%d-%d번째 항목 error \n", k05_lineCnt - k05_BATCH_SIZE + 1, k05_lineCnt);
			}
		}
		// batch가 10000개씩 저장했기 때문에 남은 값들을 저장

		k05_conn.setAutoCommit(true);

		Date date_end = new Date(System.currentTimeMillis()); // 끝났을때 끝난시간 저장
		String date_enddf = k05_formatter.format(date_end); // 끝난시간을 DateFormat에 맞게 저장
		System.out.println("시작시간 : " + k05_date_startdf);
		System.out.println("끝난시간 : " + date_enddf);
		System.out.println("처리개수 : " + (k05_lineCnt - 1));
		System.out.println("에러발생구역 : " + error_area);
		System.out.println("에러메세지" + error_message);
		// 시작시간, 끝난시간, 처리한 개수 출력

		k05_br.close();	// BufferedReader닫기
		k05_pstmt.close(); // 에러가 발생하지않기 위해 객체닫기
		k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기 
	}
}
