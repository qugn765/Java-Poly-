package P1;

import java.util.Scanner;

public class p1a {
	public static void main(String[] args) { 
		Fruits f = new Fruits();
		System.out.println(f.getName());
		System.out.println(f.getPrice());
		Fruits f2 = new Fruits("melon", 3000);
		System.out.println(f2.getName());
		System.out.println(f2.getPrice());

	}

}
























/*
 * Fruits apple; Fruits strawberry; Fruits grape; Fruits watermelon;
 * 
 * public static void main(String[] args) { p1a nm = new p1a();
 * nm.initializing(); while(true) { int num = nm.showMenu();
 * nm.showInformation(num);
 * 
 * 
 * } }
 * 
 * public void showInformation(int number) { String name = ""; int price = 0; if
 * (number ==1) { name = apple.getName(); price = apple.getPrice(); } else if
 * (number ==2) { name = strawberry.getName(); price = strawberry.getPrice(); }
 * else if (number ==3) { name = grape.getName(); price = grape.getPrice(); }
 * else if (number ==4) { name = watermelon.getName(); price =
 * watermelon.getPrice(); } System.out.println("This fruit is " + name + ", " +
 * "and the price of it is " + price); }
 * 
 * public void initializing() { apple = new Fruits("red apple", 1000);
 * strawberry = new Fruits("blue strawberry", 2000); grape = new
 * Fruits("white grape", 3000); watermelon = new Fruits("yellow watermelon",
 * 4000); grape.setPrice(4000); grape.setName("black grape");
 * 
 * }
 * 
 * 
 * 
 * public int showMenu() { Scanner scanner = new Scanner(System.in);
 * System.out.println("1. Apple"); System.out.println("2. Strawberry");
 * System.out.println("3. Grape"); System.out.println("4. Watermelon"); int num
 * = scanner.nextInt();
 * 
 * return num; }
 * 
 * }
 */

