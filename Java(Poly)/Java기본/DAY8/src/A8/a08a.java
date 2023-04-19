package A8;

import java.util.ArrayList;
import java.util.Scanner;

public class a08a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		String input = "";
		String input0 = "";
		int alphabet1[] = new int[26];   
		int alphabet2[] = new int[26];
		int cnt = 0;
		System.out.println("1 : " + input1.length());
		System.out.println("2 : " + input2.length());
		input = input1.replace(" ", "");
		input0 = input2.replace(" ", "");

		for (int i = 0; i < input.length(); i++) {          
			int index = input.charAt(i);
			if(64 < index&& index < 90) {
				index = input.charAt(i)- (int) 'A';
				alphabet1[index]++;        
			} else if (96 < index && index < 123) {
				index = input.charAt(i)- (int) 'a';
				alphabet1[index]++;
			}         
		}

		for (int i = 0; i < input0.length(); i++) {           
			int index = input0.charAt(i);
			if(64 < index&& index < 90) {
				index = input0.charAt(i)- (int) 'A';
				alphabet2[index]++;        
			} else if (96 < index && index < 123) {
				index = input0.charAt(i)- (int) 'a';
				alphabet2[index]++;
			}         
		}

		try {
		for (int i = 0; i < alphabet2.length; i++) {
			if(alphabet2[i] > 0 && alphabet1[i] > 0) {
				++cnt;
			}
		}
		System.out.println("3 : " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
