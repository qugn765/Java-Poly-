package Example05;

public class k05_TvRemocon {
	static int k05_Channel = 120; // ���� ä�� 120ä�η� ����
	static int k05_Vol = 30; // ���� ���� 30���� ����
	
	public static void k05_VolUp() {
		k05_Vol = k05_Vol + 1;		
	} // ȣ��Ǿ����� Vol�� +1 ���ִ� �޼ҵ�
	
	public static void k05_VolDown() {
		k05_Vol = k05_Vol - 1;
	} // ȣ��Ǿ����� Vol�� -1 ���ִ� �޼ҵ�
	
	public static void k05_ChannelUp() {
		k05_Channel = k05_Channel + 1;
	} // ȣ��Ǿ����� Channel�� +1 ���ִ� �޼ҵ�
	
	public static void k05_ChannelDown() {
		k05_Channel = k05_Channel - 1;
	} // ȣ��Ǿ����� Channel�� -1 ���ִ� �޼ҵ�

}