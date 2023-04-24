package Example04;

import java.io.*;

public class example04b {

	public static void main(String[] args) throws IOException {
		
		File k05_f = new File("C:\\Users\\KBH\\Input\\전국공영주차장정보.txt");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// 전국무료와이파이정보.csv 파일을 k05_f라는 객체생성
		
		String k05_readtxt; // 데이터를 출력하기위해 저장할 변수 선언
		
		if((k05_readtxt = k05_br.readLine()) == null) {
			System.out.printf("빈 파일입니다\n");
			return;
		} //비어있는파일 일때 빈파일입니다를 출력
		
		
		double k05_lat = 37.3860521;
		double k05_lng = 127.1214038;
		
		String[] k05_field_name = k05_readtxt.split("\t"); // 첫번째 줄을 ,단위로 나눠서 fieldname에 저장
		int k05_LineCnt = 1;	 // 첫번째 항목을 1번째로 하기위해서 1로 선언
		double k05_min = Double.MAX_VALUE;
		int k05_min_index = 0;
		String k05_min_Parking = "";
		
		double k05_max = Double.MIN_VALUE;
		int k05_max_index = 0;
		String k05_max_Parking = "";
		
		while((k05_readtxt = k05_br.readLine()) != null) {
			String[] k05_field = k05_readtxt.split("\t"); // 두번째줄이후의 값들을 한줄씩 배열로저장
			System.out.printf("**[%d번째 항목]****************************\n", k05_LineCnt);
			System.out.printf("%s : %s\n", k05_field_name[1], k05_field[1]); // 9번째 값인 주소출력
			System.out.printf("%s : %s\n", k05_field_name[2], k05_field[2]); // 13번째 값인 위도출력
			System.out.printf("%s : %s\n", k05_field_name[3], k05_field[3]); // 14번째 값인 경도출력			
			double k05_dist = Math.sqrt(Math.pow(Double.parseDouble(k05_field[2])- k05_lat, 2) 
					+ Math.pow(Double.parseDouble(k05_field[3]) -k05_lng ,2));
			// 지금위치의 위도와 경도, 파일의 위도경도를 이용해 거리계산			
			k05_min = Math.min(k05_min, k05_dist);
			if(k05_min == k05_dist) {
				k05_min_index = k05_LineCnt;
				k05_min_Parking = k05_field[1];
			}
			k05_max = Math.max(k05_max, k05_dist);
			if(k05_max == k05_dist) {
				k05_max_index = k05_LineCnt;
				k05_max_Parking = k05_field[1];
			}		
			System.out.printf("현재 지점과 거리 : %f\n", k05_dist); // 거리출력
			System.out.printf("******************************************\n");
			k05_LineCnt++; // 한줄끝날때마다 1씩추가
		}
		
		System.out.println();
		System.out.printf("최소거리 : %f   %d번째 주차장 : %s\n", k05_min, k05_min_index, k05_min_Parking);
		System.out.printf("최대거리 : %f   %d번째 주차장 : %s\n", k05_max, k05_max_index, k05_max_Parking);
		
	}

}
