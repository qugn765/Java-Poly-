package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Domain.GongjiC;

public class GongjiCDaoImpl implements GongjiCDao{

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
				Querytxt = String.format("insert into gongji_comment(id, title, date, content,rootid,relevel,recnt,viewcnt) values('%s','%s','%s','%s','%s','%s','%s','%s');", 
						(i + 1), "테스트" + (i+1), 20230605, "테스트입니다",(i + 1),0,0,0);
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
	public List<GongjiC> Allview() throws SQLException, ClassNotFoundException {
		List<GongjiC> gongjiCList = new ArrayList<GongjiC>();
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select * from gongji_comment order by rootid desc, recnt asc"); // 명령어를 통해 나오는값을 rset에 저장
		while(rset.next()) {
			GongjiC gongjiC = new GongjiC();
			gongjiC.setId(rset.getInt(1));
			gongjiC.setTitle(rset.getString(2));
			gongjiC.setDate(rset.getString(3));
			gongjiC.setContent(rset.getString(4));
			gongjiC.setRootid(rset.getInt(5));
			gongjiC.setRelevel(rset.getInt(6));
			gongjiC.setRecnt(rset.getInt(7));
			gongjiC.setViewcnt(rset.getInt(8));
			
			gongjiCList.add(gongjiC);
		
		}
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return gongjiCList;
	}

	@Override
	public int count() throws ClassNotFoundException, SQLException {
		int count = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
		// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
		Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
		ResultSet rset = stmt.executeQuery("select count(*) from gongji_comment"); // 명령어를 통해 나오는값을 rset에 저장
		rset.next();
		count = rset.getInt(1);
		stmt.close(); // 에러가 발생하지않기 위해 객체닫기
		conn.close(); // 에러가 발생하지않기 위해 연결끊기
		return count;
	}

	@Override
	public GongjiC oneview(int id) throws ClassNotFoundException, SQLException {
		GongjiC gongjiC = new GongjiC();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			ResultSet rset = stmt.executeQuery("select * from gongji_comment where id =" + id); // 명령어를 통해 나오는값을 rset에 저장
			try{
				rset.next();
				gongjiC.setId(rset.getInt(1));
				gongjiC.setTitle(rset.getString(2));
				gongjiC.setDate(rset.getString(3));
				gongjiC.setContent(rset.getString(4));
				gongjiC.setRootid(rset.getInt(5));
				gongjiC.setRelevel(rset.getInt(6));
				gongjiC.setRecnt(rset.getInt(7));
				gongjiC.setViewcnt(rset.getInt(8));
	
			} catch(Exception e){
				gongjiC.setTitle("조회하신학번이없습니다");
				gongjiC.setId(0);
				gongjiC.setDate("0");
				gongjiC.setContent("0");
				gongjiC.setRootid(0);
				gongjiC.setRelevel(0);
				gongjiC.setRecnt(0);
				gongjiC.setViewcnt(0);
			}
			stmt.close(); // 에러가 발생하지않기 위해 객체닫기
			conn.close(); // 에러가 발생하지않기 위해 연결끊기
		}catch (Exception e) {
			gongjiC.setTitle("데이터베이스연결실패");
			gongjiC.setId(0);
			gongjiC.setDate("0");
			gongjiC.setContent("0");
			gongjiC.setRootid(0);
			gongjiC.setRelevel(0);
			gongjiC.setRecnt(0);
			gongjiC.setViewcnt(0);
		}
		return gongjiC;
	}

	@Override
	public int maxId() throws ClassNotFoundException, SQLException {
		int maxid = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			ResultSet rset = stmt.executeQuery("select Max(id) from gongji_comment"); // 명령어를 통해 나오는값을 rset에 저장
			rset.next();
			maxid = rset.getInt(1);
		}catch (Exception e) {
			maxid = 0;
		}
		return maxid;
	}

	@Override
	public int upadteWrite(int id, String title, String nowDate, String content, int rootid, int relevel, int recnt, int viewcnt) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("Update gongji_comment SET title='%s', date='%s', content='%s' WHERE id= '%s'",title,nowDate,content,id);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int newWrite(int id, String title, String nowDate, String content, int rootid, int relevel, int recnt, int viewcnt) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("insert into gongji_comment(id,title,date,content,rootid,relevel,recnt,viewcnt) values('%s','%s','%s','%s','%s','%s','%s','%s')", 
					id, title, nowDate, content, rootid, relevel, recnt, viewcnt);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int delete(int id, int relevel) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			if(relevel ==0) {
				Querytxt = String.format("delete from gongji_comment where rootid = '%s'", id);
			} else {
				Querytxt = String.format("Update gongji_comment SET content='삭제된 댓글입니다', title='삭제된 댓글입니다' WHERE id= '%s'",id);
			}
			System.out.println("id = "+ id + "      relevel = " + relevel);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int viewCntPlus(int id) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("Update gongji_comment SET viewcnt = (viewcnt+1) where id = '%s'",id);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}

	@Override
	public int recntPlus(int rootid, int relevel, int recnt) throws ClassNotFoundException, SQLException {
		int checkerror=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234");
			// JDBC드라이버를 이용해서 user와 password를 입력해 데이터베이스에 접근
			Statement stmt = conn.createStatement(); // JDBC에 입력할 객체를 생성
			String Querytxt = "";
			Querytxt = String.format("Update gongji_comment SET recnt = (recnt+1) where rootid = '%s' and recnt > '%s'", rootid, recnt);
			stmt.execute(Querytxt); // 명령어를 통해 나오는값을 rset에 저장
		} catch (Exception e) {
			checkerror=1;
		}
		
		return checkerror;
	}


}
