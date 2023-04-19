package Test1;

import java.util.ArrayList;
import java.util.Scanner;

public class test1a {
	public static final int SCISSORS = 0;
	public static final int ROCK = 1; 
	public static final int PAPER =2;

	/*		1. getRockPaperScissors() 함수를 선언하고 랜덤 함수를 통해 0, 1, 2를 return 받는다.[2점]
			2. main() 함수에 Integer형 arraylist인 mine, computer를 선언한다.[2점]
			3. SCISSORS는 0, ROCK은 1 PAPER는 2로 정의하고 변하지 않는 전역 변수 선언[1점]
			4. 컴퓨터(getRockPaperScissors())와 사용자가 겨뤄서 이길 때까지 무제한 수행되는 반복문 작성[2점]
			5. 이기는 조건은 일반적인 가위바위보와 동일하며 3번 비기면 사용자가 진것으로 간주하여 종료함[2점]
			6. 사용자는 nextInt()로 0,1,2만 낼 수 있고 전역변수의 것과 동일하며 조건문에서 전역변수를 활용해야 함[2점]
			7. 매회차마다 사용자의 것은 mine에 컴퓨터의 것은 computer에 저장함[2점]
			8. 게임이 종료되면 history를 integer로 보여줌[2점]


	 */
	public static void main(String[] args) {
		ArrayList<Integer> mine = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		int user = 0;
		int com = 0;
		while(true) {
			if (cnt == 3) {
				System.out.println("3times draw");
				break;
			} else {
				com = getRockPaperScissors();
				System.out.println(com);
				computer.add(com);
				user = 0;
				while(true) {
					System.out.println("ROCK SCISSORS PAPER");
					user = scanner.nextInt();
					if (user == ROCK || user ==SCISSORS || user == PAPER) {
						mine.add(user);
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
			System.out.println("Computer : " + computer);
			System.out.println("User     : " + mine);


		}



		public static int getRockPaperScissors() {
			int a = (int)(Math.random() * 3);

			return a;
		}

	}
