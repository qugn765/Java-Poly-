package Example09;

import java.util.ArrayList;

public class example09a {

	public static void main(String[] args) {
		int k05_iTestMAX = 50; // �迭�� ���� ���ڼ���
		ArrayList k05_iAL = new ArrayList();
		
		for(int k05_i = 0; k05_i < k05_iTestMAX; k05_i++) {
			k05_iAL.add((int)(Math.random() * 100));
		} //ArrayList�� �������� �߰�
		
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf(" ArrayList %d = %d\n", k05_i, k05_iAL.get(k05_i));
		} //ArrayList ���
		
		System.out.printf("************************************\n");
		k05_iAL.sort(null); // ArrayList ����
		
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf(" ArrayList %d = %d\n", k05_i, k05_iAL.get(k05_i));
		} //ArrayList ���
		
		
	}

}
