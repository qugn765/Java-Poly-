package PlayLand;

public class ConstValueClass {
	// 권종별 가격
	public final int BABY_PRICE = 0,
			 ADULT_DAY_PRICE = 56000, ADULT_NIGHT_PRICE = 46000,
			 TEEN_DAY_PRICE = 47000, TEEN_NIGHT_PRICE = 40000,
			 CHILD_DAY_PRICE = 44000, CHILD_NIGHT_PRICE = 37000,
			 OLD_DAY_PRICE = 44000, OLD_NIGHT_PRICE = 37000;
	// 주민등록번호 분석
	public final long FULL_DIGIT = 1000000000,
						FULL_DIGIT_MIN = 1000000000, 
						SEVEN_DIGIT = 1000000;
	public final int TWO_DIGIT = 100, ONE_DIGIT = 10,
			 OLD_GENERATION = 1900, NEW_GENERATION = 2000,
			 MALE_OLD = 1, FEMALE_OLD = 2, MALE_NEW = 3, FEMALE_NEW = 4,
			 BEFORE_BIRTH = 2, AFTER_BIRTH = 1;
	
	// 나이에 따른 범위
	public final int MIN_BABY = 1, MIN_CHILD = 3, MIN_TEEN = 13, MIN_ADULT = 19,
			 MAX_CHILD = 12, MAX_TEEN = 18, MAX_ADULT = 64;
	// 나이에 따른 그룹
	public final int BABY = 1, CHILD = 2, TEEN = 3, ADULT = 4, OLD = 5;
	// 할인율
	public final float DISABLE_DISCOUNT_RATE = 0.6f, MERIT_DISCOUNT_RATE = 0.5f,
				MULTICHILD_DISCOUNT_RATE = 0.8f,
	PREGNANT_DISCOUNT_RATE = 0.85f;
	// 최대 주문량
	public final int MAX_COUNT = 10, MIN_COUNT = 1;


}
