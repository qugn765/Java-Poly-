package Example01;

public class exampleif01 {

	public static void main(String[] args) {
		String k05_jumin = "123456-1234567"; // 문자열 jumin 선언
		switch(k05_jumin.charAt(7)) { // ()안에 조건에 따라 case n을 실행
		case '1' :  // jumin의 7번째 글자가 1일때 밑에코드 실행
			System.out.println("20세기전 태어난 남자 사람");
			break; // switch문을 탈출시키는 코드
		case '2' : // jumin의 7번째 글자가 2일때 밑에코드 실행
			System.out.println("20세기전 태어난 여자 사람");
			break;
		case '3' : // jumin의 7번째 글자가 3일때 밑에코드 실행
			System.out.println("20세기후 태어난 남자 사람");
			break; 
		case '4' : // jumin의 7번째 글자가 4일때 밑에코드 실행
			System.out.println("20세기후 태어난 여자 사람");
			break;
		default : // 그외 나머지일때 밑에 코드 실행
			System.out.println("사람");
			break;
		}

	}

}
