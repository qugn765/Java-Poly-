package Example01;

public class example01a {

	public static void main(String[] args) {
		for (int k05_i = 1 ; k05_i <10; k05_i = k05_i+3) {
			System.out.printf("*************** *************** ***************\n");
			System.out.printf(" 구구단 %d 단     구구단 %d 단      구구단 %d 단\n", k05_i, k05_i + 1, k05_i + 2);
			// i에 1이 들어오면 1,2,3을 출력할수 있게 +1 +2를추가
			System.out.printf("*************** *************** ***************\n");
			for(int k05_j = 1; k05_j < 10; k05_j++) {
				System.out.printf(" %d * %d = %d\t %d * %d = %d\t %d * %d = %d\n", k05_i, k05_j, k05_i * k05_j, 
						k05_i + 1, k05_j, (k05_i + 1) * k05_j, (k05_i + 2), k05_j, (k05_i + 2) * k05_j);
			} // 구구단 n단의 n*1 ~ n*9까지 출력하는 반복문
		}

		//////////////////////////////
		System.out.printf("\n\n\n");
		//////////////////////////////
		
		
		for (int k05_i = 1 ; k05_i <4; k05_i++) {
			System.out.printf("*************** *************** ***************\n");
			System.out.printf("  구구단 %d 단    구구단 %d 단     구구단 %d 단\n", k05_i, k05_i + (3 * 1), k05_i + (3 * 2));
			// (1,4,7) (2,5,8) (3,6,9)를 같은 줄에 출력하기 위해 +3 +6을 해주었다
			System.out.printf("*************** *************** ***************\n");
			for(int k05_j = 1; k05_j < 10; k05_j++) {
				System.out.printf(" %d * %d = %d\t %d * %d = %d\t %d * %d = %d\n", k05_i, k05_j, k05_i * k05_j, 
						k05_i + (3 * 1), k05_j, (k05_i + (3 * 1)) * k05_j, k05_i + (3 * 2), k05_j, (k05_i + (3 * 2)) * k05_j);
			} // 구구단 n단의 n*1 ~ n*9까지 출력하는 반복문
		}
		
		
	}

}
