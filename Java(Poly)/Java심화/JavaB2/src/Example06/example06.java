package Example06;

public class example06 {

	public static void main(String[] args) {
		byte k05_b = 1;  // 정수형 4가지 data type중 byte에 b = 1 선언
		short k05_s = 2; // 정수형 4가지 data type중 short에 s = 2 선언
		char k05_c = 'A'; // 문자형 char에 c = 'A'선언
		
		int k05_finger = 10; // 정수형 data type중 int에 finger =10 선언
		long k05_big = 10000000000000L; // 정수형 data type중 가장 긴 long에 big 선언 뒤에 long자료형이므로 L 추가
		long k05_hex = 0xFFFFFFFFFFFFFFFL; 
		// 정수형 data type중 가장 긴 long에 hex 선언 F는 16진수 뒤에 long자료형이므로 L 추가
		int k05_octNum = 010; // 8진수 선언
		int k05_hexNum = 0x10; // 16진수 선언
		int k05_binNum = 0b10; // 2진수 선언
		
		System.out.printf("b = %d\n", k05_b);  // 10진수로 b 출력
		System.out.printf("s = %d\n", k05_s); // 10진수로 s 출력
		System.out.printf("c = %c, %d \n", k05_c, (int)k05_c); // 문자열 c출력과 문자열인 c를 int로 바꿔 'A'의 아스키코드 출력
		System.out.printf("finger = [%5d]\n", k05_finger); // []5칸을 만들어 뒤로정렬 finger 10진수로 선언
		System.out.printf("finger = [%-5d]\n", k05_finger); //[]5칸을 만들어 앞으로 정렬finger 10진수로 선언
		System.out.printf("finger = [%05d]\n", k05_finger); //[]5칸을 만들어 빈칸을 0으로채운 뒤로정렬 finger 10진수로 선언
		System.out.printf("big = %d\n", k05_big); // 10진수로 big 출력
		System.out.printf("hex = %#x\n", k05_hex); // 16진수로 hex출력
		System.out.printf("octNum = %o, %d\n", k05_octNum, k05_octNum); // 8진수로 octNum출력, 10진수로 octNum 출력
		System.out.printf("hexNum = %x, %d\n", k05_hexNum, k05_hexNum); // 16진수로 hexNum출력, 10진수로 hexNum 출력
		System.out.printf("binNum =%s,  %d\n", Integer.toBinaryString(k05_binNum), k05_binNum); // 2진수로 binNum 출력, 10진수로 binNum 출력
		
		
	}

}
