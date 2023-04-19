package Example01;

public class ex01 {

	public static void main(String[] args) {
		// #1. 연산후 대입, 사칙연산의 순서
		int k05_i;  // k05_i 변수 선언
		k05_i = 1 + 2;  // 1+2 계산 대입
		System.out.printf("#1-1 : %d\n", k05_i);  // 10진수로 k05_i 출력
		k05_i = 1 + 2 * 3;   // 1 + 2 * 3 계산 대입
		System.out.printf("#1-2 : %d\n", k05_i); // 10진수로 k05_i 출력
		
		

		System.out.println();
		// #2. 누적하기, 합구하기
		int k05_sum; // k05_sum int 변수 선언
		k05_sum = 0; // 0으로 초기화
		
		for (int k05_j = 1; k05_j < 101; k05_j++) {
			k05_sum = k05_sum + k05_j;
		} // k05_sum에 1부터 100까지 더하는 반복문
		
		System.out.printf("#2-1 : %d\n", k05_sum); // 10진수로 k05_sum 합계출력
		System.out.printf("#2-2 : %d\n", k05_sum / 100); 
		// 10진수로 k05_sum의 평균출력(1~100까지 더한평균) 평균은 50.5지만 int형으로 선언해서 50이 출력

		int [] k05_v = {1, 2, 3, 4, 5}; // k05_v라는 배열에 초기값 {1,2,3,4,5} 선언
		int k05_vsum; // k05_vsum 이라는 int 변수 선언
		k05_vsum = 0; // k05_vsum = 0 으로 초기화
		
		for (int k05_k = 0; k05_k < 5; k05_k++) {
			k05_vsum = k05_vsum + k05_v[k05_k];
		} // k05_vsum에 k05_v 배열의 값들을 다 더해주는 반복문
		
		System.out.printf("#2-3 : %d\n", k05_vsum); // k05_vsum 10진수로 출력
		System.out.printf("#2-3 : %d\n", k05_vsum / 5); // k05_v의 평균을 10진수로 출력
		
		
		
		System.out.println();
		// #3. 정수형 변수의 나눗셈은 정수범위에서버림처리
		int k05_ii = 1000 /3 ;  // 1000/3 하면 333.33..이지만 int형이기때문에 333이다.
		System.out.printf("#3-1 : %d\n", k05_ii); // 10진수로 k05_ii 출력
		
		k05_ii = 1000 % 3;  // 1000을 3으로나눈 나머지를 구하는 계산식
		System.out.printf("#3-2 : %d\n", k05_ii); // 10진수로 k05_ii 출력
		
		//나머지 연산자 응용
		for (int k05_a = 0; k05_a < 20; k05_a++) { 
			System.out.printf("#3-3 : %d\t",k05_a); // 10진수로 k05_ii 출력하고 \t 를 통해 Tab처리
		
			if ((k05_a + 1)%5 == 0) {
				System.out.printf("\n");
			} // k05_a + 1의 나머지가 0일때 줄내림, k05_a 가 4, 9, 14, 19일때 줄내림
		} // k05_a가 0부터 19까지 반복하는 반복문
		
		
		
		System.out.println();
		// # 4. 원하는 자릿수 반올림, 버림처리 
		k05_ii = 12345;  // k05_ii를 12345로 선언
		int k05_jj = (k05_ii / 10) * 10; // k05_jj에 int형 연산
		System.out.printf("#4-1 : %d\n", k05_jj); // 10진수로 k05_jj 출력
		
		k05_ii = 12345; // k05_ii를 12345로 재선언
		k05_jj = ((k05_ii + 5) / 10) * 10; // k05_jj 연산값 대입
		System.out.printf("#4-2 : %d\n", k05_jj); // 10진수로 k05_jj 출력
		
		k05_ii = 12344; // k05_ii = 12344로 선언
		k05_jj = ((k05_ii + 5) / 10) * 10; // k05_jj 연산값 대입
		System.out.printf("#4-3 : %d\n", k05_jj); // 10진수로 k05_jj 출력
		 
		
		// 100원이하 버림 올림,  1000원 이하 버림 반올림을 구현
		int k05_100floor = 15489; // k05_100floor 100원이하 버림할 변수 선언
		k05_100floor = (k05_100floor / 100) * 100; 
		// k05_100floor 는 int형 계산이기 떄문에 k05_100floor/100에서 소수점이 사라지므로 100원이하 버림
		System.out.printf("#4-4 : %d\n", k05_100floor); // k05_100floor 출력
		
		int k05_100ceil = 49392; // k05_100ceil 100원이하 올림할 변수 선언
		int k05_100ceilf = (k05_100ceil / 100) * 100;  // 우선 내림처리한 k05_ceilf 선언
		if (k05_100ceil != (k05_100ceilf)){
			k05_100ceilf = (int)k05_100ceilf + 100; // 만약 내림했을때 원래값과 같지 않다면 뒷자리가 00이 아닌것이므로 +100을 통해 올림처리
		} else {
			k05_100ceilf = (int)k05_100ceilf; // 만약 내림했을때 같다면 뒷자리가 00이므로 올림처리를 하지않고 그냥 진행
		}
		// int형 계산이기때문에 99를 더해서 100원이하단위 올림처리
		System.out.printf("#4-5 : %d\n", k05_100ceilf);// k05_100ceil 출력
		
		
		int k05_1000floor = 584432; // k05_1000floor 1000원이하 버림할 변수 선언
		k05_1000floor = (k05_1000floor / 1000) * 1000;
		//k05_1000floor는 정수형 계산이기 때문에 1000으로 나눴을떄 소수점이 사라지므로 1000이하 버림
		System.out.printf("#4-6 : %d\n", k05_1000floor);// k05_1000floor 출력
		
		int k05_1000round = 94782; // k05_1000round 1000원이하 반올림 할 변수 선언
		k05_1000round = ((k05_1000round+500) / 1000) * 1000;
		//k05_1000round는 정수형 계산이기 때문에 500을 더하고 1000으로 나눴을떄 소수점이 사라지므로 1000이하 버림
		System.out.printf("#4-7 : %d\n", k05_1000round);// k05_1000round 출력
		
		
		
		
		System.out.println();
		//#5. 소수점 이하에서는 어떻게할까?
		int k05_MyVal = 14 / 5; // 이값은 2.8이지만 int형 계산이므로 2가 저장된다.
		System.out.printf("#5-1 : %d\n", k05_MyVal); // 10진수로 k05_MyVal 출력 int형 계산이라 2출력
		
		double k05_MyValF;
		k05_MyValF = 14 / 5; // 실수형계산이기 때문에 k05_MyValF에 저장하지만 정수/정수이므로 정수단위로 저장
		System.out.printf("#5-2 : %f\n", k05_MyValF); // 실수형으로 k05_MyValF 출력 정수형 계산이라 2출력
		k05_MyValF = 14.0 / 5; // 실수형계산이기 때문에 k05_MyValF에 저장
		System.out.printf("#5-3 : %f\n", k05_MyValF); // 실수형으로 k05_MyValF 출력 14.0(실수)이기 때문에 실수형 계산이라 2.8출력
		k05_MyValF = (14.0) / 5 + 0.5; // 실수형계산이기 때문에 k05_MyValF에 저장
		System.out.printf("#5-4 : %f\n", k05_MyValF); // 실수형으로 k05_MyValF 출력 실수형계산이기때문에 2.8+0.5 -> 3.3이 출력
		k05_MyVal = (int)(14.0 / 5 + 0.5); // 정수형으로 저장되기때문에 k05_MyValF가 아닌 k05_MyVal에 저장
		System.out.printf("#5-5 : %d\n", k05_MyVal); // 정수형으로 k05_MyVal 출력 실수형계산이기때문에 2.8+0.5 -> 3.3 정수형출력이기때문에 3출력
		
		
		
		
		
		
	}

}
