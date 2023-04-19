package example4;

public class example_4 {

	public static void main(String[] args) {
		String text = "I am a boy";
		int k=0;
		String text2 = "";
		for(int i = 0; i < text.length(); i++) {		
			k = (int)text.charAt(i); 
			
			if((64<k)&&(k<91)) {
				text2 = text2  + (char)(k+32);
			} else if((96<k)&&(k<123)) {
				text2 = text2 + (char)(k-32);
			} else {
				text2 = text2 + (char)k;
			}

		}
		System.out.println(text2);			

	}
}		















/*
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String input = scanner.next();
			if(input.contains("안녕")) {
				System.out.println("안녕하세요");
			} else if(input.contains("몇살")) {
				System.out.println("나는 29살, 너는?");
			} else if(input.contains("취미")) {
				System.out.println("내 취미는 풋살이야");
			} else if(input.contains("특기")) {
				System.out.println("내 특기는 게임이야");
			} else if(input.contains("사는곳")) {
				System.out.println("내가 사는곳은 수원이야");
			} else if(input.contains("나갈게")) {
				System.out.println("안녕 잘가");
				break;
			}
		}











		int peoplesAge;
		int PeoplesAge;
		int animalsAge;
		int AnimalsAge;

		int a1 = 65;
		int a2 = 97;

		for(int i = 65; i < 91; i++) {
			System.out.println((char)i);
		}

		for(int i = 97; i < 123; i++) {
			System.out.println((char)i);
		}
 */

