package Example11;

public class example11 {

	public static void main(String[] args) {
		// float형 - 4바이트 32비트 , 7자리까지 표현
		// double형 - 8바이트 64비트, 16자리까지 표현
		float k05_f = 9.1234567f; // float형 변수 f = 9.1234567선언
		double k05_d = 9.1234567; // double형 변수 d = 9.1234567선언
		double k05_d2 = (double)k05_f; 
		// float형 변수 f를 double로 변환해 double형 변수 d2선언
		
		System.out.printf("f = %20.18f\n", k05_f);
		// float형은 7자리까지만 표현가능하기때문에 9.123456까지는 정확히 표현되지만 그이후는 반올림되서9.1234567 값을 저장한다.
		System.out.printf("d = %20.18f\n", k05_d);
		// double형은 16자리까지 표현가능하기 때문에 9.1234567이 저장되고 출력된다
		System.out.printf("d2 = %20.18f\n", k05_d2);
		// float형을 double형으로 변환시켰기때문에 7자리까지만 저장된 float형의 형태로 나타나게된다.
	}

}
