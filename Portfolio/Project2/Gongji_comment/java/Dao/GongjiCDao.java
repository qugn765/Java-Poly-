package Dao;

import java.sql.SQLException;
import java.util.List;

import Domain.GongjiC;

public interface GongjiCDao {
	
	int makedata();
	
	List<GongjiC> Allview() throws SQLException, ClassNotFoundException;
	
	int count() throws ClassNotFoundException, SQLException;
	
	GongjiC oneview(int id) throws ClassNotFoundException, SQLException;
	
	int maxId() throws ClassNotFoundException, SQLException;
	
	int upadteWrite(int id, String title, String nowDate, String content, int rootid, int relevel, int recnt, int viewcnt) throws ClassNotFoundException, SQLException;
	
	int newWrite(int id, String title, String nowDate, String content, int rootid, int relevel, int recnt, int viewcnt) throws ClassNotFoundException, SQLException;
	
	int delete(int id, int relevel) throws ClassNotFoundException, SQLException;
	
	int viewCntPlus(int id) throws ClassNotFoundException, SQLException;
	
	int recntPlus(int rootid, int relevel, int recnt) throws ClassNotFoundException, SQLException;
}
