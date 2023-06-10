package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Domain.Gongji;

public class GongjiDaoImpl implements GongjiDao{

	@Override
	public int makedata() {
		int checkerror = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement k05_stmt = k05_conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			for(int i = 0; i < 20; i++) {
				Querytxt = String.format("insert into gongji(id, title, date, content) values('%s','%s','%s','%s');", (i + 1), "테스트" + (i+1), 20230605, "테스트입니다");
				k05_stmt.execute(Querytxt);
				// grades라는 table을 (fieldname  저장형태)의 형식으로 table 생성
			}
			k05_stmt.close(); // 에러가 발생하지않기 위해 객체닫기
			k05_conn.close(); // 에러가 발생하지않기 위해 연결끊기
		} catch (Exception e) {
			checkerror = 1;
		}

		return checkerror;
	}

	@Override
	public List<Gongji> Allview() throws SQLException, ClassNotFoundException {
		List<Gongji> gongjiList = new ArrayList<Gongji>();
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select * from gongji"); // 명령어를 통해 나오는값을 rset에 저장
		while(rset.next()) {
			Gongji gongji = new Gongji();
			gongji.setId(rset.getInt(1));
			gongji.setTitle(rset.getString(2));
			gongji.setDate(rset.getString(3));
			gongji.setContent(rset.getString(4));
			gongjiList.add(gongji);
		}
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return gongjiList;
	}

	@Override
	public int count() throws ClassNotFoundException, SQLException {
		int count = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select count(*) from gongji"); // 명령어를 통해 나오는값을 rset에 저장
		rset.next();
		count = rset.getInt(1);
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return count;
	}

	@Override
	public Gongji oneview(int id) throws ClassNotFoundException, SQLException {
		Gongji gongji = new Gongji();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			ResultSet rset = stmt.executeQuery("select * from gongji where id =" + id); // 명령어를 통해 나오는값을 rset에 저장
			try{
				rset.next();
				gongji.setId(rset.getInt(1));
				gongji.setTitle(rset.getString(2));
				gongji.setDate(rset.getString(3));
				gongji.setContent(rset.getString(4));
	
			} catch(Exception e){
				gongji.setTitle("조회하신학번이없습니다");
				gongji.setId(0);
				gongji.setDate("0");
				gongji.setContent("0");
			}
			stmt.close(); // 에러가 발생하지않기 위해 객체닫기
			conn.close(); // 에러가 발생하지않기 위해 연결끊기
		}catch (Exception e) {
			gongji.setTitle("데이터베이스연결실패");
			gongji.setId(0);
			gongji.setDate("0");
			gongji.setContent("0");
		}
		return gongji;
	}

	@Override
	public int maxId() throws ClassNotFoundException, SQLException {
		int maxid = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			ResultSet rset = stmt.executeQuery("select Max(id) from gongji"); // 명령어를 통해 나오는값을 rset에 저장
			rset.next();
			maxid = rset.getInt(1);
		}catch (Exception e) {
			maxid = 0;
		}
		return maxid;
	}

	@Override
	public int upadteWrite(int id, String title, String nowDate, String content) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("Update gongji SET title='%s', date='%s', content='%s' WHERE id= '%s'",title,nowDate,content,id);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int newWrite(int id, String title, String nowDate, String content) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("insert into gongji(id,title,date,content) values('%s','%s','%s','%s')", id, title, nowDate, content);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("delete from gongji where id = '%s'",id);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}



}
