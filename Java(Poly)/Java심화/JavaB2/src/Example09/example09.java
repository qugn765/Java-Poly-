package Example09;

public class example09 {

	public static void main(String[] args) {
		double k05_d = 85.4;  // double형으로 d = 85.4 선언
		int k05_score = (int)k05_d; // double형인 d를 정수형으로 변환 소수점은 버림하고 85 저장
		
		System.out.println("score = " + k05_score); // int형으로 저장된 score 출력
		System.out.println("d = " + k05_d); // double형으로 저장된 d 출력

	}

}
