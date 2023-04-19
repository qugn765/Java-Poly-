package Example14;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class example14a {

	public static void main(String[] args) {
		Calendar k05_cal = Calendar.getInstance();  //cal 현재날짜받아오기
		SimpleDateFormat k05_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 현재시간 data형식
		int k05_iPerson = 30; // 사람인원 선언
		k05_InputData k05_inData = new k05_InputData(k05_iPerson); // 객체생성
		int k05_korsum = k05_inData.k05_subsum(k05_inData.k05_korarr, k05_iPerson);       // kor과목 총합점수
		int k05_engsum = k05_inData.k05_subsum(k05_inData.k05_engarr, k05_iPerson);       // eng과목 총합점수
		int k05_mathsum = k05_inData.k05_subsum(k05_inData.k05_matharr, k05_iPerson);     // math과목 총합점수
		double k05_koravg = k05_inData.k05_subavg(k05_inData.k05_korarr, k05_iPerson);    // kor과목 평균점수
		double k05_engavg = k05_inData.k05_subavg(k05_inData.k05_engarr, k05_iPerson);    // eng과목 평균점수
		double k05_mathavg = k05_inData.k05_subavg(k05_inData.k05_matharr, k05_iPerson);  // math 과목 평균점수
		System.out.printf("                  성적집계표\n");
		System.out.printf("                            출력일자 : %s\n", k05_dt.format(k05_cal.getTime()));
		System.out.printf("=======================================================================\n");
		System.out.printf("번호    이름          국어      영어      수학      총점      평균\n");
		System.out.printf("=======================================================================\n");
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			System.out.printf("%04d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.6s\n",
					k05_i, k05_inData.k05_namearr[k05_i], k05_inData.k05_korarr[k05_i], k05_inData.k05_engarr[k05_i], k05_inData.k05_matharr[k05_i], 
					k05_inData.k05_sumarr[k05_i], k05_inData.k05_avgarr[k05_i]);			
		} // 번호, 이름 국어 영어 수학 점수, 총점, 평균 모두 출력
		System.out.printf("=======================================================================\n");
		System.out.printf("합계            %10.10s%10.10s%10.10s%10.10s%10.10s\n",k05_korsum,k05_engsum,k05_mathsum,
				k05_korsum + k05_engsum + k05_mathsum, (k05_korsum + k05_engsum + k05_mathsum) / 3); // 각과목의 합계를 출력
		System.out.printf("평균              %8.8s  %8.8s  %8.8s  %8.8s  %8.8s",k05_koravg,k05_engavg,k05_mathavg,
				k05_koravg + k05_engavg + k05_mathavg, (k05_koravg + k05_engavg + k05_mathavg) / 3); // 각과목의 평균 출력

	}

}
