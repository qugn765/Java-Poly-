package ThreadExample3;

public class ex03a {

	public static void main(String[] args) {
		int i = 0;
		while(i < 6){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			i++;
			System.out.println(randomNum());
		}
		
		
		
		
	}
	
	
	
	
	public static int randomNum() {
		int a = (int)(Math.random() * 46);
		return a;
	}

}
