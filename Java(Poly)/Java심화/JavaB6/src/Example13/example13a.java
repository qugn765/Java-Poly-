package Example13;

public class example13a {

	public static void main(String[] args) {
		int k05_iPerson = 19;
		k05_InputData k05_inData = new k05_InputData(k05_iPerson);
				
		for(int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("ȫ��%02d",k05_i);
			int k05_kor = (int)(Math.random() *100);
			int k05_eng = (int)(Math.random() *100);
			int k05_math = (int)(Math.random() *100);
			k05_inData.k05_SetData(k05_i, k05_name , k05_kor,k05_eng,k05_math);			
		}// �����Լ��� �̿��ؼ� kor, eng, math�� ������ ���������ϰ� InputData Ŭ������ SetData�� ������ �־���
		
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			System.out.printf("��ȣ: %02d, �̸�: %2.2s, ����: %02d, ����: %02d, ����: %02d, ����: %d, ���: %f\n",
					k05_i, k05_inData.k05_namearr[k05_i], k05_inData.k05_korarr[k05_i], k05_inData.k05_engarr[k05_i], k05_inData.k05_matharr[k05_i], 
					k05_inData.k05_sumarr[k05_i], k05_inData.k05_avgarr[k05_i]);
		} // ����� �迭�� ����Ǿ����� Ȯ���ϱ� ���ؼ� �迭���

	}

}
