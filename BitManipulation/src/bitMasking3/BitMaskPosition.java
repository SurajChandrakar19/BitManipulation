package bitMasking3;

public class BitMaskPosition {
	public static void main(String[] args) {
		int n = 36; //00010010
		int position = 3;
		
		int onMask = 1 << position;//00001000
		
		System.out.println(n | onMask);//00010010 | 00001000
	}
}
