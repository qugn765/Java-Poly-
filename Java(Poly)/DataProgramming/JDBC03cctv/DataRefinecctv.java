package JDBC03cctv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataRefinecctv {

	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\KBH\\Input\\전국cctv표준데이터.csv");
		File f2 = new File("C:\\Users\\KBH\\out\\전국cctv표준데이터Refine.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
		String readtxt;
		
		if((readtxt = br.readLine()) == null) {
			System.out.println("빈파일입니다\n");
			return;
		} 
		
		String[] field_name = readtxt.split(",");
		int cnt = 1;
		bw.write("id,");
		for(int i = 0; i < field_name.length; i++) {
			bw.write(field_name[i]);
			if(i != (field_name.length - 1)) bw.write(",");
		}

		bw.newLine();
		
		
		while((readtxt = br.readLine()) != null){
			String[] field = readtxt.split(",");
			bw.write(cnt + ",");
			for(int i = 0; i < field.length; i++) {
				String fielda = field[i];
				bw.write(fielda);
				if(i != (field.length - 1)) bw.write(",");
			}
			cnt++;
			bw.newLine();
		}
	}

}
