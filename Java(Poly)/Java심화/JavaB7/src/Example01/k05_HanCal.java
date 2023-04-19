package Example01;

public class k05_HanCal {

	public static String k05_HanBlankForeword(String k05_a, int k05_b) {
		int k05_blankcnt = k05_b - k05_a.getBytes().length; // 총바이트 수와 입력받은 문자열의 바이트수를 계산하여 공백계산
		String k05_output = k05_a;
		for (int k05_i = 0; k05_i < k05_blankcnt; k05_i++) {
			k05_output = " " + k05_output; // 두 바이트차이만큼 앞쪽에 공백추가
		}
	
		return k05_output;
	}

	public static String k05_HanBlankBackword(String k05_a, int k05_b) {
		int k05_blankcnt = k05_b - k05_a.getBytes().length;// 총바이트 수와 입력받은 문자열의 바이트수를 계산하여 공백계산
		String k05_output = k05_a;
		for (int k05_i = 0; k05_i < k05_blankcnt; k05_i++) {
			k05_output =  k05_output +  " ";// 두 바이트차이만큼 뒤쪽에 공백추가
	}	
		return k05_output;	

	}

	public static int k05_HanCount(String k05_a) {
		int sum = 0;  // 한글일때 더해줄 변수 설정
		for (int i = 0; i < k05_a.length(); i++) {			
			//for문을 글자수만큼 돌린다.
			String a = String.valueOf(k05_a.charAt(i));
			if(a.getBytes().length == 2) {
				sum++;			
			}
		}
		return sum; //결과값 리턴
	}	
}



