package p1_zipfile;

import java.util.*;
class mycode1 {
	public String solution1(String s){
		Stack<String> input = new Stack<>();
		ArrayList <String> qwer = new ArrayList<>();
		int flag = 0;
		String save = "";
		for(int i = 0; i < s.length(); i++) {
			String a = String.valueOf(s.charAt(i));
			input.push(a);
			if (a.equals(")")){
				String output = input.pop();
				while(true) {
					output = input.pop();
					System.out.println(output);
					if(output.equals("(")) {
						output = input.pop();
						int times = Integer.parseInt(output);
						for(int j = 0; j < times; j++) {
							for(int k = qwer.size() - 1; 0 <= k; k--) {
								save = save + qwer.get(k);
							}
						}
						input.push(save);
						break;
					}else {
						qwer.add(output);


					} 
				}
			}
		}
		String answer = "";
		return answer;
	}

	public static void main(String[] args){
		mycode1 T = new mycode1();
		System.out.println(T.solution1("3(a2(b))ef"));
		System.out.println(T.solution1("2(ab)k3(bc)"));
		System.out.println(T.solution1("2(ab3((cd)))"));
		System.out.println(T.solution1("2(2(ab)3(2(ac)))"));
		System.out.println(T.solution1("3(ab2(sg))"));
	}
}