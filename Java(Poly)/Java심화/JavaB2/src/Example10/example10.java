package Example10;

public class example10 {

	public static void main(String[] args) {
		int k05_i = 10; // int형 변수 i =10으로 선언
		byte k05_b = (byte)k05_i; // int형 변수 10을 byte로 선언
		System.out.printf("[int -> byte] i =%d -> b = %d\n", k05_i, k05_b);
		// int형인 i와  int형 에서 byte로 바뀐 b출력
		
		k05_i = 300; // int i = 300 선언
		k05_b = (byte)k05_i; 
		// 300을 byte로 바꿔서 b에 저장, byte는 -128~127까지밖에 안되므로 0부터 300번째인 44로 저장
		// 300-127 -> 173   -128부터 173번째 숫자인 44로 저장
		System.out.printf("[int -> byte] i =%d -> b = %d\n", k05_i, k05_b);
		// int형인 i와  int형 에서 byte로 바뀐 b출력
		
		k05_b = 10; // byte형 변수 b에 10저장
		k05_i = (int)k05_b; // 10을 byte로 바꿔서 저장해도 int 범위안에있기때문에 10그대로 저장
		System.out.printf("[byte -> int] i =%d -> b = %d\n", k05_b, k05_i);
		// byte형인 b와  byte형 에서 int형 으로 바뀐 i출력 
		
		
		k05_b = -2; // byte형 변수 b에 -2저장
		k05_i = (int)k05_b; // -2을 byte로 바꿔서 저장해도 int 범위안에있기때문에 -2그대로 저장
		System.out.printf("[byte -> int] i =%d -> b = %d\n", k05_b, k05_i);
		// byte형인 b와  byte형 에서 int형 으로 바뀐 i출력
		
		System.out.println("i = " + Integer.toBinaryString(k05_i));
		// -2인 int형 i를 BinaryString 함수를 통해 2진수로 변환한 값 출력
		// int 형이기때문에 2진수로 2,147,483,647 까지표현가능하므로 -2는 2의보수 11111111111111111111111111111110이 출력

	}

}
