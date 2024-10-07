package bitMasking3;

public class FindConsicutiveTherOrNot {

	public static void main(String[] args) {
		
		int n = 73;
		System.out.println(isConsecutive(n));
	}

	private static boolean isConsecutive(int n) {
		int mask = n << 1;
		if((n & mask) > 0) {
			return true;
		}
		return false;
	}

}
