package Example10;

public class k05_Elevater2 {
	public int k05_limit_upfloor; // 최대층
	public int k05_limit_downfloor; // 최하층
	public int k05_floor; // 현재층
	public String help;
	
	k05_Elevater2(){
		k05_limit_upfloor = 10;
		k05_limit_downfloor = 1;
		k05_floor = 1;
		help = "엘레베이터 기본 준공 완료";
		System.out.printf("%s\n",help);
	} // 변수들 값 지정
	
	k05_Elevater2(int up_floor, int d_floor, int in_floor){
		k05_limit_upfloor = up_floor;
		k05_limit_downfloor = d_floor;
		k05_floor = in_floor;
		help = "엘레베이터 맞춤 준공 완료";
	} // Elevater메소드에 변수를 받아 최대,최하,현재층을 입력받아서 저장
	
	void k05_up() {
		if(k05_floor == k05_limit_upfloor) {
			help = "마지막 층입니다";
		} else {
			k05_floor++;
			help = String.format("%d 층입니다", k05_floor);
		}
	} // up을 호출하면 floor를 +1해주는 메소드 만약 최대층이라면 마지막층입니다를help에 저장
	
	void k05_down() {
		if(k05_floor == k05_limit_downfloor) {
			help = "처음 층입니다";
		} else {
			k05_floor--;
			help = String.format("[%d] 층입니다", k05_floor);
		}
	} // down을 호출하면 floor를 -1해주는 메소드 만약 최대층이라면 처음층입니다를help에 저장
	
	void k05_up(int k05_u) {
		for(int k05_i = 0; k05_i < k05_u; k05_i++) this.k05_up();
	} // 입력받은 변수만큼 up메소드 호출
	
	void k05_down(int k05_u) {
		for(int k05_i = 0; k05_i < k05_u; k05_i++) k05_down();
	} // 입력받은 변수만큼 down메소드 호출
	
	void k05_msg(String k05_id) {
		System.out.printf("%s => [%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", 
				k05_id, help, k05_limit_upfloor, k05_limit_downfloor, k05_floor);
	} // msg함수에서 저장된 메세지 최대층 최소층 현재층 출력
	
}
