package Example10;

import java.util.ArrayList;


public class example10a {
	public static ArrayList<k05_OneRec> k05_arrL = new ArrayList<k05_OneRec>();
	public static int k05_iPerson = 10;
	static int k05_sumkor = 0;
	static int k05_sumeng = 0;
	static int k05_summath = 0;
	static int k05_sumtotal = 0;
	static int k05_sumavg = 0;
    // 전역변수 선언
	
	public static void main(String[] args) {
		k05_dataSet();
		k05_HeaderPrint();
		for(int k05_i = 0; k05_i < k05_arrL.size(); k05_i++) {
			k05_ItemPrint(k05_i);
		}
		k05_TailPrint();
		//메소드들 호출
	}

	
	
	
	public static void k05_dataSet() {
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("홍길%02d",k05_i);
			int k05_kor = (int)(Math.random()*100);
			int k05_eng = (int)(Math.random()*100);
			int k05_math = (int)(Math.random()*100);
			k05_arrL.add(new k05_OneRec(k05_i,k05_name,k05_kor,k05_eng,k05_math));
			// 이름 국어 영어 수학 점수를 받고 ArrayList인 arrL에 저장
		}
	}
	
	
	public static void k05_HeaderPrint() {
		System.out.printf("*********************************************\n");
		System.out.printf("%2s %5s %2s %2s %2s %2s    %2s\n","번호","이름","국어","영어","수학","합계","평균");
		System.out.printf("*********************************************\n");
	} // 위에 출력
	
	
	public static void k05_ItemPrint(int k05_i) {
		k05_OneRec k05_rec;
		
		k05_rec = k05_arrL.get(k05_i);
		System.out.printf("%4d %6s %3d %3d %3d   %3d    %6.2f\n",k05_rec.k05_studentid(),k05_rec.k05_name()
				,k05_rec.k05_kor(),k05_rec.k05_eng(),k05_rec.k05_math(),k05_rec.k05_sum(), k05_rec.k05_avg());
		k05_sumkor += k05_rec.k05_kor();
		k05_sumeng += k05_rec.k05_eng();
		k05_summath += k05_rec.k05_math();
		k05_sumtotal += k05_rec.k05_sum();
		k05_sumavg += k05_rec.k05_avg();
	// 총합과 평균을 구하기위해 누적해서 합계를 구하고 각각을 출력하는 메소드
	}
	
	public static void k05_TailPrint() {
		System.out.printf("*********************************************\n");
		System.out.printf("국어합계 %d      국어평균 :%6.2f\n",k05_sumkor, k05_sumkor/(double)k05_arrL.size());
		System.out.printf("영어합계 %d      국어평균 :%6.2f\n",k05_sumeng, k05_sumeng/(double)k05_arrL.size());
		System.out.printf("수학합계 %d      국어평균 :%6.2f\n",k05_summath, k05_summath/(double)k05_arrL.size());
		System.out.printf("*********************************************\n");
		System.out.printf("반평균합계  %d   반평균 :%6.2f\n", k05_sumavg, k05_sumavg/(double)k05_arrL.size());
		// 위해서 구한 합계를 출력하고 평균내는 메소드
		
	}
}
