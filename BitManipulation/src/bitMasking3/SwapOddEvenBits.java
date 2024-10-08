package bitMasking3;

public class SwapOddEvenBits {

	public static void main(String[] args) {
		
		int n = 181;
		System.out.println(swapOddEven(n));

	}

	private static int swapOddEven(int n) {
		int even = n & 0xaaaaaaaa;
		int odd = n & 0x55555555;
		even = even >>>1;
		odd = odd << 1;
		int ans = even | odd;
		return ans;
	}

}
