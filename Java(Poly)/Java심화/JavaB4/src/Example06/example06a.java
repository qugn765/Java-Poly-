package Example06;

public class example06a {

	public static void main(String[] args) {
		for(int k05_i = 1; k05_i < 13; k05_i++) {
			System.out.printf(" %d월 -> ", k05_i);
			for(int k05_j = 1; k05_j < 32; k05_j++) {
				System.out.printf("%d",k05_j);
				if(k05_i == 1 && k05_j == 31) break;
				if(k05_i == 2 && k05_j == 28) break;
				if(k05_i == 3 && k05_j == 31) break;
				if(k05_i == 4 && k05_j == 30) break;
				if(k05_i == 5 && k05_j == 31) break;
				if(k05_i == 6 && k05_j == 30) break;
				if(k05_i == 7 && k05_j == 31) break;
				if(k05_i == 8 && k05_j == 31) break;
				if(k05_i == 9 && k05_j == 30) break;
				if(k05_i == 10 && k05_j == 31) break;
				if(k05_i == 11 && k05_j == 30) break;
				if(k05_i == 12 && k05_j == 31) break;
				System.out.printf(",");
			} // 1,3,5,7,8,10,12월일때는 31일까지 찍고 2월일때는 28 나머지는 30일까지 찍는 반복문
			  // 1일 2일 사이에 ,를 추가 1,2,3,4
			System.out.printf(".\n");
		} // 1월부터 12월까지 출력하기위해 i를 1부터 12까지 반복하는 반복문 선언
		  // i가 1개증가하면 1달이 증가하는거고 그래서 줄내림과 마지막에 마침표를찍음

	}
}
