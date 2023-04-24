package Example02;

import java.io. *;

public class example02a {

	public static void FileWrite() throws IOException{
		File k05_f = new File("C:\\Users\\KBH\\out\\k05_text2.txt"); // 파일객체생성
		BufferedWriter k05_bw = new BufferedWriter(new FileWriter(k05_f));
		//Buffered를 이용해 파일쓰기위한 객체생성
		
		k05_bw.write("안녕 파일");
		k05_bw.newLine();
		k05_bw.write("hello 헬로");
		k05_bw.newLine();
		//파일에 쓰기 + 줄내림
		
		k05_bw.close();// 파일닫기
		
	}
	
	public static void FileRead() throws IOException{
		File k05_f = new File("C:\\Users\\KBH\\out\\k05_text2.txt"); //파일객체생성
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		//Buffered를 이용해 파일을 읽기위한 객체생성
		String k05_readtxt; // 파일에있는 글자를가져오기위한 변수선언
		
		while((k05_readtxt = k05_br.readLine()) != null) { // 읽어올 텍스트가 빈값이 아니라면
			System.out.printf("%s\n", k05_readtxt); // 파일의 한줄씩 출력
		}
		
		k05_br.close(); // 파일닫기
		
	}
	
	public static void main(String[] args) throws IOException{
		FileWrite(); // 파일쓰기
		FileRead(); // 파일 읽기
	}

}
