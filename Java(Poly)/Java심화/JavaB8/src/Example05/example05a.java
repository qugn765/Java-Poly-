package Example05;

import java.io.*;

public class example05a {

	public static void main(String[] args) throws IOException {
		File k05_f = new File("C:\\Users\\KBH\\Input\\THTSKS010H00.dat");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		
		String k05_readtxt;
		int k05_LineCnt = 0;
		int k05_n = -1;
		StringBuffer k05_s = new StringBuffer();
		
		while(true) {
			
			char[] k05_ch = new char[1000];
			
			k05_n = k05_br.read(k05_ch);
			
			if(k05_n == -1) break;
			
			for(char k05_c : k05_ch) {
				if(k05_c == '\n') {
					System.out.printf("[%s]***\n", k05_s.toString());
					k05_s.delete(0, k05_s.length());
				} else {
					k05_s.append(k05_c);
				}
			}
			k05_LineCnt++;
		}
		
		System.out.printf("[%s]***\n", k05_s.toString());
		k05_br.close();
	}

}
