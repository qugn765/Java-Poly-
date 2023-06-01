package kr.ac.kopo05.tupyo.dao;

import java.sql.SQLException;
import java.util.List;

import kr.ac.kopo05.tupyo.domain.AgeRate;
import kr.ac.kopo05.tupyo.domain.hubo;

public interface tupyoDao {
	List<hubo> selectAll() throws ClassNotFoundException, SQLException;
	
	int deletehubo(int number);
	
	int inserthubo(int number, String name);
	
	AgeRate selectOneRate(int number) throws ClassNotFoundException, SQLException;
	
	hubo selectOne(int number) throws ClassNotFoundException, SQLException;
	
	int inserttupyo(int huboNumber, int age);
	
	AgeRate tupyorate(int number);
	
	
	
}
