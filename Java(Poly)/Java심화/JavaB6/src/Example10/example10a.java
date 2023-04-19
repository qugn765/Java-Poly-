package Example10;

public class example10a {

	public static void main(String[] args) {
		
		k05_Elevater3 k05_elev3;  // 객체생성

		k05_elev3 = new k05_Elevater3(); //객체생성
		for (int k05_i = 0; k05_i <10; k05_i++) {
			k05_elev3.k05_up();
			System.out.printf("MSG elev3[%s]\n", k05_elev3.help);
		} // 10번반큼 k05_up 함수 호출후 help 출력하기
		
		for (int k05_i = 0; k05_i <10; k05_i++) {
			k05_elev3.k05_down();
			System.out.printf("MSG elev3[%s]\n", k05_elev3.help);
		}// 10번반큼 k05_down 함수 호출후 help 출력하기
		
		k05_elev3.k05_Repair();
		System.out.printf("MSG elev3[%s]\n", k05_elev3.help);
		// Repair 메소드 호출후 help출력하기
	}
	
}
