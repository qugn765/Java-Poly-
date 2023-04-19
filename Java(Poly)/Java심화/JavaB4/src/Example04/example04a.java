package Example04;

public class example04a {

	public static void main(String[] args) {
		int k05_i = 10/3; // int로 선언했기때문에 3.333이아닌 3이 저장
		double k05_d = 10/3.0; // double로 선언했기때문에 3.3333이 저장된다

		if (k05_i == k05_d) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)k05_i, k05_d);
		// i랑 d랑 같으면 위에를 출력 아니라면 밑에를 출력

		if (k05_d == 3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", k05_d);
		// d = 3.333333이랑 같다면 위 아니면 밑을 출력 d는 3.333333으로 출력되지만
		// 실질적인 d=3.333333이 아니므로 Not equal출력

		k05_d = (int)k05_d; //double 형 d를 int형으로 변환
		if (k05_i == k05_d) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)k05_i, k05_d);
		// int형으로 변환했기 떄문에 둘다 3으로 equal이 출력된다

		System.out.printf("int로 인쇄[%d][%f]\n", k05_i, k05_d);
		//int형으로 출력했기때문에 3이 출력된다 %d %f이므로 3 3.000이출력
		System.out.printf("double로 인쇄 [%f][%f]\n", (double)k05_i, k05_d);
		//double형으로 출력했기 때문에 3.0000이 출력된다
		
		char k05_a = 'c'; //char 'c'선언
		if (k05_a=='b') System.out.printf("a는 b이다\n");
		if (k05_a=='c') System.out.printf("a는 c이다\n");
		if (k05_a=='d') System.out.printf("a는 d이다\n");
		//a 가 'c'인경우에는 a는c이다출력 그 외에는 출력하지않음

		String k05_aa = "abcd"; // 문자열"abcd"선언
		if(k05_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n");
		else System.out.printf("aa는 abcd가 아니다\n");
		// 문자열aa가 "abcd"라면 위에출력 아니라면 아래출력
		
		boolean k05_bb = true; // bb를 true로 선언
		if(!!k05_bb) System.out.printf("bb가 아니고 아니면 참이다\n");
		else System.out.printf("bb가 아니고 아니면 거짓이다\n");
		// !!bb는 true의 not의 not 이므로 true이기때문에 참이다가 출력될것이다
	}

}
