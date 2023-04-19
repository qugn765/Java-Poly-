package ArrayListExample1;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListExample1a {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			int a = (int)(Math.random() * 10);
			String b = String.valueOf(a);
			name.add(b);
		}
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		Collections.reverse(name);
		System.out.println(name);

	}

}













/*
 * name.add("kim"); name.add("lee"); name.add("john"); name.add("kim");
 * 
 * System.out.println(name); System.out.println(name.size());
 * System.out.println(name.get(2));
 * 
 * name.remove(1); System.out.println(name);
 * 
 * name.set(1, "park"); System.out.println(name);
 * System.out.println(name.size());
 * 
 * name.add("lee"); System.out.println(name);
 * 
 * Collections.reverse(name); System.out.println(name);
 * 
 * Collections.sort(name); System.out.println(name);
 * 
 * Collections.reverse(name); System.out.println(name);
 */