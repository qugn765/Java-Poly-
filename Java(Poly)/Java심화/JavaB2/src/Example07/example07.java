package Example07;

public class example07 {

	public static void main(String[] args) {
		String k05_url = "www.codechobo.com"; // 문자열 url선언
		
		float k05_f1 = .10f; // float 0.1선언 float라 뒤에f붙이기
		float k05_f2 = 1e1f; // float 10.0 l.0e1 선언 float라 뒤에 f붙이기
		float k05_f3 = 3.14e3f; // float 3140.0 3.14e3 선언 float라 뒤에 f붙이기
		double k05_d = 1.23456789; // double 1.23456789선언

		System.out.printf("f1 = %f, %e, %g\n", k05_f1, k05_f1, k05_f1); 
		// f1을 소수점표현방식, 지수표현방식, 길이에따라 소수점or지수표현방식으로 바뀌는 %g 3개방식으로 출력
		System.out.printf("f1 = %f, %e, %g\n", k05_f2, k05_f2, k05_f2);
		// f2을 소수점표현방식, 지수표현방식, 길이에따라 소수점or지수표현방식으로 바뀌는 %g 3개방식으로 출력
		System.out.printf("f1 = %f, %e, %g\n", k05_f3, k05_f3, k05_f3);
		// f3을 소수점표현방식, 지수표현방식, 길이에따라 소수점or지수표현방식으로 바뀌는 %g 3개방식으로 출력
		
		System.out.printf("d = %f\n", k05_d);  // double d를 소수점 표현방식으로 출력
		System.out.printf("d = %14.10f\n", k05_d); // double d를 %전체는 14자리 소수점이하는 10자리로 출력

		System.out.printf("url = [%s]\n", k05_url); // url을 []안에 출력
		System.out.printf("url = [%20s]\n", k05_url); // url을 []20칸짜리를 만들어 오른쪽 정렬 출력
		System.out.printf("url = [%-20s]\n", k05_url); // url을 []20칸짜리를 만들어 왼쪽 정렬 출력
		System.out.printf("url = [%.8s]\n", k05_url); // url을 8자리만 [] 안에 출력
	
	}

}
