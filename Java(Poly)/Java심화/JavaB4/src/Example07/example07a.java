package Example07;

public class example07a {

	public static void main(String[] args) {
		String[] k05_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		// units의 [0]~[9] 까지 영일이..구 까지 선언
		for (int k05_i = 0; k05_i < 101; k05_i++) {
			
			if (k05_i >=0 && k05_i < 10) {
				System.out.printf("일의 자리 : %s\n", k05_units[k05_i]);
			} // 0~9까지일떄는 배열의 0~9번째 String을 출력하는 조건문 
			else if (k05_i >=10 && k05_i < 100) {
				int k05_i10 = k05_i / 10; // 10으로 나눈 몫인 십의 자리를 저장
				int k05_i0 = k05_i % 10; // 10으로 나눈나머지인 일의 자리를 저장
				if (k05_i0==0) {
					System.out.printf("숫자 %d : %s십\n", k05_i,  k05_units[k05_i10]); // 10의배수만 십의자리만 출력
				} else {
					System.out.printf("숫자 %d : %s십%s\n", k05_i, k05_units[k05_i10], k05_units[k05_i0]); // 10의배수가 아닌것은 십의자리,일의자리 출력
				}
			} // i = 0 이라면 일의자리는 없는것이기때문에 10의자리만 출력하고 나머지경우에는 십의자리 일의자리 모두 출력
			else System.out.printf("--> %d\n",k05_i); // 나머지 경우일떄는 그냥 숫자 출력
			
		} //i가 0~100까지 늘어나는 반복문

	}

}
