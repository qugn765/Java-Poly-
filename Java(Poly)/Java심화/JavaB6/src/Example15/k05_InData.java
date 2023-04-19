package Example15;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k05_InData {

	public int[] k05_numarr, k05_korarr, k05_engarr, k05_matharr, k05_sumarr;
	public double[] k05_avgarr;
	public String[] k05_namearr;
	Calendar k05_cal = Calendar.getInstance();  //cal 현재날짜받아오기
	SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 현재시간 data형식

	public k05_InData(int k05_iPerson) {
		k05_numarr = new int[k05_iPerson];
		k05_namearr = new String[k05_iPerson];
		k05_korarr = new int[k05_iPerson];
		k05_engarr = new int[k05_iPerson];
		k05_matharr = new int[k05_iPerson];
		k05_sumarr = new int[k05_iPerson];
		k05_avgarr = new double[k05_iPerson];	
		for(int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("홍길%02d",k05_i);
			int k05_kor = (int)(Math.random() *100);
			int k05_eng = (int)(Math.random() *100);
			int k05_math = (int)(Math.random() *100);
			k05_SetData(k05_i, k05_name , k05_kor,k05_eng,k05_math);	
		}
		//사람의 명수를 입력받아 사람에 명수에맞는 크기의 배열생성		
		// 랜덤함수를 이용해서 kor, eng, math의 점수를 랜덤지정하고 InputData 클래스에 SetData에 변수를 넣어줌
	}
	public void k05_SetData(int k05_a, String k05_s, int k05_b, int k05_c, int k05_d) {
		int k05_sum = k05_b + k05_c + k05_d;
		double k05_avg = k05_sum / 3;
		k05_numarr[k05_a] = k05_a;
		k05_namearr[k05_a] = k05_s;
		k05_korarr[k05_a] = k05_b;
		k05_engarr[k05_a] = k05_c;
		k05_matharr[k05_a] = k05_d;
		k05_sumarr[k05_a] = k05_sum;
		k05_avgarr[k05_a] = k05_avg; // 이름 점수를 입력받아서 배열에 저장하고 합계와 평균을 구해서 배열에 저장
	}	

	public void k05_printData(int k05_iPerson) {
		int k05_korsum = 0; 
		int k05_korsum30 = 0;
		int k05_engsum = 0;
		int k05_engsum30 = 0;
		int k05_mathsum = 0;
		int k05_mathsum30 = 0;
		double k05_koravg = 0;
		double k05_koravg30 = 0;
		double k05_engavg = 0;
		double k05_engavg30 = 0;
		double k05_mathavg = 0;
		double k05_mathavg30 = 0;
		// 총점을 저장해줄 변수와 30개씩 끊어서 초기화해줄 합계와 평균 선언
		int k05_page = 1;


		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			if((k05_i % 30) == 0) {
				System.out.printf("                  성적집계표\n");
				System.out.printf("PAGE : %2d                           출력일자 : %s\n",k05_page, k05_dt.format(k05_cal.getTime()));
				System.out.printf("==================================================================\n");
				System.out.printf("번호    이름          국어      영어      수학      총점      평균\n");
				System.out.printf("==================================================================\n");
			} // 시작할때와 30개씩지났을때 출력
			System.out.printf("%04d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.6s\n",
					k05_i, k05_namearr[k05_i], k05_korarr[k05_i], k05_engarr[k05_i], k05_matharr[k05_i], 
					k05_sumarr[k05_i], k05_avgarr[k05_i]); //번호에맞는 이름 국어 영어 수학점수 총점 평균 출력
			
			k05_korsum30 = k05_korsum30 + k05_korarr[k05_i];	
			k05_engsum30 = k05_engsum30 + k05_engarr[k05_i];
			k05_mathsum30 = k05_mathsum30 + k05_matharr[k05_i];
			//30개씩 끊어서 저장하는 변수와 총합계를 저장하는 변수에 합계와 평균 계산
			
			if(((k05_i + 1) % 30) == 0 || k05_i == (k05_iPerson - 1)) {  // 30개가 지났을때와 마지막에는 30개가 안되도 출력
				k05_korsum = k05_korsum +k05_korsum30;
				k05_engsum = k05_engsum + k05_engsum30;
				k05_mathsum = k05_mathsum + k05_mathsum30;  //30개씩 구한값은 다시 초기화하기 때문에 누적에 추가저장
				k05_koravg30 = k05_korsum30 / ((k05_i % 30) + 1);
				k05_koravg = k05_korsum / (k05_i + 1);
				k05_engavg30 = k05_engsum30 / ((k05_i % 30) + 1);
				k05_engavg = k05_engsum / (k05_i + 1);
				k05_mathavg30 = k05_mathsum30 / ((k05_i % 30) + 1);
				k05_mathavg = k05_mathsum / (k05_i + 1); // 30개씩의 평균과 누적평균계산
				System.out.printf("==================================================================\n");
				System.out.printf("현재페이지\n");
				System.out.printf("합계            %10.10s%10.10s%10.10s%10.10s%10.10s\n"
						,k05_korsum30,k05_engsum30,k05_mathsum30, k05_korsum30 + k05_engsum30 + k05_mathsum30,
						(k05_korsum30 + k05_engsum30 + k05_mathsum30) / 3); // 각과목의 합계를 출력
				System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s  %8.8s\n"
						,k05_koravg30,k05_engavg30,k05_mathavg30, k05_koravg30 + k05_engavg30 + k05_mathavg30,
						(k05_koravg30 + k05_engavg30 + k05_mathavg30) / 3); // 각과목의 평균 출력
				k05_korsum30 = 0; k05_engsum30 = 0; k05_mathsum30 = 0;
				k05_koravg30 = 0; k05_engavg30 = 0; k05_mathavg30 = 0;  //30개씩 초기화해서 현재페이지를 계산하기 위해 초기화

				System.out.printf("==================================================================\n");
				System.out.printf("누적페이지\n");
				System.out.printf("합계            %10.10s%10.10s%10.10s%10.10s%10.10s\n"
						,k05_korsum,k05_engsum,k05_mathsum, k05_korsum + k05_engsum + k05_mathsum,
						(k05_korsum + k05_engsum + k05_mathsum) / 3); // 각과목의 합계를 출력
				System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s  %8.8s\n\n\n\n"
						,k05_koravg,k05_engavg,k05_mathavg, k05_koravg + k05_engavg + k05_mathavg,
						(k05_koravg + k05_engavg + k05_mathavg) / 3); // 각과목의 평균 출력
				k05_page++; // 다음페이지를 위해서 page + 1
			} // 30명씩 끊어서 1페이지에 합계 평균을 출력하기위한 조건문

		}
	}
}
