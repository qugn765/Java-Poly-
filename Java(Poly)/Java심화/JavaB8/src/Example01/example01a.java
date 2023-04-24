package Example01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class example01a {

	public static void main(String[] args) {
		try {
			File k05_f = new File("C:\\Users\\KBH\\out\\k05_text.txt"); // 파일 생성
			FileWriter k05_fw = new FileWriter(k05_f); // 파일 쓰기
			
			k05_fw.write("안녕 파일\n"); // 파일에 안녕파일 쓰기
			k05_fw.write("hello 헬로\n"); // 파일에 hello 헬로 쓰기
			
			k05_fw.close(); // 열린파일 닫기
			
			FileReader k05_fr = new FileReader(k05_f); // k05_text를 읽는 k05_fr 생성
			int k05_n = -1;
			char[] k05_ch;
			while(true) {
				k05_ch = new char[100]; //k05_text를 넣을 배열생성
				k05_n = k05_fr.read(k05_ch); //k05_text의 길이를 k05_n에 저장
				if(k05_n == -1) break; // k05_text가 비었다면 break
				
				for(int i  = 0; i < k05_n; i++) { 
					System.out.printf("%c",k05_ch[i]);
				} // k05_text를 저장한 k05_ch를 출력
			}
			k05_fr.close(); // 파일닫기
			System.out.printf("\nFILE READ END");
			
		} catch(Exception e){
			System.out.printf("나 에러[%s]\n",e); // 에러에 대해서 에러를 출력
		}
	}

}
