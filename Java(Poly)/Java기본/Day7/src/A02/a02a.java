package A02;

import java.util.Scanner;

public class a02a {

	public static void main(String[] args) {System.out.print("입력하세요: ");
	Scanner scanner = new Scanner(System.in);
	String input1 = scanner.nextLine();    
	String input2 = scanner.nextLine();
	String input = " ";
	String input0 = " ";
	int alphabet1[] = new int[26];   
	int alphabet2[] = new int[26];
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
	System.out.println();
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
	int a = 0;
	int count[] = new int[26];

	for (int i = 0; i < 26; i++) { 
		if (alphabet2[i] !=0)
			count[i]=alphabet1[i];
	}

	int max = count[0];
	for (int i=0; i<count.length; i++){
		if(max < count[i]) {
			max = count[i];
		}
	}
	int min = max;
	for( int i = 0; i<count.length; i++)
		if(min > count[i] && count[i]>0){
			min = count[i];
		}
	System.out.println(min);
	} 
}








/*
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		int cnt = 0;
		while(true) {
			if (input1.contains(input2)) {
				cnt++;
				int a = input1.indexOf(input2);
				input1 = input1.substring(a+1);
			} else {
				break;
			}
		}
		System.out.println(cnt);

	}

}
 */