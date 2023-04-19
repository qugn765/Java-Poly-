package Example14;

public class k05_InputData {
	public int[] k05_numarr, k05_korarr, k05_engarr, k05_matharr, k05_sumarr;
	public double[] k05_avgarr;
	public String[] k05_namearr;
	// 번호, 이름, 점수, 총합, 평균을 저장하기위한 배열선언

	public k05_InputData(int k05_iPerson) {
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
	public int k05_subsum(int[] k05_arr, int k05_iPerson) {
		int k05_totalsum = 0;
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			k05_totalsum = k05_totalsum + k05_arr[k05_i]; 
		} // 과목의 배열을 받아 모두총합해서 그과목의 총점구하기
		return k05_totalsum;
	}	
	public double k05_subavg(int[] k05_arr, int k05_iPerson) {
		double k05_totalavg = 0;
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			k05_totalavg = k05_totalavg + k05_arr[k05_i]; 
		} // 과목의 배열을 받아 모두 총합해서 그 과목의 총점구하기
		k05_totalavg = k05_totalavg / k05_iPerson; // 과목의 총점을 사람으로 나누어 평균구하기
		return k05_totalavg;
	}

}