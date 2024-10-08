package bitMasking3;

public class TrailingZerosInBinary {

	public static void main(String[] args) {
		
		int n = 128;
		//trailing zeros means right side how many zeros are there in binary
		//Time complexity is Big O(1)
		System.out.println(numberOfTrailingZeros(n));
		
	}

	private static int numberOfTrailingZeros(int n) {
		
		return (int) (Math.log10((n & (n-1) ^ n)) / Math.log10(2));
	}

}
