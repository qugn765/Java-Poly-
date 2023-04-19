package Example03;

public class example03a {

	public static void main(String[] args) {
		int k05_A = 0; // 정수형변수 A선언
		int k05_B;  // 정수형 변수 B 선언
		while(true) { 
			k05_B = 0; // B = 0으로 초기화
			while(true) {
				System.out.printf("*"); // *찍기
				if(k05_A == k05_B) {
					break;
				} // A랑 B랑 같아지면 while문 탈출
				k05_B++; // while문 반복할때마다 B 1씩 증가
			} // A랑 B랑 같아질때까지 B=0에서부터 B를 1씩추가하면서 별찍기
			  // A-1개만큼 별찍기 
			
			System.out.printf("\n"); // 줄내림
			k05_A++; // while문 반복할때마다 A 1씩증가
			if(k05_A == 30) break; // A가 30일때 while문 탈출
		} // 반복문을 실행한 후 줄내림을하고 A의 값 1씩증가하면서 30일때 정지

	}

}
