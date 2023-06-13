package Service;

import java.sql.SQLException;
import java.time.LocalDate;

import Dto.Pagination;


public interface Service {


	public Pagination getPagination(int page, int countPerPage) throws ClassNotFoundException, SQLException;
	
	LocalDate nowTime();
}
