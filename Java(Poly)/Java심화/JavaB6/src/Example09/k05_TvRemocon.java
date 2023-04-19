package Example09;

public class k05_TvRemocon {
    static int k05_Channel = 120; // 현재 채널 120채널로 선언
	static int k05_Vol = 30; // 현재 볼륨 30으로 선언
	
	public static void k05_VolUp(int k05_a) {
		k05_Vol = k05_Vol + k05_a;	
	} // 호출되었을때 ()안의 값만큼 Vol을 +해주는 메소드
	
	public static void k05_VolDown(int k05_a) {
		k05_Vol = k05_Vol + k05_a;		
	} // 호출되었을때 ()안의 값만큼 Vol을 -해주는 메소드
	
	public static void k05_ChannelUp(int k05_a) {
		k05_Channel = k05_Channel + k05_a;
	} // 호출되었을때 ()안의 값만큼 Channel을 +해주는 메소드
	
	public static void k05_ChannelDown(int k05_a) {
		k05_Channel = k05_Channel - k05_a;
	} // 호출되었을때 ()안의 값만큼 Channel을 -해주는 메소드

}
