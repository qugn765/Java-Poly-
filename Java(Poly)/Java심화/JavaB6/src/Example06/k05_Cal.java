package Example06;

public class k05_Cal{

	public int k05_sum(int k05_a, int k05_b) {
		return k05_a + k05_b;
	} // int 형 2개를 받아서 sum해서 return해주는 메소드
	
	public int k05_sum(int k05_a, int k05_b, int k05_c) {
		return k05_a + k05_b + k05_c;
	} // int 형 3개를 받아서 sum해서 return해주는 메소드
	
	public int k05_sum(int k05_a, int k05_b, int k05_c, int k05_d) {
		return k05_a + k05_b + k05_c + k05_d;
	} // int 형 4개를 받아서 sum해서 return해주는 메소드
	
	public double k05_sum(double k05_a, double k05_b) {
		return k05_a + k05_b;
	} // double 형 2개를 받아서 sum해서 return해주는 메소드
	
	// 모두 같은 k05_sum이지만 (  )에 변수가 다르기때문에 같은메소드지만 선언가능
}
