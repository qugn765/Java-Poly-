package Example11;

public class example11a {

	public static void main(String[] args) {
		k05_TvRemoconX k05_remoconX;
		k05_remoconX = new k05_TvRemoconX();
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remoconX.k05_Channel, k05_remoconX.k05_Vol);
		k05_remoconX.k05_ChannelUp(10);
		// ChannelUp 10���ִ� �޼ҵ�  ä�� +10
		System.out.printf("�ٲ� ä���� : %s\n\n", k05_remoconX.k05_Channel); 
		
		System.out.printf("���� ä�� : %s ���� ���� : %d\n",k05_remoconX.k05_Channel,k05_remoconX.k05_Vol);
		k05_remoconX.k05_VolDown(5);
		// VolDown 5���ִ� �޼ҵ�  ���� -5
		System.out.printf("�ٲ� ������ : %s\n\n", k05_remoconX.k05_Vol);
		
		k05_remoconX.k05_batterycheck();
		
	}

}