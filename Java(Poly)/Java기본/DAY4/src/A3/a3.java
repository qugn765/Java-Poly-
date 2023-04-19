package A3;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();     
        String input = " ";
        int alphabet1[] = new int[26];   
        int alphabet2[] = new int[26];
        input = input1.replace(" ", "");
        
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

        for (int i = 0; i < alphabet1.length; i++) {
            if (alphabet1[i] != 0) {                           
                System.out.println("'" + (char) (i + 65) + "'" + "는" + (alphabet1[i]) + "개 있습니다.");
            }
        }
    } 
}
