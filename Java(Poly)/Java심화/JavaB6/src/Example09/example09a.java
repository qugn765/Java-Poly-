package Example09;

public class example09a {

	public static void main(String[] args) {
		k05_TvRemocon k05_remocon;
		k05_remocon = new k05_TvRemocon();
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_ChannelUp(10);
		// ChannelUp 10���ִ� �޼ҵ�  ä�� +10
		System.out.printf("�ٲ� ä���� : %s\n\n", k05_remocon.k05_Channel); 
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_ChannelDown(10);
		// ChannelDown 10���ִ� �޼ҵ�  ä�� -10
		System.out.printf("�ٲ� ä���� : %s\n\n", k05_remocon.k05_Channel);
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_VolUp(5);
		// VolUp 5���ִ� �޼ҵ�  ���� +5
		System.out.printf("�ٲ� ������ : %s\n\n", k05_remocon.k05_Vol);
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_VolDown(5);
		// VolDown 5���ִ� �޼ҵ�  ���� -5
		System.out.printf("�ٲ� ������ : %s\n\n", k05_remocon.k05_Vol);

	}

}
