package Example13;

public class example13a {

	public static void main(String[] args) {
		double k05_length = 1000; // 원의 지름
		double k05_circlelength = 0; // 원의 둘레 변수 선언
		k05_circlelength = 2 * (k05_length / 2) * 3.141592; // 원의 둘레 = 2 * 반지름 * pi  pi =3.141592
		System.out.printf("원의 지름 : %fcm\n원의 반지름 : %fcm\n원의둘레 : %fcm\n", k05_length, k05_length/2, k05_circlelength);
		// 원의 지름, 원의 반지름, 원의 둘레 순서로 출력하기
	}

}
