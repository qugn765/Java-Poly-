package Example09;

public class example09a {

	public static void main(String[] args) {
		k05_TvRemocon k05_remocon;
		k05_remocon = new k05_TvRemocon();
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_ChannelUp(10);
		// ChannelUp 10해주는 메소드  채널 +10
		System.out.printf("바뀐 채널은 : %s\n\n", k05_remocon.k05_Channel); 
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_ChannelDown(10);
		// ChannelDown 10해주는 메소드  채널 -10
		System.out.printf("바뀐 채널은 : %s\n\n", k05_remocon.k05_Channel);
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_VolUp(5);
		// VolUp 5해주는 메소드  볼륨 +5
		System.out.printf("바뀐 볼륨은 : %s\n\n", k05_remocon.k05_Vol);
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		k05_remocon.k05_VolDown(5);
		// VolDown 5해주는 메소드  볼륨 -5
		System.out.printf("바뀐 볼륨은 : %s\n\n", k05_remocon.k05_Vol);

	}

}
