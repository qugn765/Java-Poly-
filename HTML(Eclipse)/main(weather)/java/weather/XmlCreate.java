package weather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class XmlCreate {

	String url = "jdbc:mysql://192.168.23.54:3306/kopo05";
	String user = "root";
	String pw = "1234";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rset;
	private Statement stmt;

	// =====================================================================================================

	// 총 득표한 수
	public List<StudentItem> selectAll() {
		List<StudentItem> studentItemList = new ArrayList<>();
		int num = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pw);
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from student_grade");
			while (rset.next()) {
				StudentItem studentItem = new StudentItem();
				studentItem.setStudentId(rset.getInt(1));
				studentItem.setName(rset.getString(2));
				studentItem.setKor(rset.getInt(3));
				studentItem.setEng(rset.getInt(4));
				studentItem.setMat(rset.getInt(5));
				studentItemList.add(studentItem);
			}
			stmt.close();
			conn.close();
			rset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentItemList;
	}

}