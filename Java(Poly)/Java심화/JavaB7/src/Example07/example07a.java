package Example07;

public class example07a {

	public static void main(String[] args) {
		int iPerson = 5;
		k05_OneRec[] k05_inData = new k05_OneRec[iPerson];
		
		
		k05_inData[0] = new k05_OneRec("ȫ��01",100,100,90); // ȫ��01 100 100 90�� �迭0��������
		k05_inData[1] = new k05_OneRec("ȫ��02",90,90,90); // �迭1���� ����
		k05_inData[2] = new k05_OneRec("ȫ��03",80,70,90); // �迭2���� ����
		k05_inData[3] = new k05_OneRec("ȫ��04",70,60,90); // �迭3���� ����
		k05_inData[4] = new k05_OneRec("ȫ��05",60,100,90); //�迭4���� ����
		for(int k05_i = 0; k05_i < k05_inData.length; k05_i++) {
			System.out.printf("�̸�: %s,  kor: %s,  eng: %s,  math:%s\n",
					k05_inData[k05_i].k05_name(),k05_inData[k05_i].k05_kor(),
					k05_inData[k05_i].k05_eng(),k05_inData[k05_i].k05_math());
		} // inData �迭�� ������ �̸� kor eng math ���� ���
		

		

	}

}
