package P0614;

import java.util.*;
class stack {
	public String solution(String s){
		String answer = "";
		String[] arr = s.split("");
		Stack<String> stackS = new Stack<>();
		for(String s1 : arr) {
			if(s1.equals(")")) {
				String a = "";
				while(true) {
					if(stackS.peek().equals("(")) {
						stackS.pop();
						break;
					}
					String as = stackS.pop();
					a = as + a;
				}
				int number = 0;
				if(stackS.peek().equals("(")) {
					number = 1;
				} else {
					number = Integer.parseInt(stackS.pop());
				}
				String aaa = "";
				for(int i = 0; i < number; i++) {
					aaa = aaa + a;
				}
				for(char s3 : aaa.toCharArray()) {
					String s4 = String.valueOf(s3);
					stackS.push(s4);
				}
			} else {
				stackS.push(s1);
			}
		}
		
		
		for(String ad : stackS) {
			answer= answer + ad;
		}

		return answer;
	}
	
	
	
	
	

	public static void main(String[] args){
		stack T = new stack();
		System.out.println(T.solution("3(a2(b))ef"));
		System.out.println(T.solution("2(ab)k3(bc)"));
		System.out.println(T.solution("2(ab3(((cd))))"));
		System.out.println(T.solution("2(2(ab)3(2(ac)))"));
		System.out.println(T.solution("3(ab2(sg))"));
	}
}