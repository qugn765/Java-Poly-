package example;

public class example1 {

	public static void main(String[] args) {
		int n =10;
		int sum = 0;
		for(int i = 1; i < n+1; i++) {
			sum = sum + i; 
		}
		System.out.println(sum);
		
		
		
		System.out.println(" ");
		sum =0;
		int i = 1;
		while(i < n+1) {
			sum = sum + i;
			i = i + 1;
		}	
		System.out.println(sum);
		
		
		
		System.out.println(" ");
		for(i=1; i<6; i++) {
			System.out.println(i);
		}
		
		
		
		System.out.println(" ");
		i = 1;
		while(i < 6) {
			System.out.println(i);
			i = i + 1;
		}

		
		
	}

}
