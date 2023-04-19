package Example06;

public class example06a {

	public static void main(String[] args) {
		k05_Cal cc = new k05_Cal();  // °´Ã¼»ý¼º
		
		System.out.printf("2°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc.k05_sum(1, 2));
		System.out.printf("3°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc.k05_sum(1, 2, 3));
		System.out.printf("4°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc.k05_sum(1, 2, 3, 4));
		System.out.printf("´õºíÇü µ¡¼ÀÀÌ È£ÃâµÊ [%f]\n", cc.k05_sum(1.3, 2.4));
 
		// k05_Cal Å¬·¡½º¿¡¼­ ¼±¾ðÇÑ k05_sum È£ÃâÈÄ Ãâ·Â
		
	}

}
