package p5_studentVote;

import java.util.*;
public class mycode5 {
	public String solution5(String[] votes, int k){
		String answer = " ";
		

		return answer;
	}

	public static void main(String[] args){
		mycode5 T = new mycode5();
		System.out.println(T.solution5(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution5(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
		System.out.println(T.solution5(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution5(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
	}
}