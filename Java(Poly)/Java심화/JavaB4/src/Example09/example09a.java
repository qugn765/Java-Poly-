package Example09;

public class example09a {

	public static void main(String[] args) {
		for (int k05_i = 0; k05_i < 10; k05_i++) {
			for (int k05_j = 0; k05_j < k05_i; k05_j++) {
				System.out.printf(" ");
			} // i가 증가함에 따라 1번 2번... i-1번까지 실행하는 반복문
			System.out.printf("%d\n", k05_i);
		} // 반복문안에 반복문을 통해 " " 과 i를 출력하는 반복문

	}

}
