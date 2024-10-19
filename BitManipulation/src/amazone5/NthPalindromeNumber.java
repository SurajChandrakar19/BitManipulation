package amazone5;

public class NthPalindromeNumber {
	public static void main(String[] args) {
		int n = 21;
		
		System.out.println(Integer.toBinaryString(nthPalindromeNumbert(n)));
		
		int len = 0;
		int count = 0;
		
		while(count < n) {
			len++;
			count = count + (int)Math.pow(2, (len-1)/2);
		}
		
		count = count - (int)Math.pow(2, (len-1)/2);
		
//		System.out.println("leng = " + len + "count = " + count );
		
		int element = n - count - 1;
		int ans = (1 << (len-1)) | (element << (len/2));
		
//		System.out.println("elements = " + element + "ans = " + ans);
//		System.out.println(reverseAns(n, len));
		
		ans = ans | reverseAns(ans, len);
		
		System.out.println(Integer.toBinaryString(ans));
	}

	private static int nthPalindromeNumbert(int n) {
		int length = 0;
		int count = 0;
		
		while(count < n) {
			length++;
			count += Math.pow(2, (length-1)/2);
		}
		
		count -= Math.pow(2, (length-1)/2);
		
//		System.out.println("leng = " + length + "count = " + count );
		
		int element = n - count - 1;
		
		int ans = (1<<element) | (element << (length/2));
		
//		System.out.println("elements = " + element + "ans = " + ans);
//		System.out.println(reverseAns(n, length));
		
		int revers = reversAns(ans, length);
		
		ans = ans | revers;
		
		return ans;
	}

	private static int reversAns(int ans, int length) {
		int fBit = length-1;
		int lBit = 0;
		int reverse = 0;
		while(fBit > lBit) {
			if((ans & (1 << fBit)) != 0) {
				reverse = reverse | (1 << lBit);
			}
			if((ans & (1 << lBit)) != 0) {
				reverse = reverse | (1 << fBit);
			}
			fBit--;
			lBit++;
		}
		return reverse;
	}

	private static int reverseAns(int n, int len) {
		int f = len-1;
		int l = 0;
		int revers = 0;
		while(f > l) {
			if((n & (1 << f)) != 0) {
				revers = revers | (1 << l);
			}
			if((n & (1 << l)) != 0) {
				revers = revers | (1 << f);
			}
			f--;
			l++;
		}
		return revers;
	}
}
