package Example01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class example01a {

	public static void main(String[] args) {
		try {
			File k05_f = new File("C:\\Users\\KBH\\out\\k05_text.txt"); // ���� ����
			FileWriter k05_fw = new FileWriter(k05_f); // ���� ����
			
			k05_fw.write("�ȳ� ����\n"); // ���Ͽ� �ȳ����� ����
			k05_fw.write("hello ���\n"); // ���Ͽ� hello ��� ����
			
			k05_fw.close(); // �������� �ݱ�
			
			FileReader k05_fr = new FileReader(k05_f); // k05_text�� �д� k05_fr ����
			int k05_n = -1;
			char[] k05_ch;
			while(true) {
				k05_ch = new char[100]; //k05_text�� ���� �迭����
				k05_n = k05_fr.read(k05_ch); //k05_text�� ���̸� k05_n�� ����
				if(k05_n == -1) break; // k05_text�� ����ٸ� break
				
				for(int i  = 0; i < k05_n; i++) { 
					System.out.printf("%c",k05_ch[i]);
				} // k05_text�� ������ k05_ch�� ���
			}
			k05_fr.close(); // ���ϴݱ�
			System.out.printf("\nFILE READ END");
			
		} catch(Exception e){
			System.out.printf("�� ����[%s]\n",e); // ������ ���ؼ� ������ ���
		}
	}

}
