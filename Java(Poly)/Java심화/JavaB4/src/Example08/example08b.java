package Example08;

public class example08b {

	public static void main(String[] args) {
		int k05_iNumVal = 200000; //정수형 1001034567선언
		String k05_sNumVal = String.valueOf(k05_iNumVal); // 정수형인 1001034567을 String 문자열로 변환
		String k05_sNumVoice =""; // 문자열 선언
		//System.out.printf(" --> %s [%d자리]\n",k05_sNumVal,k05_sNumVal.length());
		// 숫자를 먼저 출력하고 그 숫자의 길이만큼 몇자리인지 출력

		int k05_i = 0;
		int k05_j = k05_sNumVal.length()-1;
		String[] k05_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}; // units{영 일....구} 배열 선언
		String[] k05_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"}; // unitX{ , 십 백 천....억 십} 배열 선언
		int k05_a = 0;
		int k05_count = 0;
		while(true) {
			if (k05_i >= k05_sNumVal.length()) break;
			// iNumVal의 갯수만큼 실행했다면 while문 탈출
			System.out.printf("%s[%s]", 
					k05_sNumVal.substring(k05_i,k05_i + 1),
					k05_units[Integer.parseInt(k05_sNumVal.substring(k05_i,k05_i + 1))]);
			// iNumVal의 각각의 숫자들을 substring으로 쪼개서 하나하나 units의 배열과 같이 출력

			int k05_x = Integer.parseInt(k05_sNumVal.substring(k05_j,k05_j+1));	
		
			++k05_count;
			if(k05_sNumVal.substring(k05_i,k05_i + 1).equals("0")) {
				if (k05_count % 4 == 0) {
					if(k05_a == 0) {
					k05_a = k05_a + k05_x;
					k05_a = 0;
				} else {
						k05_sNumVoice = k05_sNumVoice + k05_unitX[k05_j];
					}
				} else if (k05_count % 4 != 0){
					k05_a = k05_a + k05_x;
					k05_a = 0;
				}
			} else if (!(k05_sNumVal.substring(k05_i,k05_i + 1).equals("0"))) {
				 
					k05_a = k05_a + k05_x;
					k05_sNumVoice = k05_sNumVoice + k05_units[Integer.parseInt(k05_sNumVal.substring(k05_i, k05_i + 1))]
							+ k05_unitX[k05_j];                               
				} // 숫자가 0이 아닐때는 sNumVoice에 계속 units에 숫자발음과 unitX의 단위를 같이 저장
			
			k05_i++; // while문을 반복할때마다 i증가
			k05_j--; // 총 길이를 저장했던 j는 하나씩감소

		}
		System.out.printf("\n %s[%s]\n",k05_sNumVal, k05_sNumVoice);
		// String으로 바꿨던 sNumVal을 %s로 출력하고 일,이,삼(units)과 십 백 천(unitX)을 같이 저장했던 sNumVoice를 []안에 출력
	}
}

