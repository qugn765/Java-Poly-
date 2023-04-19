package P9;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class p09a {
	public static final int SCISSORS = 0;
	public static final int ROCK = 1; 
	public static final int PAPER =2;

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> mine = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String inputtime = format.format(time);
		FileWriter output = new FileWriter("C:\\Users\\KBH\\Desktop\\rock.txt", true);
		String start1 = "Start";
		output.write(start1);
		output.write(inputtime + "\n");
		int cnt = 0;
		int user = 0;
		int com = 0;
		while(true) {
			
			if (cnt == 3) {
				System.out.println("3times draw");
				break;
			} else {
				com = getRockPaperScissors();
				computer.add(com);
				user = 0;
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("ROCK SCISSORS PAPER");
					user = scanner.nextInt();
					if (user == ROCK || user ==SCISSORS || user == PAPER) {
						mine.add(user);
						String a = "\"" + com + "," + user + "\"\n";
						output.write(a);
						break;
					} else {
						String a = "\"" + com + "," + user + "\"\n";
						output.write(a);
						break;
					}
				}
				
				boolean a = (com== SCISSORS && user== ROCK) || (com== ROCK && user == PAPER) || (com== PAPER && user == SCISSORS);
				if (a){
					System.out.println("User Win");
					break;
				}  else if (com == user){
					System.out.println("Draw");
					cnt ++;
					continue;
				} else {
					System.out.println("lose");
					continue;
				}
			}
		}
		String dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("Computer : " + computer);
		System.out.println("User     : " + mine);
		output.write(dateAndTime + "\n");
		String end1 = "End";
		output.write(end1);
		output.close();


	}



	public static int getRockPaperScissors() {
		int a = (int)(Math.random() * 3);

		return a;
	}

}
