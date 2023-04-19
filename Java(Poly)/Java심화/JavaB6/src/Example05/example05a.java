package Example05;

public class example05a {

	public static void main(String[] args) {
		k05_TvRemocon k05_remocon;
		k05_remocon = new k05_TvRemocon();
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 10; k05_i++) {
			k05_remocon.k05_ChannelUp();
		} // ChannelUp 메소드를 10번호출하는 반복문 결과 : 채널 +10
		System.out.printf("바뀐 채널은 : %s\n\n", k05_remocon.k05_Channel); 
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 10; k05_i++) {
			k05_remocon.k05_ChannelDown();
		}// ChannelDown 메소드를 10번호출하는 반복문 결과 : 채널 -10
		System.out.printf("바뀐 채널은 : %s\n\n", k05_remocon.k05_Channel);
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 5; k05_i++) {
			k05_remocon.k05_VolUp();
		}// VolUp 메소드를 5번호출하는 반복문 결과 : 볼륨 +5
		System.out.printf("바뀐 볼륨은 : %s\n\n", k05_remocon.k05_Vol);
		
		System.out.printf("현재 채널 : %s 현재 볼륨 : %d\n",k05_remocon.k05_Channel,k05_remocon.k05_Vol);
		for(int k05_i = 0; k05_i < 5; k05_i++) {
			k05_remocon.k05_VolDown();
		}// VolDown 메소드를 5번호출하는 반복문 결과 : 볼륨 -5
		System.out.printf("바뀐 볼륨은 : %s\n\n", k05_remocon.k05_Vol);
	}

}
