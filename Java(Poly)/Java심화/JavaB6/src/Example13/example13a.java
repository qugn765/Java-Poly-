package Example13;

public class example13a {

	public static void main(String[] args) {
		int k05_iPerson = 19;
		k05_InputData k05_inData = new k05_InputData(k05_iPerson);
				
		for(int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("홍길%02d",k05_i);
			int k05_kor = (int)(Math.random() *100);
			int k05_eng = (int)(Math.random() *100);
			int k05_math = (int)(Math.random() *100);
			k05_inData.k05_SetData(k05_i, k05_name , k05_kor,k05_eng,k05_math);			
		}// 랜덤함수를 이용해서 kor, eng, math의 점수를 랜덤지정하고 InputData 클래스에 SetData에 변수를 넣어줌
		
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			System.out.printf("번호: %02d, 이름: %2.2s, 국어: %02d, 영어: %02d, 수학: %02d, 총점: %d, 평균: %f\n",
					k05_i, k05_inData.k05_namearr[k05_i], k05_inData.k05_korarr[k05_i], k05_inData.k05_engarr[k05_i], k05_inData.k05_matharr[k05_i], 
					k05_inData.k05_sumarr[k05_i], k05_inData.k05_avgarr[k05_i]);
		} // 제대로 배열에 저장되었는지 확인하기 위해서 배열출력

	}

}
