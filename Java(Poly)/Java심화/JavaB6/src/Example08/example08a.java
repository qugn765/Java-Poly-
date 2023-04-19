package Example08;

public class example08a {
	
	static k05_Elevater2 k05_elev1;
	static k05_Elevater2 k05_elev2;
	static k05_Elevater2 k05_elev3;

	public static void main(String[] args) {
		k05_elev1 = new k05_Elevater2();  // Class에서 지정한 최대 10층 최하 1층 현재 1층으로 변수저장됨
		k05_elev2 = new k05_Elevater2(20, 1, 8); // 최대 20층 최하 1층 현재 8층으로 변수저장
		k05_elev3 = new k05_Elevater2(50, -3, 5);// 최대 50층 최하 -3층 현재 5층으로 변수저장
		
		for (int k05_i = 0; k05_i < 20; k05_i++) {
			k05_elev3.k05_up(); k05_elev3.k05_msg("3번엘베 1층씩 오르기");
		}// elev3에 대해서 up 함수 20번실행하고 msg 실행
		System.out.println();
		
		for (int k05_i = 0; k05_i < 20; k05_i++) {
			k05_elev3.k05_up(2); k05_elev3.k05_msg("3번엘베 2층씩 오르기");
		}// elev3에 대해서 up(2)함수  20번실행하고 msg 실행
		// up() 안에 2가들어갔기떄문에 2층씩오르는걸로 실행
		System.out.println();
		
		for (int k05_i = 0; k05_i < 20; k05_i++) {
			k05_elev3.k05_down(3); k05_elev3.k05_msg("3번엘베 3층씩 내리기");
		}// elev3에 대해서 down(3) 함수 20번실행하고 msg 실행
		// donw안에 3이 들어갔기때문에 3층씩 내려가는걸로 실행
		System.out.println();
		

	}

}
