package PlayLand;

import java.util.Calendar;

public class ageCalc {
	private ConstValueClass constant = new ConstValueClass();

	public int calcAge(String personNumber){
		int personNumberfirst = Integer.parseInt(personNumber.substring(0,6));
		int personGen = Integer.parseInt(personNumber.substring(6,7));
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int age;
		int birthYear = personNumberfirst / 10000;
		int birthMonth = (personNumberfirst / 100) % 100;
		int birthDay = personNumberfirst % 100;
		if(personGen == 1 || personGen ==2 || personGen == 5 || personGen == 6){
			birthYear = birthYear + 1900;
		} else{
			birthYear = birthYear + 2000;
		}
		age = (year - birthYear - 1);
		if(birthMonth <= month && birthDay <= day){
			age = age + 1;
		}
		return age;
	}
	
	
	public int calcAgeGroup(int age){
		int ageGroup;
		if(0 <= age && age < constant.MIN_CHILD) ageGroup = 1;
		else if (age < constant.MIN_TEEN) ageGroup = 2;
		else if (age < constant.MIN_ADULT) ageGroup = 3;
		else if (age <= constant.MAX_ADULT) ageGroup = 4;
		else ageGroup = 5;
		
		return ageGroup;
	}
}
