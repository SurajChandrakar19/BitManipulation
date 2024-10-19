package reverseBit4;

public class ReversingBitsOfUnsignedInteger {
	public static void main(String[] args) {
		
		int n = 1;
		
		int f = 31, l = 0;
		int rev = 0;
		
		while(f > l) {
			if((n & (1 << f)) != 0) {
				rev = rev | (1 << l);
			}
			
			if((n & (1 << l)) != 0) {
				rev = rev | (1 << f);
			}
			
			f--;
			l++;
		}
		
		System.out.println(rev);
	}
}
