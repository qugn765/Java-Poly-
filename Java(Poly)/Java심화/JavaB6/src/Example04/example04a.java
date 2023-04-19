package Example04;

public class example04a {
	
	private static int k05_inVal;
	
	public static void k05_up() {
		k05_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n",k05_inVal);
	}

	public static void main(String[] args) {
		k05_inVal = 0;
		k05_Elevater k05_elev; // Class를 받아서 객체만들고
		
		k05_elev = new k05_Elevater(); // 인스턴스를 생성하여 객체에 연결
		
		k05_up(); // example04a에서 선언한 k05_up호출
		
		for (int k05_i = 0; k05_i < 10; k05_i++) {
			k05_elev.k05_up();
			System.out.printf("Message[%s]\n", k05_elev.k05_help);
		} // Elevater Class의 up 메소드 출력
		
		for (int k05_i = 0; k05_i < 10; k05_i++) {
			k05_elev.k05_down();
			System.out.printf("Message[%s]\n", k05_elev.k05_help);
		} // Elevater Class의 down 메소드 출력
	}
}
