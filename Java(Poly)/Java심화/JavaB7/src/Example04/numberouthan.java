package Example04;

public class numberouthan {
	
	public static String han(int k05_iNumVal) {
		
		String k05_sNumVal = String.valueOf(k05_iNumVal); // �������� 1001034567�� String ���ڿ��� ��ȯ
		String k05_sNumVoice =""; // ���ڿ� ����

		int k05_i = 0;
		int k05_j = k05_sNumVal.length()-1;
		String[] k05_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"}; // units{�� ��....��} �迭 ����
		String[] k05_unitX = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"}; // unitX{ , �� �� õ....�� ��} �迭 ����

		while(true) {
			if (k05_i >= k05_sNumVal.length()) break;	
			// iNumVal�� ������ŭ �����ߴٸ� while�� Ż��
			// iNumVal�� ������ ���ڵ��� substring���� �ɰ��� �ϳ��ϳ� units�� �迭�� ���� ���
			if (k05_sNumVal.substring(k05_i,k05_i + 1).equals("0")){
				if (k05_unitX[k05_j].equals("��")) {
					k05_sNumVoice = k05_sNumVoice + "" + k05_unitX[k05_j];
				}  // 0�̿��� ���� ��������� ������ ������ ��, ���� �����Ҷ��� ��,�� ������ sNumVoice�� ����
				else if (k05_unitX[k05_j].equals("��")) {
					if (k05_sNumVal.length() >= 8 && (!(k05_sNumVal.substring((k05_i - 3), k05_i+1).equals("0000")))) {
						k05_sNumVoice = k05_sNumVoice + "" + k05_unitX[k05_j];
					} else{
						k05_sNumVoice = k05_sNumVoice + "" + k05_unitX[k05_j];
					}
				}
				else {
				} // �����ڸ����� �ƴҶ��� �׳� �н�
			} // ���ڰ� 0�϶��� �ڿ� �ڸ����� �����������Ƿ� ��������������� ��, �� ó�� ������ ǥ���ϴ� �ڸ��϶��� ��,���� ����� �� �ְ� sNumVoice�� ������ ����
			else if (!(k05_sNumVal.substring(k05_i,k05_i + 1).equals("0"))) {
				k05_sNumVoice = k05_sNumVoice + k05_units[Integer.parseInt(k05_sNumVal.substring(k05_i, k05_i + 1))]
						+ k05_unitX[k05_j];                               
			} // ���ڰ� 0�� �ƴҶ��� sNumVoice�� ��� units�� ���ڹ����� unitX�� ������ ���� ����


			k05_i++; // while���� �ݺ��Ҷ����� i����
			k05_j--; // �� ���̸� �����ߴ� j�� �ϳ�������
		}
		
		return k05_sNumVoice;
	}


}
