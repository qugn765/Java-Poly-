package Example02;

import java.io. *;

public class example02a {

	public static void FileWrite() throws IOException{
		File k05_f = new File("C:\\Users\\KBH\\out\\k05_text2.txt"); // ���ϰ�ü����
		BufferedWriter k05_bw = new BufferedWriter(new FileWriter(k05_f));
		//Buffered�� �̿��� ���Ͼ������� ��ü����
		
		k05_bw.write("�ȳ� ����");
		k05_bw.newLine();
		k05_bw.write("hello ���");
		k05_bw.newLine();
		//���Ͽ� ���� + �ٳ���
		
		k05_bw.close();// ���ϴݱ�
		
	}
	
	public static void FileRead() throws IOException{
		File k05_f = new File("C:\\Users\\KBH\\out\\k05_text2.txt"); //���ϰ�ü����
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		//Buffered�� �̿��� ������ �б����� ��ü����
		String k05_readtxt; // ���Ͽ��ִ� ���ڸ������������� ��������
		
		while((k05_readtxt = k05_br.readLine()) != null) { // �о�� �ؽ�Ʈ�� ���� �ƴ϶��
			System.out.printf("%s\n", k05_readtxt); // ������ ���پ� ���
		}
		
		k05_br.close(); // ���ϴݱ�
		
	}
	
	public static void main(String[] args) throws IOException{
		FileWrite(); // ���Ͼ���
		FileRead(); // ���� �б�
	}

}
