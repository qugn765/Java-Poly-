package P14;
import java.util.Scanner;
public class p14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String text2 = " ";
		if (text.contains(" a i")) {
			text2 = text.replaceAll(" a i", " an i");
			System.out.println(text2);	
		} else if (text.contains(" a a")) {
			text2 = text.replaceAll(" a a", " an a");
			System.out.println(text2);		
		} else if (text.contains(" a e")) {
			text2 = text.replaceAll(" a e", " an e");
			System.out.println(text2);		
		} else if (text.contains(" a o")) {
			text2 = text.replaceAll(" a o", " an o");
			System.out.println(text2);		
		} else if (text.contains(" a u")) {
			text2 = text.replaceAll(" a u", " an ");
			System.out.println(text2);		
		} else {
			System.out.println(text);
		}
		
	}

}


