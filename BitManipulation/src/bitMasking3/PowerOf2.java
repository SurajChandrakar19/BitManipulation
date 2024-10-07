package bitMasking3;

public class PowerOf2 {
	public static void main(String[] args) {
		int n = 128;
		//best way to write program big O(1)
		System.out.println(powOf2(n));
	}

	private static boolean powOf2(int n) {
		if(n == 0) {
			return false;
		}
		
		return (n & (n-1)) == 0;
	}
}
