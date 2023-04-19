package Example07;

public class example07a {

	public static void main(String[] args) {
		k05_Cal cc = new k05_Cal(); // 객체생성
		int k05_korean = 100;
		int k05_eng = 90;
		int k05_math = 95;
		int k05_sci = 92;
		int k05_soc = 89;
		// 국어 영어 수학 과학 사회점수 순서대로 선언
		System.out.printf("3월 성적표\n");
		System.out.printf("========================================================\n");
		System.out.printf("이름      국어   영어   수학  총점   평균\n");
		System.out.printf("========================================================\n");
		System.out.printf("폴리융    %-7s%-7s%-7s%-7s%-7s\n\n", 
				k05_korean, k05_eng, k05_math, cc.k05_sum(k05_korean, k05_eng, k05_math), cc.k05_ave(k05_korean, k05_eng, k05_math));
		//3월 성적표 출력 Cal클래서에서 변수3개넣은 sum과 ave 사용
		
		System.out.printf("4월 성적표\n");
		System.out.printf("========================================================\n");
		System.out.printf("이름      국어   영어   수학  과학   총점   평균\n");
		System.out.printf("========================================================\n");
		System.out.printf("폴리융    %-7s%-7s%-7s%-7s%-7s%-7s\n\n", 
				k05_korean, k05_eng, k05_math, k05_sci, cc.k05_sum(k05_korean, k05_eng, k05_math,k05_sci), cc.k05_ave(k05_korean, k05_eng, k05_math,k05_sci));
		//4월 성적표 출력 Cal클래서에서 변수4개넣은 sum과 ave 사용
		
		System.out.printf("5월 성적표\n");
		System.out.printf("========================================================\n");
		System.out.printf("이름      국어   영어   수학  과학   사회   총점   평균\n");
		System.out.printf("========================================================\n");
		System.out.printf("폴리융    %-7s%-7s%-7s%-7s%-7s%-7s%-7s\n\n", 
				k05_korean, k05_eng, k05_math, k05_sci, k05_soc, cc.k05_sum(k05_korean, k05_eng, k05_math, k05_sci, k05_soc), cc.k05_ave(k05_korean, k05_eng, k05_math, k05_sci, k05_soc));
		//5월 성적표 출력 Cal클래서에서 변수5개넣은 sum과 ave 사용
		
	}

}
