package Example02;

public class example2 {

	public static void main(String[] args) {
		int k05_x = 10;  // 변수 x를 10으로 선언
		int k05_y = 20; // 변수 y를 20으로 선언
		int k05_tmp = 0; // 변수 tmp를  0으로 선언
		System.out.println("x : " + k05_x + " y : "+ k05_y);
		//선언한 x 랑 y를 그대로 출력
		
		k05_tmp = k05_x;  // tmp에 x값 선언 tmp = 10
		k05_x =  k05_y; // x값에 y값 선언 x = 20
		k05_y = k05_tmp; // y 값에 tmp 선언 y =10
		System.out.println("x : " + k05_x + " y : " + k05_y);
		// 변한 x랑 y를 출력
	}

}
