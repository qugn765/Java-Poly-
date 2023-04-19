package Example05;

import java.util.Scanner; // Scanner를 사용하기 위해서 추가

public class example05 {

	public static void main(String[] args) {
		Scanner k05_scanner = new Scanner(System.in); // Scanner 함수를 쓰기위한 scanner 선언
		System.out.print("두자리 정수를 하나 입력해주세요. ->"); // scanner를 통해 input을 받기전 문구 출력
		
		String k05_input = k05_scanner.nextLine(); // 문자열로 k05_input을 받기
		int k05_num = Integer.parseInt(k05_input); 
		// 문자열로 받은 k05_input을 Integer.parseInt()함수를 통해 int형으로 변환
		
		System.out.println("입력내용 : " + k05_input);
		// 입력받은 내용을 문자열로 출력
		System.out.printf("num = %d\n", k05_num);
		// Integer.parseInt() 함수를 통해 int형으로 변환한 k05_num 출력
	}

}
