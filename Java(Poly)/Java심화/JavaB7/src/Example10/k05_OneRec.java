package Example10;

public class k05_OneRec {
	public int k05_studentid;
	public String k05_name;
	public int k05_kor, k05_eng, k05_math;
	// �������� ����
	
	public k05_OneRec(int k05_studentid, String k05_name, int k05_kor, int k05_eng, int k05_math) {
		this.k05_studentid = k05_studentid;
		this.k05_name = k05_name;
		this.k05_kor = k05_kor;
		this.k05_eng = k05_eng;
		this.k05_math = k05_math;
		//�Է¹��� ���� ���������� ����
	}
	

	public int k05_studentid() { return this.k05_studentid;};
	public String k05_name() { return this.k05_name;};
	public int k05_kor() { return this.k05_kor;};
	public int k05_eng() { return this.k05_eng;};
	public int k05_math() { return this.k05_math;};
	public int k05_sum() {return this.k05_kor + this.k05_eng + this.k05_math;};
	public double k05_avg() {return this.k05_sum()/3.0;}
    //���������� ����Ȱ��� �̿��ؼ� �޼ҵ带 �̿��� return����

}
