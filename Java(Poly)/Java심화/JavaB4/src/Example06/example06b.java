package Example06;

public class example06b {

	public static void main(String[] args) {
		for(int k05_i = 1; k05_i < 13; k05_i++) {
			System.out.printf(" %d월 -> ", k05_i); // 몇월인지 찍어내는 출력문
			for(int k05_j = 1; k05_j < 32; k05_j++) {
				System.out.printf("%d",k05_j); //일을 찍어내는 반복문
				
				if (k05_i == 4 || k05_i == 6 || k05_i == 7 || k05_i == 9 || k05_i == 11 ) {
					if (k05_j == 30) break;
				} else if (k05_i == 2) {
					if (k05_j == 28) break;
				} else {
					if(k05_j == 31) break;
				} // 1,3,5,7,8,10,12월일때는 31일까지 찍고 2월일때는 28 나머지는 30일까지 찍는 조건문
				System.out.printf(",");	  // 1일 2일 사이에 ,를 추가 1,2,3,4	
			}
			System.out.printf(".\n");			
		} // 1월부터 12월까지 출력하기위해 i를 1부터 12까지 반복하는 반복문 선언
		  // i가 1개증가하면 1달이 증가하는거고 그래서 줄내림과 마지막에 마침표를찍음

		///////////////////////////////////////////////
		System.out.printf("\n\n\n");
		///////////////////////////////////////////////		

		for(int k05_i = 1; k05_i < 13; k05_i++) {
			System.out.printf(" %d월 -> ", k05_i); // 몇월인지 찍어내는 출력문
			for(int k05_j = 1; k05_j < 32; k05_j++) {
				System.out.printf("%d",k05_j); //일을 찍어내는 반복문

				if ((k05_i == 4 || k05_i == 6 || k05_i == 7 || k05_i == 9 || k05_i == 11) && (k05_j == 30)) break;
				if (k05_i == 2 && k05_j == 28) break;
				if (k05_j == 31) break;
				// 1,3,5,7,8,10,12월일때는 31일까지 찍고 2월일때는 28 나머지는 30일까지 찍는 조건문
				System.out.printf(","); // 1일 2일 사이에 ,를 추가 1,2,3,4		
			}
			System.out.printf(".\n");			
		} // 1월부터 12월까지 출력하기위해 i를 1부터 12까지 반복하는 반복문 선언
		  // i가 1개증가하면 1달이 증가하는거고 그래서 줄내림과 마지막에 마침표를찍음

		///////////////////////////////////////////////
		System.out.printf("\n\n\n");
		///////////////////////////////////////////////		
		for(int k05_i = 1; k05_i < 13; k05_i++) {
			System.out.printf(" %d월 -> ", k05_i); // 몇월인지 찍어내는 출력문
			LOOP:for(int k05_j = 1; k05_j < 32; k05_j++) {
				System.out.printf("%d",k05_j); //일을 찍어내는 반복문

				switch(k05_i) {
				case 4: case 6: case 7: case 9: case 11:
					if (k05_j == 30) break LOOP;
					break;
				case 2:
					if(k05_j == 28) break LOOP;
					break;
				case 1: case 3: case 5: case 8: case 10: case 12:
					if(k05_j == 31) break LOOP;
					break;
				} // 1,3,5,7,8,10,12월일때는 31일까지 찍고 2월일때는 28 나머지는 30일까지 찍는 조건문
				System.out.printf(",");	// 1일 2일 사이에 ,를 추가 1,2,3,4		 		
			}
			System.out.printf(".\n");
		} // 1월부터 12월까지 출력하기위해 i를 1부터 12까지 반복하는 반복문 선언
		  // i가 1개증가하면 1달이 증가하는거고 그래서 줄내림과 마지막에 마침표를찍음
		
		
		///////////////////////////////////////////////
		System.out.printf("\n\n\n");
		///////////////////////////////////////////////	
		
		int[] k05_Day = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월까지 끝나는 날짜를 배열로 선언
		for (int k05_i = 1; k05_i < 13; k05_i++) {
			System.out.printf(" %d월 ->", k05_i); // 월을 찍어내는 출력문
			for(int k05_j = 1; k05_j < 32; k05_j++) {
				System.out.printf("%d",k05_j); // 일을 찍어내는 출력문
				if(k05_Day[k05_i-1] == k05_j) break;
				System.out.printf(",");
				// i-1을 하는 이유는 배열에 첫번째는0이기떄문 1월과 배열에서선언한 1월마치는 날을 비교해서 같다면 탈출
				// 같지 않다면 ,를찍고 다음일을 찍기
			}
			System.out.printf(".\n");
		} // 1월부터 12월까지 출력하기위해 i를 1부터 12까지 반복하는 반복문 선언
		  // i가 1개증가하면 1달이 증가하는거고 그래서 줄내림과 마지막에 마침표를찍음

	}
}