package Example13;

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
		//����� ����� �Է¹޾� ����� ������´� ũ���� �迭����
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
		k05_avgarr[k05_a] = k05_avg;
		// �̸� ������ �Է¹޾Ƽ� �迭�� �����ϰ� �հ�� ����� ���ؼ� �迭�� ����
	}


}
