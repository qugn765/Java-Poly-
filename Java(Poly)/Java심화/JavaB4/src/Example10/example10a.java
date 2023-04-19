package Example10;

public class example10a {

	public static void main(String[] args) {
		double k05_fSin; //각도에 따른 Sin값을 저장해줄 double형 변수 fSin선언
		
		for (int k05_i = 0; k05_i <360; k05_i++) {
			k05_fSin = Math.sin(k05_i * 3.141592 / 180);
			// Math.sin 함수를 통해 파이(3.141592)값을 이용해서 Sin값 저장하기
			System.out.printf("%d sin --> %f\n", k05_i, k05_fSin);
			// i값(각도)에 따른 저장한 Sin 값을 출력
		} // 0~359도까지의 Sin 값을 각각 출력하는 반복문
		
		
		
		for (int k05_i = 0; k05_i <360; k05_i++) {
			k05_fSin = Math.sin(k05_i * 3.141592 / 180);
			// Math.sin 함수를 통해 파이(3.141592)값을 이용해서 Sin값 저장하기
			int k05_Spcae = (int)((1.0 - k05_fSin) * 50); // -1~1범위안에 Sin함수를 이용해서 최소0 최대100인 Spcae선언
			for(int k05_j = 0; k05_j < k05_Spcae; k05_j++) {
				System.out.printf(" ");
			} // 위에서 계산한 값에따라 Space만큼 공백출력
			System.out.printf("*[%f][%d]\n", k05_fSin, k05_Spcae);
			// 공백 뒤에 i값(각도)에 따른 저장한 Sin 값을 출력
		} // Sin값을이용해 0도일떄 값이 0(공백 50칸) -1일때 공백 100칸 +1일때 공백0칸 을 이용해 세로로 누워져있는 Sin함수 출력
		
	}

}
