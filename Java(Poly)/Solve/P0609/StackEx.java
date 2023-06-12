package P0609;

import java.util.Stack;

public class StackEx {

	boolean solution(String s) {
		Stack<String> stack = new Stack<>();
		String[] arr1 = s.split("");
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i].equals("(")){
				stack.push("(");
			} else if(arr1[i].equals(")")){
				if(stack.isEmpty()) return false;
				String a = stack.pop();
				if(a.equals("("));
				else return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		StackEx s = new StackEx();
		System.out.println(s.solution("()()"));
		System.out.println();
		System.out.println(s.solution("((()))()"));
		System.out.println();
		System.out.println(s.solution(")()("));
		System.out.println();
		System.out.println(s.solution("(()("));
	}

}