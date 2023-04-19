package Example04;

public class k05_Elevater {
	int k05_limit_upfloor = 10;  //최상위 층
	int k05_limit_downfloor = 0; //최하층
	int k05_floor = 1; // 현재층
	String k05_help; // 문자열 선언
	
	void k05_up() // up이라는 메소드 선언
	{
		if(k05_floor == k05_limit_upfloor) {
			k05_help = "마지막층입니다";
		} else {
			k05_floor++;
			k05_help = String.format("%d층입니다", k05_floor);
		}
	} //floor에 따라 마지막층까지 몇층입니다 라는 메세지를 출력하면서 floor를 1개씩 올려주는 메소드
	
	void k05_down()
	{
		if(k05_floor == k05_limit_downfloor) {
			k05_help = "처음층입니다";
		} else {
			k05_floor--;
			k05_help = String.format("%d층입니다", k05_floor);
		}
	}//floor에 따라 최하층까지 몇층입니다 라는 메세지를 출력하면서 floor를 1개씩 내려주는 메소드
}
