package p5_studentVote;

import java.util.*;

public class Solution5 {
	public String solution5(String[] votes, int k){
		HashMap <String,Integer> nH = new HashMap<>();
		String[] voter = new String[votes.length];
		String[] candidate = new String[votes.length];
		for(int i = 0; i < votes.length; i++) {
			String[] a = votes[i].split(" ");
			voter[i] = a[0];
			candidate[i] = a[1];
			nH.put(voter[i], nH.getOrDefault(voter[i],0));
		}
		
	
		String answer = " ";


		return answer;
	}

	public static void main(String[] args){
		Solution5 T = new Solution5();
		System.out.println(T.solution5(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution5(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
		System.out.println(T.solution5(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
		System.out.println(T.solution5(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
	}
}