package Example06;

public class example06a {

	public static void main(String[] args) {
		int[] k05_iArray = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//�迭 ����
		for(int k05_i = 0; k05_i < k05_iArray.length; k05_i++) {
			System.out.printf("iArray[%d] = %d\n", k05_i, k05_iArray[k05_i]);
		} // �迭���
		
		//Maxã��
		int k05_iMax = k05_iArray[0];
		int k05_iMaxPt = 0;
		for(int k05_i = 0; k05_i < k05_iArray.length; k05_i++) {
			if(k05_iMax < k05_iArray[k05_i]) {
				k05_iMax = k05_iArray[k05_i]; // �ִ밪�� ����
				k05_iMaxPt = k05_i; // ������ �ִ밪�� �迭��ȣ�� ����
			}
		}
		
		System.out.printf("Max : iArray[%d] = %d\n", k05_iMaxPt, k05_iMax);
		// ������ �迭��ȣ�� �ִ밪�� ���
	}

}
