package Example14;

public class k05_InputData {
	public int[] k05_numarr, k05_korarr, k05_engarr, k05_matharr, k05_sumarr;
	public double[] k05_avgarr;
	public String[] k05_namearr;
	// ��ȣ, �̸�, ����, ����, ����� �����ϱ����� �迭����

	public k05_InputData(int k05_iPerson) {
		k05_numarr = new int[k05_iPerson];
		k05_namearr = new String[k05_iPerson];
		k05_korarr = new int[k05_iPerson];
		k05_engarr = new int[k05_iPerson];
		k05_matharr = new int[k05_iPerson];
		k05_sumarr = new int[k05_iPerson];
		k05_avgarr = new double[k05_iPerson];	
		for(int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			String k05_name = String.format("ȫ��%02d",k05_i);
			int k05_kor = (int)(Math.random() *100);
			int k05_eng = (int)(Math.random() *100);
			int k05_math = (int)(Math.random() *100);
			k05_SetData(k05_i, k05_name , k05_kor,k05_eng,k05_math);	
		}
		//����� ����� �Է¹޾� ����� ������´� ũ���� �迭����		
		// �����Լ��� �̿��ؼ� kor, eng, math�� ������ ���������ϰ� InputData Ŭ������ SetData�� ������ �־���
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
		k05_avgarr[k05_a] = k05_avg; // �̸� ������ �Է¹޾Ƽ� �迭�� �����ϰ� �հ�� ����� ���ؼ� �迭�� ����
	}	
	public int k05_subsum(int[] k05_arr, int k05_iPerson) {
		int k05_totalsum = 0;
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			k05_totalsum = k05_totalsum + k05_arr[k05_i]; 
		} // ������ �迭�� �޾� ��������ؼ� �װ����� �������ϱ�
		return k05_totalsum;
	}	
	public double k05_subavg(int[] k05_arr, int k05_iPerson) {
		double k05_totalavg = 0;
		for (int k05_i = 0; k05_i < k05_iPerson; k05_i++) {
			k05_totalavg = k05_totalavg + k05_arr[k05_i]; 
		} // ������ �迭�� �޾� ��� �����ؼ� �� ������ �������ϱ�
		k05_totalavg = k05_totalavg / k05_iPerson; // ������ ������ ������� ������ ��ձ��ϱ�
		return k05_totalavg;
	}

}