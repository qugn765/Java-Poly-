package P2;

public class P_2 {

	public static void main(String[] args) {
		String text = "I am a boy";
		int k=0;
		String text2 = "";
		for(int i = 0; i < text.length(); i++) {		
			k = (int)text.charAt(i); 
			
			if((64<k)&&(k<91)) {
				text2 = text2  + (char)(k+32);
			} else if((96<k)&&(k<123)) {
				text2 = text2 + (char)(k-32);
			} else {
				text2 = text2 + (char)k;
			}

		}
		System.out.println(text);
		System.out.println(text2);			

	}
}		
