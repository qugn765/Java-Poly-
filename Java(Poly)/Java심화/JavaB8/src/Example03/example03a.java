package Example03;

import java.io.*;

public class example03a {

	public static void main(String[] args) throws IOException {
		
		File k05_f = new File("C:\\Users\\KBH\\Input\\전국무료와이파이정보.csv");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// 전국무료와이파이정보.csv 파일을 k05_f라는 객체생성
		
		String k05_readtxt; // 데이터를 출력하기위해 저장할 변수 선언
		
		if((k05_readtxt = k05_br.readLine()) == null) {
			System.out.printf("빈 파일입니다\n");
			return;
		} //비어있는파일 일때 빈파일입니다를 출력
		
		String[] k05_field_name = k05_readtxt.split(","); // 첫번째 줄을 ,단위로 나눠서 fieldname에 저장
		int LineCnt = 1; // 첫번째 항목을 1번째로 하기위해서 1로 선언
		
		while((k05_readtxt = k05_br.readLine()) != null) {
			String[] k05_field = k05_readtxt.split(","); // 두번째줄이후의 값들을 배열로저장
			System.out.printf("**[%d번째 항목]****************************\n", LineCnt);
			for(int j = 0; j < k05_field_name.length; j++) {
				System.out.printf(" %s : %s\n", k05_field_name[j], k05_field[j]);
			} // 처음저장했던 fieldname과 field값들을 같이 출력
			
			System.out.printf("******************************************\n");
			if(LineCnt == 100) break; // 100개까지만 출력
			LineCnt++; // 한줄끝날때마다 1씩추가
		}
		
	}

}
