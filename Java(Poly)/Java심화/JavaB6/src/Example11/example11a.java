package Example11;

public class example11a {

	public static void main(String[] args) {
		k05_TvRemoconX k05_remoconX;
		k05_remoconX = new k05_TvRemoconX();
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remoconX.k05_Channel, k05_remoconX.k05_Vol);
		k05_remoconX.k05_ChannelUp(10);
		// ChannelUp 10해주는 메소드  채널 +10
		System.out.printf("바뀐 채널은 : %s\n\n", k05_remoconX.k05_Channel); 
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remoconX.k05_Channel,k05_remoconX.k05_Vol);
		k05_remoconX.k05_VolDown(5);
		// VolDown 5해주는 메소드  볼륨 -5
		System.out.printf("바뀐 볼륨은 : %s\n\n", k05_remoconX.k05_Vol);
		
		k05_remoconX.k05_batterycheck();
		
	}

}