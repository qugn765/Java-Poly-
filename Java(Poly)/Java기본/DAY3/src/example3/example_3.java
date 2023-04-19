package example3;

public class example_3 {

	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			for(int j=1; j<2*i+1; j++ ) {
				if(i==1) {
				System.out.print("*");
				} else if(i==2) {
				System.out.print("@");
				} else {
				System.out.print("!");
				}
			}
			System.out.println("");
		}
	}
}
