package Example08;

import java.util.ArrayList;

public class example08a {

	public static void main(String[] args) {		
		ArrayList k05_iAL = new ArrayList();		
		k05_iAL.add("abc");
		k05_iAL.add("abcd");
		k05_iAL.add("efga");
		k05_iAL.add("������0");
		k05_iAL.add("1234");
		k05_iAL.add("12rk34");
		//array list�� ������� ����
		
		System.out.printf("******************************\n");
		System.out.printf(" ���� ArraySize %d\n", k05_iAL.size());
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf("  ArrayList %d = %s\n",k05_i, k05_iAL.get(k05_i));
		} // arraylist���
		System.out.println("\n");
		
		
		k05_iAL.set(3, "������"); // 3�� arraylist ����
		System.out.printf("******************************\n");
		System.out.printf(" ���뺯�� ArraySize %d\n", k05_iAL.size());
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf("  ArrayList %d = %s\n",k05_i, k05_iAL.get(k05_i));
		} // arraylist���
		System.out.println("\n");
		
		
		k05_iAL.remove(4); // 4�� arraylist����
		System.out.printf("******************************\n");
		System.out.printf(" ���뺯�� ArraySize %d\n", k05_iAL.size());
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf("  ArrayList %d = %s\n",k05_i, k05_iAL.get(k05_i));
		} // arraylist���
		System.out.println("\n");
		
		
		k05_iAL.sort(null);
		System.out.printf("******************************\n");
		System.out.printf(" ����ƮSort ArraySize %d\n", k05_iAL.size());
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf("  ArrayList %d = %s\n",k05_i, k05_iAL.get(k05_i));
		} // arraylist���
		System.out.println("\n");
		
		
		k05_iAL.clear();
		System.out.printf("******************************\n");
		System.out.printf(" ����ƮSort ArraySize %d\n", k05_iAL.size());
		for (int k05_i = 0; k05_i < k05_iAL.size(); k05_i++) {
			System.out.printf("  ArrayList %d = %s\n\n",k05_i, k05_iAL.get(k05_i));
		} // arraylist���
		
		

	}

}
