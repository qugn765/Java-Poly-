package Example09;

public class k05_TvRemocon {
    static int k05_Channel = 120; // ���� ä�� 120ä�η� ����
	static int k05_Vol = 30; // ���� ���� 30���� ����
	
	public static void k05_VolUp(int k05_a) {
		k05_Vol = k05_Vol + k05_a;	
	} // ȣ��Ǿ����� ()���� ����ŭ Vol�� +���ִ� �޼ҵ�
	
	public static void k05_VolDown(int k05_a) {
		k05_Vol = k05_Vol + k05_a;		
	} // ȣ��Ǿ����� ()���� ����ŭ Vol�� -���ִ� �޼ҵ�
	
	public static void k05_ChannelUp(int k05_a) {
		k05_Channel = k05_Channel + k05_a;
	} // ȣ��Ǿ����� ()���� ����ŭ Channel�� +���ִ� �޼ҵ�
	
	public static void k05_ChannelDown(int k05_a) {
		k05_Channel = k05_Channel - k05_a;
	} // ȣ��Ǿ����� ()���� ����ŭ Channel�� -���ִ� �޼ҵ�

}
