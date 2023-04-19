package Example02;

public class example02a {

	public static void main(String[] args) {
		int k05_sum = 0; // 정수형 sum선언
		for (int k05_i = 0; k05_i < 10; k05_i++) {
			k05_sum += k05_i;
		} // sum에 0부터 9까지 계속해서 합치는 반복문
		
		System.out.printf("sum = %d\n",k05_sum); // sum출력
		
		for (int k05_i = 1; k05_i < 10; k05_i++) {
			System.out.printf("********************\n");
			System.out.printf("     구구단 %d단 \n",k05_i);
			System.out.printf("********************\n");
			for(int k05_j = 1; k05_j < 10; k05_j++) {
				System.out.printf(" %d * %d = %d \n",k05_i, k05_j, k05_i * k05_j);
			} // 변수 i에 대해서 i * j = i*j j를 1부터9까지 반복해주는 반복문 
		} // i를 1부터 9까지 늘어나면서 반복문실행

	}

}
