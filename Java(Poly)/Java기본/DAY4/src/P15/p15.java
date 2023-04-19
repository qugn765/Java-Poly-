package P15;
import java.util.Scanner;
public class p15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		if(x.contains("/")==true) {
			String[] array = x.split("/");
			try{
				double number = Integer.parseInt(array[0]);
				double number2 = Integer.parseInt(array[1]);
				System.out.println(number/number2);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		} else if(x.contains("+")==true) {
			String[] array = x.split("+");
			try{
				double number = Integer.parseInt(array[0]);
				double number2 = Integer.parseInt(array[1]);
				System.out.println(number+number2);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		} else if(x.contains("-")==true) {
			String[] array = x.split("-");
			try{
				double number = Integer.parseInt(array[0]);
				double number2 = Integer.parseInt(array[1]);
				System.out.println(number-number2);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		} else if(x.contains("*")==true) {
			String[] array = x.split("\\*");
			try{
				double number = Integer.parseInt(array[0]);
				double number2 = Integer.parseInt(array[1]);
				System.out.println(number*number2);
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}
		} else if(x.contains("%")==true) {
			String[] array = x.split("%");
			try{
				double number = Integer.parseInt(array[0]);
				double number2 = Integer.parseInt(array[1]);
				System.out.println((number%number2));
			}
			catch (NumberFormatException ex){
				ex.printStackTrace();
			}

		} else {
			System.out.println("잘못된 입력입니다.");
		}

	}
}