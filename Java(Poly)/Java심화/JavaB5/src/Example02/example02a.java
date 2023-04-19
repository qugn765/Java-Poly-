package Example02;

public class example02a {

	public static void main(String[] args) {
		int k05_WeekDay = 5; // 매달 시작할 요일을 지정하는 변수 선언
		int[] k05_MonEnd = {31,28,31,30,31,30,31,31,30,31,30,31};  // 1월 ~ 12월까지 마지막날을 배열로 저장
		int k05_inputyear = 2021;
		
		int k05_ydflag = k05_inputyear % 4;
		if (k05_ydflag == 0) {
			k05_MonEnd[1] = 29;
		} else {
			k05_MonEnd[1] = 28;
		} 
		
		for (int k05_Mon = 0; k05_Mon < 12; k05_Mon++) {
			k05_WeekDay = k05_WeekDay % 7; // 1달이 끝나면 WeekDay를 7로 나누어 다음달을 시작할 요일을 다시 지정
			System.out.printf("\n\n        %d월\n", k05_Mon + 1); // 몇월인지 출력
			System.out.printf("======================\n");
			System.out.printf("%s%s%s%s%s%s%s\n"," 일"," 월"," 화"," 수"," 목"," 금"," 토"); //요일출력
			
			for (int k05_DayCal = 0; k05_DayCal < k05_WeekDay; k05_DayCal++) {
				System.out.printf("   ");
			} // 무슨요일에 시작하는지에 따라서 공백을 이용해 1일을 시작하는 요일에 맞추기
			
			for (int k05_Day = 1; k05_Day <= k05_MonEnd[k05_Mon]; k05_Day++) {
				if (k05_WeekDay % 7 == 0 && k05_WeekDay != 0) System.out.printf("\n"); // WeekDay가 7이될때마다 한주가 끝나기 때문에 줄내림
				System.out.printf(" %2.2s", k05_Day); // 1,2,3,4 일수 출력
				k05_WeekDay++; // 일수가 늘어날떄마다 요일도 같이늘어나기 때문에 ++로 증가처리
			}			
		}

	}

}
