package Example11;

public class example11a {

	public static void main(String[] args) {
		int k05_n = 1; // *을 n번찍을 변수 n 선언 초기값 1
		int k05_m = 20; // " "을 m번찍을 변수 m 선언 초기값 20
		while(true) {
			for (int k05_i = 0; k05_i < k05_m; k05_i++) {
				System.out.printf(" ");				
			} // m번 공백을찍는 반복문 밑에식을통해 공백은 점점 줄어듬 처음에는20번 그다음19번....
			for (int k05_i = 0; k05_i < k05_n; k05_i++) {
				System.out.printf("*");				
			} // 공백뒤에 n번만큼 *을 찍는 반복문 밑에 식을통해서 n을 2씩증하므로 *은 1번 3번 5번... 
			System.out.printf("\n"); // 공백과 별을찍고나서 줄내림

			k05_m -= 1; // 다음반복문에서는 공백을 1칸줄임
			k05_n += 2; // 다음반복문에서는 *을 2개 늘림
			if (k05_m < 0) break; // 공백이 0이하일때는 멈춤
		} // 공백 20칸 별1개, 공백19칸 별3개 이런식으로 공백이 0이될때까지 출력하는 
		  // 피라미드형태의 *모양출력하는 반복문

	}

}
