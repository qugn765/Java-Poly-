package Example01;

public class example1 {

	public static void main(String[] args) {
		int k05_year = 0; // 변수 year 선언
		int k05_age = 29; // 변수 age 29으로 선언
		
		System.out.println("결과 1 : " + k05_year);  // year 출력
		System.out.println("결과 2 : " + k05_age);  // age 출력
		
		k05_year = k05_age + 1995 -1; // year 계산식 태어난년도 + 나이 -1
		k05_age = k05_age + 1; // age 변수에 1추가
		System.out.println("결과 3 : " + k05_year); // 계산한 year 출력
		System.out.println("결과 4 : " + k05_age); // 계산한 age 출력

	}

}
