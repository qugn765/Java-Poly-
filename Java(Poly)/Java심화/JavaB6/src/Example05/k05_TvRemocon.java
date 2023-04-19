package Example05;

public class k05_TvRemocon {
	static int k05_Channel = 120; // 현재 채널 120채널로 선언
	static int k05_Vol = 30; // 현재 볼륨 30으로 선언
	
	public static void k05_VolUp() {
		k05_Vol = k05_Vol + 1;		
	} // 호출되었을때 Vol을 +1 해주는 메소드
	
	public static void k05_VolDown() {
		k05_Vol = k05_Vol - 1;
	} // 호출되었을때 Vol을 -1 해주는 메소드
	
	public static void k05_ChannelUp() {
		k05_Channel = k05_Channel + 1;
	} // 호출되었을때 Channel을 +1 해주는 메소드
	
	public static void k05_ChannelDown() {
		k05_Channel = k05_Channel - 1;
	} // 호출되었을때 Channel을 -1 해주는 메소드

}