package Example05;

public class example05a {

	public static void main(String[] args) {
		k05_TvRemocon k05_remocon;
		k05_remocon = new k05_TvRemocon();
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 10; k05_i++) {
			k05_remocon.k05_ChannelUp();
		} // ChannelUp �޼ҵ带 10��ȣ���ϴ� �ݺ��� ��� : ä�� +10
		System.out.printf("�ٲ� ä���� : %s\n\n", k05_remocon.k05_Channel); 
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 10; k05_i++) {
			k05_remocon.k05_ChannelDown();
		}// ChannelDown �޼ҵ带 10��ȣ���ϴ� �ݺ��� ��� : ä�� -10
		System.out.printf("�ٲ� ä���� : %s\n\n", k05_remocon.k05_Channel);
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 5; k05_i++) {
			k05_remocon.k05_VolUp();
		}// VolUp �޼ҵ带 5��ȣ���ϴ� �ݺ��� ��� : ���� +5
		System.out.printf("�ٲ� ������ : %s\n\n", k05_remocon.k05_Vol);
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 5; k05_i++) {
			k05_remocon.k05_VolDown();
		}// VolDown �޼ҵ带 5��ȣ���ϴ� �ݺ��� ��� : ���� -5
		System.out.printf("�ٲ� ������ : %s\n\n", k05_remocon.k05_Vol);
	}

}
