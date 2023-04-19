package QueueExample1;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample1a {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);

	}

}
