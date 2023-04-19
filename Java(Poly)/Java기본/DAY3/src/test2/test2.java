package test2;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n<0) {
			n=1;
		} else if(n>0){
			n=2;
		} else {
			n=3;
		}
		
		switch(n) {
		case 1: 
			System.out.println("negative number");
			break;
		case 2:
			System.out.println("positive numbe");
			break;
		case 3:
			System.out.println("zero");
			break;
		}
	}

}
