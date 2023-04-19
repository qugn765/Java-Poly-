package Example03;

public class example03 {

	public static void main(String[] args) {
		String k05_name = "Kim" + "ByeongHoon";  //문자열 변수 name 선언
		String k05_str = k05_name + 8.0; // 문자열 변수 name에 8.0을 추가해 문자열str 선언
		
		System.out.println(k05_name);  // name 출력
		System.out.println(k05_str); // str 출력
		System.out.println(k05_str + 7); //str + 7 은 KimByeonHoon8.0 + 7 이지만 8.0은 문자열이므로 15로 출력되지않고 KimByeonHoon8.07로 출력
		System.out.println(7 + " "); // 7뒤에 공백이 출력
		System.out.println(" " + 7); // 7앞에 공백이 출력
		System.out.println(7 + "");// 7만 출력됨
		System.out.println("" + 7);// 7만 출력됨
		System.out.println("" + "");// 출력되지않음
		System.out.println(7 + 7 + ""); // 7 + 7이 먼저더해지기 때문에 문자열이아닌 정수로 먼저 계산되서 14가 출력됨
		System.out.println("" + 7 + 7); // "" + 7이 먼저더해지기 때문에 첫번째 7이 문자열이되고 뒤에오는 7도문자열에 합쳐져서 77이 출력됨
		

	}

}
