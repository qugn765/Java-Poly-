package Example12;

public class k05_Elevater3 extends k05_Elevater2{


	public void k05_Repair() {
		help = String.format("수리중입니다");
	} //Repair 메소드 선언
	
	void k05_up() {
		if(k05_floor >= k05_limit_upfloor) {
			help = "마지막 층입니다";
		} else {
			k05_floor = k05_floor + 2;
			help = String.format("%d 층입니다", k05_floor);
		}	
		this.k05_down(); // Elevater2에있는 down을 호출해서 2개올리고 1개씩 내리면서 down에있는
		//클래스안에찍고있는 MSG 출력
	} // up을 호출하면 floor를 +1해주는 메소드 만약 최대층이라면 마지막층입니다를help에 저장
	
	void k05_down() {
		super.k05_down();
		System.out.printf("클래스 안에서 찍고있는 MSG[%s]\n", this.help);
	} // down을 호출하면 floor를 -1해주는 메소드 만약 최대층이라면 처음층입니다를help에 저장


}
