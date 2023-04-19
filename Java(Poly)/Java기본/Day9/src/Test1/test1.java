package Test1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test1 implements Operation {

	public static void main(String[] args) throws IOException {
		test1 nm = new test1();
		Scanner scanner  = new Scanner(System.in);
		while(true) {
			String input = scanner.nextLine();
			String a = nm.chat(input);
			String b = "\"" + a + "\"\n";
			System.out.println(a);
			input = "\"" + input + "\",";
			nm.writeFile(input);
			nm.writeFile(b);
			if (input.equals("bye")) {
				break;
			}
		}

	}

	@Override
	public String chat(String a) {
		String[] question = {"happy", "hello", "old", "name", "bye"};
		String[] answer = {"it's dope, man", "hey ya", "take a guess", "it's confidential", "see ya"};
		String ans = "";
		for(int i =0; i < question.length; i++) {
			if(a.contains(question[i])){
				ans = answer[i];
				break;
			} else {
				ans = "lol";
			}
		}
		return ans;
	}

	@Override
	public void writeFile(String a) throws IOException  {
		FileWriter output = new FileWriter("C:\\Users\\KBH\\Desktop\\chat.csv", true);
		output.write(a);
		System.lineSeparator();
		output.close();
	}

}



