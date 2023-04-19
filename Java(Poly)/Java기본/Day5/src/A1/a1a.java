package A1;

public class a1a {
	static int sum = 0;
	public static void main(String[] args) {


	}
	
	
	
	public static int dice(int n, int m, int k) {
		if(m == k) {
			
		}
		for(int i = 1; i < 7; i++) {
			sum += i;
			dice(n - 1, m, sum);
		}
		
		return dice(n - 1, m, sum);
		
	}
}




